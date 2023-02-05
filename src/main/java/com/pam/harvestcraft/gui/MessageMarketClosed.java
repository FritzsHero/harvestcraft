package com.pam.harvestcraft.gui;

import com.pam.harvestcraft.tileentity.TileEntityMarket;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;


public class MessageMarketClosed implements IMessage, IMessageHandler<MessageMarketClosed, IMessage>
{
  private int x;
  private int y;
  private int z;
  

  public MessageMarketClosed() {}
  
  
  public MessageMarketClosed(int _x, int _y, int _z)
  {
    x = _x;
    y = _y;
    z = _z;
  }
  

  public void fromBytes(ByteBuf buf)
  {
    x = buf.readInt();
    y = buf.readInt();
    z = buf.readInt();
  }
  

  public void toBytes(ByteBuf buf)
  {
    buf.writeInt(x);
    buf.writeInt(y);
    buf.writeInt(z);
  }
  

  public IMessage onMessage(MessageMarketClosed message, MessageContext ctx)
  {
    EntityPlayerMP player = ctx.getServerHandler().playerEntity;
    BlockPos position = new BlockPos(message.x, message.y, message.z);
    TileEntity tile_entity = player.worldObj.getTileEntity(position);
    if ((tile_entity instanceof TileEntityMarket))
    {
      TileEntityMarket tileEntityMarket = (TileEntityMarket)tile_entity;
      
      if (tileEntityMarket.getStackInSlot(0) != null)
      {
        player.entityDropItem(tileEntityMarket.getStackInSlot(0), 1.0F);
        tileEntityMarket.setInventorySlotContents(0, null);
      }
      tileEntityMarket.setTrading(false);
    }
    player.worldObj.markBlockForUpdate(position);
    return null;
  }
}
