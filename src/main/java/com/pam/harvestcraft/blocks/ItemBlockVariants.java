package com.pam.harvestcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


public class ItemBlockVariants extends ItemBlock
{
	private final IBlockWithVariants blockWithVariants;


	public ItemBlockVariants(Block block)
	{
		super(block);
		blockWithVariants = (IBlockWithVariants) block;

		setMaxDamage(0);
		setHasSubtypes(true);
	}


	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}


	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return super.getUnlocalizedName() + "." + blockWithVariants.getVariantUnlocalizedName(stack);
	}
}
