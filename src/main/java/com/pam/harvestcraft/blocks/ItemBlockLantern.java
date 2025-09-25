package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.harvestcraft;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ItemBlockLantern extends BlockTorch
{
	private final String name = "Lantern";

    public ItemBlockLantern()
    {
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(name);
		setCreativeTab(harvestcraft.modTab);
        setLightLevel(1f);
        setLightOpacity(0);
    }

	public String getName()
	{
		return name;
	}
}
