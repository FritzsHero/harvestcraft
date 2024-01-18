package com.pam.harvestcraft.worldgen;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;


public class LogFruitTreeWorldGen implements IWorldGenerator
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
			BushWorldWorldGen.generateAridGarden(world, random, xCh, yCh + 64, zCh);
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN)))
		{
			BushWorldWorldGen.generateFrostGarden(world, random, xCh, yCh + 64, zCh);
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FOREST)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SPOOKY)))
		{
			BushWorldWorldGen.generateShadedGarden(world, random, xCh, yCh + 64, zCh);
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SWAMP)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.RIVER)))
		{
			BushWorldWorldGen.generateSoggyGarden(world, random, xCh, yCh + 64, zCh);
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.JUNGLE)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.OCEAN)))
		{
			BushWorldWorldGen.generateTropicalGarden(world, random, xCh, yCh + 64, zCh);
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.PLAINS)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SAVANNA)))
		{
			BushWorldWorldGen.generateWindyGarden(world, random, xCh, yCh + 64, zCh);
		}
	}
}
