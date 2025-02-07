package com.pam.harvestcraft.gui;
 
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
 
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.pam.harvestcraft.proxy.PacketHandler;
import com.pam.harvestcraft.tileentity.TileEntityMarket;


public class GuiMarket extends GuiContainer
{
        private static final ResourceLocation gui = new ResourceLocation("harvestcraft:textures/gui/market.png");
 
        private GuiButton left, right;
        private GuiButton button_buy;
 
        private int itemNum;
 
        private ItemStack buySlot;
        private TileEntityMarket tileEntityMarket;
        private EntityPlayer player;
 

        public GuiMarket(InventoryPlayer inventoryplayer, TileEntityMarket _tileEntityMarket)
        {
                super(new ContainerMarket(inventoryplayer, _tileEntityMarket));
                tileEntityMarket = _tileEntityMarket;
        }
 

        @Override
        public void initGui()
        {
                super.initGui();
                Keyboard.enableRepeatEvents(false);
               
                buttonList.clear();
               
                int posX = width / 2 - 48;
                int posY = height / 2 - 48;
               
                left = new GuiButton(0, posX, posY - 21, 15, 20, "<");
                right = new GuiButton(1, posX + 16, posY - 21, 15, 20, ">");
                button_buy = new GuiButton(2, posX, posY + 1, 55, 20, "Buy");
               
                buttonList.add(left);
                buttonList.add(right);
                buttonList.add(button_buy);
               
                itemNum = tileEntityMarket.getBrowsingInfo();
        }
 

        @Override
        protected void actionPerformed(GuiButton guibutton)
        {
                if (!guibutton.enabled)
                {
                        return;
                }
                if (guibutton.id == 0)
                {
                        itemNum--;
                        if (itemNum < 0)
                        {
                                itemNum = MarketItems.getSize() - 1;
                        }
                        tileEntityMarket.setBrowsingInfo(itemNum);
                }
                if (guibutton.id == 1)
                {
                        itemNum++;
                        if (itemNum > MarketItems.getSize() - 1)
                        {
                                itemNum = 0;
                        }
                        tileEntityMarket.setBrowsingInfo(itemNum);
                }
                if (guibutton.id == 2)
                {
                        buySlot = tileEntityMarket.getStackInSlot(0);
                        if (buySlot != null)
                        {
                                MarketData data = MarketItems.getData(itemNum);
                                if( buySlot.getItem() == data.getCurrency().getItem())
                                {
                                	if (buySlot.getItemDamage() == data.getCurrency().getItemDamage())
                                        {
                                                int price = data.getPrice();
                                                if (buySlot.stackSize == price)
                                                {
                     
                                                        PacketHandler.INSTANCE.sendToServer(new MessageMarketBuy(itemNum, tileEntityMarket.xCoord, tileEntityMarket.yCoord, tileEntityMarket.zCoord, true));
                                                }
                                                else if (buySlot.stackSize > price && buySlot.stackSize > 1)
                                                {
                                                        PacketHandler.INSTANCE.sendToServer(new MessageMarketBuy(itemNum, tileEntityMarket.xCoord, tileEntityMarket.yCoord, tileEntityMarket.zCoord, false));
                                                }
                                                if (buySlot.stackSize == 0 && price == 1)
                                                {
                                                        PacketHandler.INSTANCE.sendToServer(new MessageMarketBuy(itemNum, tileEntityMarket.xCoord, tileEntityMarket.yCoord, tileEntityMarket.zCoord, true));
                                                }
                                        }
                                }
                        }
                }
        }

 
        @Override
        public void onGuiClosed()
        {
                PacketHandler.INSTANCE.sendToServer(new MessageMarketClosed(tileEntityMarket.xCoord, tileEntityMarket.yCoord, tileEntityMarket.zCoord));
                super.onGuiClosed();
        }
 

        @Override
        protected void drawGuiContainerForegroundLayer(int par1, int par2)
        {
                fontRendererObj.drawString("Inventory", 8, (ySize - 96) + 13, 4210752);
 
                GL11.glPushMatrix();
                RenderHelper.enableGUIStandardItemLighting();
                GL11.glDisable(GL11.GL_LIGHTING);
                GL11.glEnable(GL12.GL_RESCALE_NORMAL);
                GL11.glEnable(GL11.GL_COLOR_MATERIAL);
                GL11.glEnable(GL11.GL_LIGHTING);
                itemRender.zLevel = 100.0F;
 
                MarketData data = MarketItems.getData(itemNum);
               
                ItemStack item = data.getItem();
                itemRender.renderItemAndEffectIntoGUI(item, 73, 16);
                itemRender.renderItemOverlayIntoGUI(fontRendererObj, item, 73, 16, item.getDisplayName());
                //itemRender.renderItemOverlayIntoGUI(fontRendererObj, mc.getTextureManager(), item, 73, 16);
 
                ItemStack currency = data.getCurrency();
                itemRender.renderItemAndEffectIntoGUI(currency, 100, 16);
                itemRender.renderItemOverlayIntoGUI(fontRendererObj, currency, 100, 16, currency.getDisplayName());
                //itemRender.renderItemOverlayIntoGUI(fontRendererObj, mc.getTextureManager(), currency, 100, 16);
                itemRender.zLevel = 0.0F;
                GL11.glDisable(GL11.GL_LIGHTING);
 
                int price = data.getPrice();
                fontRendererObj.drawString("x" + Integer.toString(price), 116, 20, 0);
 
                GL11.glPopMatrix();
                GL11.glEnable(GL11.GL_LIGHTING);
                GL11.glEnable(GL11.GL_DEPTH_TEST);
                RenderHelper.enableStandardItemLighting();
        }
 

        @Override
        public void drawScreen(int par1, int par2, float par3)
        {
                super.drawScreen(par1, par2, par3);
                ItemStack item = MarketItems.getData(itemNum).getItem();
                //if (this.func_146978_c(73, 16, 16, 16, par1, par2))
                //{
                        //this.renderToolTip(item, par1, par2);
                //}
        }
 

        @Override
        protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
        {
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                mc.getTextureManager().bindTexture(gui);
                int l = (width - xSize) / 2;
                int i1 = (height - ySize) / 2;
                drawTexturedModalRect(l, i1 - 10, 0, 0, xSize, ySize + 21);
        }
}
