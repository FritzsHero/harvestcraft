package com.pam.harvestcraft.gui;

import com.pam.harvestcraft.tileentity.TileEntityMarket;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;


public class MessageMarketBrowse implements IMessage, IMessageHandler<MessageMarketBrowse, IMessage>
{
  private int itemNum;
  private int x;
  private int y;
  private int z;
  

  public MessageMarketBrowse() {}
  

  public MessageMarketBrowse(int _itemNumber, int _x, int _y, int _z)
  {
    itemNum = _itemNumber;
    x = _x;
    y = _y;
    z = _z;
  }
  

  public void fromBytes(ByteBuf buf)
  {
    itemNum = buf.readInt();
    x = buf.readInt();
    y = buf.readInt();
    z = buf.readInt();
  }
  

  public void toBytes(ByteBuf buf)
  {
    buf.writeInt(itemNum);
    buf.writeInt(x);
    buf.writeInt(y);
    buf.writeInt(z);
  }
  

  public IMessage onMessage(MessageMarketBrowse message, MessageContext ctx)
  {
    EntityPlayerMP player = ctx.getServerHandler().playerEntity;
    
    BlockPos position = new BlockPos(message.x, message.y, message.z);
    TileEntity tile_entity = player.worldObj.getTileEntity(position);
    if ((tile_entity instanceof TileEntityMarket))
    {
      TileEntityMarket tileEntityMarket = (TileEntityMarket)tile_entity;
      tileEntityMarket.setBrowsingInfo(message.itemNum);
    }
    player.worldObj.markBlockForUpdate(position);
    return null;
  }
}
