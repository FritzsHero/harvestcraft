package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.harvestcraft;

import net.minecraft.block.BlockTorch;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBlockCandle extends BlockTorch
{
  private final String name = "Candle1";


  public ItemBlockCandle()
  {
    setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
    GameRegistry.registerBlock(this, name);
    setUnlocalizedName(name);
    setCreativeTab(harvestcraft.modTab);
  }


  public String getName()
  {
    return name;
  }
}
