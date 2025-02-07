package com.pam.harvestcraft.worldgen;

import java.util.Random;

import com.pam.harvestcraft.blocks.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;


public class BushWorldWorldGen implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		final int xChunk = chunkX * 16 + 8, zChunk = chunkZ * 16 + 8;
		int xCh = chunkX * 16 + random.nextInt(16);
		int yCh = random.nextInt(128);
		int zCh = chunkZ * 16 + random.nextInt(16);

		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenerator(new BlockPos(xChunk + 16, 0, zChunk + 16));

		if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DEAD)) 
		{
			return;
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SANDY)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MESA)))
		{
			generateAridGarden(world, random, xCh, yCh + 64, zCh);
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN)))
		{
			generateFrostGarden(world, random, xCh, yCh + 64, zCh);
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FOREST)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SPOOKY)))
		{
			generateShadedGarden(world, random, xCh, yCh + 64, zCh);
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SWAMP)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.RIVER)))
		{
			generateSoggyGarden(world, random, xCh, yCh + 64, zCh);
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.JUNGLE)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.OCEAN)))
		{
			generateTropicalGarden(world, random, xCh, yCh + 64, zCh);
			//Do it again, since the spawn rate is so low, because of all the grass in jungle
			generateTropicalGarden(world, random, xCh, 64, zCh);
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.PLAINS)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SAVANNA)))
		{
			generateWindyGarden(world, random, xCh, yCh + 64, zCh);
		}
	}


	public static boolean generateAridGarden(World world, Random random, int x, int y, int z)
	{
		for (int tries = 0; tries < 32; tries++)
		{
			int i1 = (x + random.nextInt(8)) - random.nextInt(8);
			int j1 = (y + random.nextInt(4)) - random.nextInt(4);
			int k1 = (z + random.nextInt(8)) - random.nextInt(8);
			BlockPos pos = new BlockPos(i1, j1, k1);
			if (world.isAirBlock(pos) && Blocks.cactus.canBlockStay(world, pos))
			{
				world.setBlockState(pos, BlockRegistry.AridGardenBlock.getDefaultState(), 2);
			}
		}

		return true;
	}


	private static boolean GenerateGarden(World world, Random random, int x, int y, int z, Block _garden)
	{
		for (int tries = 0; tries < 32; tries++)
		{
			int i1 = (x + random.nextInt(8)) - random.nextInt(8);
			int j1 = (y + random.nextInt(4)) - random.nextInt(4);
			int k1 = (z + random.nextInt(8)) - random.nextInt(8);
			BlockPos pos = new BlockPos(i1, j1, k1);
			if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
			{
				world.setBlockState(pos, _garden.getDefaultState(), 2);
			}
		}

		return true;
	}
	

	public static boolean generateFrostGarden(World world, Random random, int x, int y, int z)
	{
		return GenerateGarden(world, random, x, y, z, BlockRegistry.FrostGardenBlock);
	}
	

	public static boolean generateShadedGarden(World world, Random random, int x, int y, int z)
	{
		return GenerateGarden(world, random, x, y, z, BlockRegistry.ShadedGardenBlock);
	}
	

	public static boolean generateSoggyGarden(World world, Random random, int x, int y, int z)
	{
		return GenerateGarden(world, random, x, y, z, BlockRegistry.SoggyGardenBlock);
	}


	public static boolean generateTropicalGarden(World world, Random random, int x, int y, int z)
	{
		return GenerateGarden(world, random, x, y, z, BlockRegistry.TropicalGardenBlock);
	}
	

	public static boolean generateWindyGarden(World world, Random random, int x, int y, int z)
	{
		return GenerateGarden(world, random, x, y, z, BlockRegistry.WindyGardenBlock);
	}
}
