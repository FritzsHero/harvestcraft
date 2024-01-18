package com.pam.harvestcraft.gui;

import com.pam.harvestcraft.tileentity.TileEntityMarket;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;


public class MessageMarketBuy implements IMessage, IMessageHandler<MessageMarketBuy, IMessage>
{
  private int itemNum;
  private int x;
  private int y;
  private int z;
  private boolean shouldClear;
  

  public MessageMarketBuy() {}
  

  public MessageMarketBuy(int _itemNumber, int _x, int _y, int _z, boolean _shouldClear)
  {
    itemNum = _itemNumber;
    x = _x;
    y = _y;
    z = _z;
    shouldClear = _shouldClear;
  }
  

  public void fromBytes(ByteBuf buf)
  {
    itemNum = buf.readInt();
    x = buf.readInt();
    y = buf.readInt();
    z = buf.readInt();
    shouldClear = buf.readBoolean();
  }
  

  public void toBytes(ByteBuf buf)
  {
    buf.writeInt(itemNum);
    buf.writeInt(x);
    buf.writeInt(y);
    buf.writeInt(z);
    buf.writeBoolean(shouldClear);
  }
  

  public IMessage onMessage(MessageMarketBuy message, MessageContext ctx)
  {
    EntityPlayerMP player = ctx.getServerHandler().playerEntity;
    
    BlockPos position = new BlockPos(message.x, message.y, message.z);
    net.minecraft.tileentity.TileEntity tile_entity = player.worldObj.getTileEntity(position);
    if ((tile_entity instanceof TileEntityMarket))
    {
      TileEntityMarket tileEntityMarket = (TileEntityMarket)tile_entity;
      MarketData data = MarketItems.getData(message.itemNum);
      int price = data.getPrice();
      
      if (message.shouldClear)
      {
        tileEntityMarket.clearInventory();
      }
      else
      {
        tileEntityMarket.takeEmeraldFromSlot(price);
      }
      
      EntityItem var14 = new EntityItem(player.worldObj, player.posX, player.posY + 1.0D, player.posZ, data.getItem().copy());
      player.worldObj.spawnEntityInWorld(var14);
    }
    return null;
  }
}
