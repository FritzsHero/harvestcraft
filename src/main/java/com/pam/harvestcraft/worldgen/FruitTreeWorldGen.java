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
				rarity = BlockRegistry.temperatefruittreeRarity;
				woodType = BlockPlanks.EnumType.OAK;

				switch (random.nextInt(9))
				{
				case 0: 
					fruitType = BlockRegistry.pamApple;
					break;
				case 1: 
					fruitType = BlockRegistry.pamAvocado;
					break;
				case 2: 
					fruitType = BlockRegistry.pamCherry;
					break;
				case 3: 
					fruitType = BlockRegistry.pamChestnut;
					break;
				case 4: 
					fruitType = BlockRegistry.pamNutmeg;
					break;
				case 5: 
					fruitType = BlockRegistry.pamPear;
					break;
				case 6: 
					fruitType = BlockRegistry.pamPlum;
					break;
				case 7: 
					fruitType = BlockRegistry.pamWalnut;
					break;
				case 8: 
					fruitType = BlockRegistry.pamGooseberry;
					break;
				}

				
				GenerateTree(world, random, xCh, yCh + 64, zCh);
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


				switch (random.nextInt(24))
				{
				case 0: 
					fruitType = BlockRegistry.pamBanana;
					break;
				case 1: 
					isLogFruit = true;
					fruitType = BlockRegistry.pamCinnamon;
					break;
				case 2: 
					fruitType = BlockRegistry.pamCoconut;
					break;
				case 3: 
					fruitType = BlockRegistry.pamDate;
					break;
				case 4: 
					fruitType = BlockRegistry.pamDragonfruit;
					break;
				case 5: 
					fruitType = BlockRegistry.pamPapaya;
					break;
				case 6: 
					fruitType = BlockRegistry.pamAlmond;
					break;
				case 7: 
					fruitType = BlockRegistry.pamApricot;
					break;
				case 8: 
					fruitType = BlockRegistry.pamCashew;
					break;
				case 9: 
					fruitType = BlockRegistry.pamDurian;
					break;
				case 10: 
					fruitType = BlockRegistry.pamFig;
					break;
				case 11: 
					fruitType = BlockRegistry.pamGrapefruit;
					break;
				case 12: 
					fruitType = BlockRegistry.pamLemon;
					break;
				case 13: 
					fruitType = BlockRegistry.pamLime;
					break;
				case 14: 
					fruitType = BlockRegistry.pamMango;
					break;
				case 15: 
					fruitType = BlockRegistry.pamOrange;
					break;
				case 16: 
					isLogFruit = true;
					fruitType = BlockRegistry.pamPaperbark;
					break;
				case 17: 
					fruitType = BlockRegistry.pamPeach;
					break;
				case 18: 
					fruitType = BlockRegistry.pamPecan;
					break;
				case 19: 
					fruitType = BlockRegistry.pamPeppercorn;
					break;
				case 20: 
					fruitType = BlockRegistry.pamPersimmon;
					break;
				case 21: 
					fruitType = BlockRegistry.pamPistachio;
					break;
				case 22: 
					fruitType = BlockRegistry.pamPomegranate;
					break;
				case 23: 
					fruitType = BlockRegistry.pamStarfruit;
					break;
				case 24: 
					fruitType = BlockRegistry.pamVanillabean;
				  	break;
				}


				GenerateTree(world, random, xCh, yCh + 64, zCh);
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
	

	public boolean GenerateTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, woodType);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, woodType).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = fruitType.getDefaultState();

		{
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
		}

		// Reset isLogFruit because it could cause issues
		isLogFruit = false;

		return false;
	}
}
