package com.pam.harvestcraft.worldgen;

import java.util.Random;

import com.pam.harvestcraft.blocks.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;


public class FruitTreeWorldGen implements IWorldGenerator
{
	private BlockPlanks.EnumType woodType;
	private Block fruitType;
	private boolean isLogFruit;
	private int rarity;


	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		if(!BlockRegistry.isFruitTreeGenerationEnabled)
		{
			return;
		}

		isLogFruit = false;

		final int xChunk = chunkX * 16 + 8, zChunk = chunkZ * 16 + 8;
		int xCh = chunkX * 16 + random.nextInt(16);
		int yCh = random.nextInt(128);
		int zCh = chunkZ * 16 + random.nextInt(16);

		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenerator(new BlockPos(xChunk + 16, 0, zChunk + 16));

		if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DEAD)) 
		{
			return;
		}


		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FOREST)) 
				&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.COLD)) 
				&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SPOOKY)) 
				&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN)))		
		{
			{
				rarity = BlockRegistry.temperatefruittreeRarity / 2;
				woodType = BlockPlanks.EnumType.OAK;

				for(int i = 0; i < 9; i++)
				{
					fruitType = GetTemperateFruit(random);
					GenerateTree(world, random, xCh, yCh + 64, zCh);
				}
			}
		}
		
		if (((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.WET)) 
				&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.PLAINS))
				&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DRY))) 
				|| ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.HOT)) 
						&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.PLAINS)) 
						&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DRY))))
		{
			{
				rarity = BlockRegistry.tropicalfruittreeRarity;
				woodType = BlockPlanks.EnumType.JUNGLE;

				for(int i = 0; i < 18; i++)
				{
					fruitType = GetTropicalFruit(random);
					GenerateTree(world, random, xCh, yCh + 64, zCh);
				}
			}
		}

		
		if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SAVANNA))
		{
			rarity = BlockRegistry.tropicalfruittreeRarity;
			woodType = BlockPlanks.EnumType.JUNGLE;
			fruitType = BlockRegistry.pamOlive;
			GenerateTree(world, random, xCh, yCh + 64, zCh);
		}

		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY)) 
				|| (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN))
				|| (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.CONIFEROUS)))
		{
			rarity = BlockRegistry.tropicalfruittreeRarity;
			isLogFruit = true;
			woodType = BlockPlanks.EnumType.SPRUCE;
			fruitType = BlockRegistry.pamMaple;
			GenerateTree(world, random, xCh, yCh + 64, zCh);
		}
	}


	private Block GetTemperateFruit(Random _random)
	{
		switch (_random.nextInt(9))
		{
			case 0:
				return BlockRegistry.pamApple;
			case 1:
				return BlockRegistry.pamAvocado;
			case 2:
				return BlockRegistry.pamCherry;
			case 3:
				return BlockRegistry.pamChestnut;
			case 4:
				return BlockRegistry.pamNutmeg;
			case 5:
				return BlockRegistry.pamPear;
			case 6:
				return BlockRegistry.pamPlum;
			case 7:
				return BlockRegistry.pamWalnut;
			case 8:
				return BlockRegistry.pamGooseberry;
			default:
				return BlockRegistry.pamApple;
		}
	}


	private Block GetTropicalFruit(Random _random)
	{
		isLogFruit = false;

		switch (_random.nextInt(24))
		{
			case 0:
				return BlockRegistry.pamBanana;
			case 1:
				isLogFruit = true;
				return BlockRegistry.pamCinnamon;
			case 2:
				return BlockRegistry.pamCoconut;
			case 3:
				return BlockRegistry.pamDate;
			case 4:
				return BlockRegistry.pamDragonfruit;
			case 5:
				return BlockRegistry.pamPapaya;
			case 6:
				return BlockRegistry.pamAlmond;
			case 7:
				return BlockRegistry.pamApricot;
			case 8:
				return BlockRegistry.pamCashew;
			case 9:
				return BlockRegistry.pamDurian;
			case 10:
				return BlockRegistry.pamFig;
			case 11:
				return BlockRegistry.pamGrapefruit;
			case 12:
				return BlockRegistry.pamLemon;
			case 13:
				return BlockRegistry.pamLime;
			case 14:
				return BlockRegistry.pamMango;
			case 15:
				return BlockRegistry.pamOrange;
			case 16:
				isLogFruit = true;
				return BlockRegistry.pamPaperbark;
			case 17:
				return BlockRegistry.pamPeach;
			case 18:
				return BlockRegistry.pamPecan;
			case 19:
				return BlockRegistry.pamPeppercorn;
			case 20:
				return BlockRegistry.pamPersimmon;
			case 21:
				return BlockRegistry.pamPistachio;
			case 22:
				return BlockRegistry.pamPomegranate;
			case 23:
				return BlockRegistry.pamStarfruit;
			case 24:
				return BlockRegistry.pamVanillabean;
			default:
				return BlockRegistry.pamApple;
		}
	}
	

	public boolean GenerateTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, woodType);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, woodType).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = fruitType.getDefaultState();

		for (int tries = 0; tries < rarity; tries++)
		{
			int i1 = (x + random.nextInt(8)) - random.nextInt(8);
			int j1 = (y + random.nextInt(4)) - random.nextInt(4);
			int k1 = (z + random.nextInt(8)) - random.nextInt(8);
			BlockPos pos = new BlockPos(i1, j1, k1);
			if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
			{
				if(isLogFruit)
				{
					new LogFruitTreeGen(true, 5, a, b, c).generate(world, random, pos);
				}
				else
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);
				}
			}
		}

		// Reset isLogFruit because it could cause issues
		isLogFruit = false;

		return false;
	}
}
