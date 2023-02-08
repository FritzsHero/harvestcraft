package com.pam.harvestcraft.blocks;

import java.util.List;
import java.util.Random;

import com.pam.harvestcraft.harvestcraft;
import com.pam.harvestcraft.worldgen.FruitTreeGen;
import com.pam.harvestcraft.worldgen.FruitTreeWorldGen;
import com.pam.harvestcraft.worldgen.LogFruitTreeGen;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockPamSapling extends BlockBush implements IGrowable
{
	public String name;
	private BlockPlanks.EnumType woodType;
	private Block fruitType;
	private boolean isLogFruit = false;
	

	public BlockPamSapling(String name)
	{
		super();
		setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 0.8F, 0.9F);
		setCreativeTab(harvestcraft.modTab);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(name);
		setStepSound(Block.soundTypeGrass);
		setHardness(0.0F);
	}


	private void SetWoodAndFruit()
	{
		woodType = BlockPlanks.EnumType.JUNGLE;




		if (this == BlockRegistry.pamappleSapling)
		{
			woodType = BlockPlanks.EnumType.OAK;
			fruitType = BlockRegistry.pamApple;
		}
		else if (this == BlockRegistry.pamavocadoSapling)
		{
			woodType = BlockPlanks.EnumType.OAK;
			fruitType = BlockRegistry.pamAvocado;
		}
		else if (this == BlockRegistry.pamcherrySapling)
		{
			woodType = BlockPlanks.EnumType.OAK;
			fruitType = BlockRegistry.pamCherry;
		}
		else if (this == BlockRegistry.pamchestnutSapling)
		{
			woodType = BlockPlanks.EnumType.OAK;
			fruitType = BlockRegistry.pamChestnut;
		}
		else if (this == BlockRegistry.pamnutmegSapling)
		{
			woodType = BlockPlanks.EnumType.OAK;
			fruitType = BlockRegistry.pamNutmeg;
		}
		else if (this == BlockRegistry.pampearSapling)
		{
			woodType = BlockPlanks.EnumType.OAK;
			fruitType = BlockRegistry.pamPear;
		}
		else if (this == BlockRegistry.pamplumSapling)
		{
			woodType = BlockPlanks.EnumType.OAK;
			fruitType = BlockRegistry.pamPlum;
		}
		else if (this == BlockRegistry.pamwalnutSapling)
		{
			woodType = BlockPlanks.EnumType.OAK;
			fruitType = BlockRegistry.pamWalnut;
		}
		else if (this == BlockRegistry.pamgooseberrySapling)
		{
			woodType = BlockPlanks.EnumType.OAK;
			fruitType = BlockRegistry.pamGooseberry;
		}
		
		else if (this == BlockRegistry.pamalmondSapling)
		{
			fruitType = BlockRegistry.pamAlmond;
		}
		else if (this == BlockRegistry.pamapricotSapling)
		{
			fruitType = BlockRegistry.pamApricot;
		}
		else if (this == BlockRegistry.pambananaSapling)
		{
			fruitType = BlockRegistry.pamBanana;
		}
		else if (this == BlockRegistry.pamcashewSapling)
		{
			fruitType = BlockRegistry.pamCashew;
		}
		else if (this == BlockRegistry.pamcoconutSapling)
		{
			fruitType = BlockRegistry.pamCoconut;
		}
		else if (this == BlockRegistry.pamdateSapling)
		{
			fruitType = BlockRegistry.pamDate;
		}
		else if (this == BlockRegistry.pamdragonfruitSapling)
		{
			fruitType = BlockRegistry.pamDragonfruit;
		}
		else if (this == BlockRegistry.pamdurianSapling)
		{
			fruitType = BlockRegistry.pamDurian;
		}
		else if (this == BlockRegistry.pamfigSapling)
		{
			fruitType = BlockRegistry.pamFig;
		}
		else if (this == BlockRegistry.pamgrapefruitSapling)
		{
			fruitType = BlockRegistry.pamGrapefruit;
		}
		else if (this == BlockRegistry.pamlemonSapling)
		{
			fruitType = BlockRegistry.pamLemon;
		}
		else if (this == BlockRegistry.pamlimeSapling)
		{
			fruitType = BlockRegistry.pamLime;
		}
		else if (this == BlockRegistry.pammangoSapling)
		{
			fruitType = BlockRegistry.pamMango;
		}
		else if (this == BlockRegistry.pamoliveSapling)
		{
			fruitType = BlockRegistry.pamOlive;
		}
		else if (this == BlockRegistry.pamorangeSapling)
		{
			fruitType = BlockRegistry.pamOrange;
		}
		else if (this == BlockRegistry.pampapayaSapling)
		{
			fruitType = BlockRegistry.pamPapaya;
		}
		else if (this == BlockRegistry.pampeachSapling)
		{
			fruitType = BlockRegistry.pamPeach;
		}
		else if (this == BlockRegistry.pampecanSapling)
		{
			fruitType = BlockRegistry.pamPecan;
		}
		else if (this == BlockRegistry.pampeppercornSapling)
		{
			fruitType = BlockRegistry.pamPeppercorn;
		}
		else if (this == BlockRegistry.pampersimmonSapling)
		{
			fruitType = BlockRegistry.pamPersimmon;
		}
		else if (this == BlockRegistry.pampistachioSapling)
		{
			fruitType = BlockRegistry.pamPistachio;
		}
		else if (this == BlockRegistry.pampomegranateSapling)
		{
			fruitType = BlockRegistry.pamPomegranate;
		}
		else if (this == BlockRegistry.pamstarfruitSapling)
		{
			fruitType = BlockRegistry.pamStarfruit;
		}
		else if (this == BlockRegistry.pamvanillabeanSapling)
		{
			fruitType = BlockRegistry.pamVanillabean;
		}


		// Trees which have their wood as fruit
		else if (this == BlockRegistry.pamcinnamonSapling)
		{
			fruitType = BlockRegistry.pamCinnamon;
			isLogFruit = true;
		}
		else if (this == BlockRegistry.pammapleSapling)
		{
			woodType = BlockPlanks.EnumType.SPRUCE;
			fruitType = BlockRegistry.pamMaple;
			isLogFruit = true;
		}
		else if (this == BlockRegistry.pampaperbarkSapling)
		{
			fruitType = BlockRegistry.pamPaperbark;
			isLogFruit = true;
		}
	}

	
	public String getName()
	{
		return name;
	}


	@Override
	public boolean canPlaceBlockAt(World world, BlockPos pos)
	{
		Block soilBlock = world.getBlockState(pos.down()).getBlock();

		return isSuitableSoilBlock(soilBlock);
	}


	@Override
	public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighborBlock)
	{
		validatePosition(world, pos, state);
	}


	public void validatePosition(World world, BlockPos pos, IBlockState state)
	{
		if (!canPlaceBlockAt(world, pos))
		{
			dropBlockAsItem(world, pos, state, 0);

			world.setBlockToAir(pos);
		}
	}


	@Override
	public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
	{
		return null;
	}


	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}


	@Override
	public boolean isFullCube()
	{
		return false;
	}


	public boolean isSuitableSoilBlock(Block soilBlock)
	{
		return soilBlock == Blocks.grass || soilBlock == Blocks.dirt || soilBlock == Blocks.farmland;
	}
	

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		if (!worldIn.isRemote)
		{
			super.updateTick(worldIn, pos, state, rand);

			if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
			{
				grow(worldIn, pos, state, rand);
			}
		}
	}


	public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		GenerateTree(worldIn, pos, state, rand);
	}


	public void GenerateTree(World _worldIn, BlockPos _pos, IBlockState _state, Random _random) 
	{
		SetWoodAndFruit();


		if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(_worldIn, _random, _pos)) 
		{
			return;
		}
		_worldIn.setBlockToAir(_pos);
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, woodType);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, woodType).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = fruitType.getDefaultState();

		// Create a tree with wood as fruit
		if (isLogFruit)
		{
			if(!new LogFruitTreeGen(true, 5, a, b, false, c).generate(_worldIn, _random, _pos))
			{
				//Re-add the sapling if the tree failed to grow
				_worldIn.setBlockState(_pos, _state);
			}

			return;
		}

		// Create a normal tree with fruits
		if(!new FruitTreeGen(true, 5, a, b, false, c).generate(_worldIn, _random, _pos))
		{
			//Re-add the sapling if the tree failed to grow
			_worldIn.setBlockState(_pos, _state);
		}
    }


	/**
	 * Whether this IGrowable can grow
	 */
	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
	{
		return true;
	}


	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		return worldIn.rand.nextFloat() < 0.45D;
	}


	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		grow(worldIn, pos, state, rand);
	}


	@Override
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}


	@Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }
}
