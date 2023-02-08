package com.pam.harvestcraft.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCocoa;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;


public class LogFruitTreeGen extends WorldGenAbstractTree
{
    private final int minTreeHeight;
    private final IBlockState woodType;
    private final IBlockState leavesType;
    private final IBlockState fruitWoodType;
 

	public LogFruitTreeGen(boolean _isNotifying, int _minTreeHeight, IBlockState _woodType, IBlockState _leavesType, IBlockState _fruitWoodType)
	{
        super(_isNotifying);
        minTreeHeight = _minTreeHeight;
        woodType = _woodType;
        leavesType = _leavesType;
        fruitWoodType = _fruitWoodType;
	}


	public boolean generate(World worldIn, Random rand, BlockPos position)
    {
		int treeHeight = rand.nextInt(3) + minTreeHeight;
        boolean flag = true;

        if (position.getY() >= 1 && position.getY() + treeHeight + 1 <= 256)
        {
            for (int j = position.getY(); j <= position.getY() + 1 + treeHeight; ++j)
            {
                int k = 1;

                if (j == position.getY())
                {
                    k = 0;
                }

                if (j >= position.getY() + 1 + treeHeight - 2)
                {
                    k = 2;
                }

                BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

                for (int l = position.getX() - k; l <= position.getX() + k && flag; ++l)
                {
                    for (int i1 = position.getZ() - k; i1 <= position.getZ() + k && flag; ++i1)
                    {
                        if (j >= 0 && j < 256)
                        {
                            if (!isReplaceable(worldIn,blockpos$mutableblockpos.set(l, j, i1)))
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                BlockPos down = position.down();
                Block block1 = worldIn.getBlockState(down).getBlock();
                boolean isSoil = block1.canSustainPlant(worldIn, down, net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling)Blocks.sapling);

                if (isSoil && position.getY() < 256 - treeHeight - 1)
                {
                    block1.onPlantGrow(worldIn, down, position);
                    int k2 = 3;
                    int l2 = 0;

                    for (int i3 = position.getY() - k2 + treeHeight; i3 <= position.getY() + treeHeight; ++i3)
                    {
                        int i4 = i3 - (position.getY() + treeHeight);
                        int j1 = l2 + 1 - i4 / 2;

                        for (int k1 = position.getX() - j1; k1 <= position.getX() + j1; ++k1)
                        {
                            int l1 = k1 - position.getX();

                            for (int i2 = position.getZ() - j1; i2 <= position.getZ() + j1; ++i2)
                            {
                                int j2 = i2 - position.getZ();

                                if (Math.abs(l1) != j1 || Math.abs(j2) != j1 || rand.nextInt(2) != 0 && i4 != 0)
                                {
                                    BlockPos blockpos = new BlockPos(k1, i3, i2);
                                    BlockPos blockpos2 = new BlockPos(k1, i3 - 1, i2);
                                    BlockPos blockpos3 = new BlockPos(k1, i3 - 2, i2);
                                    Block block = worldIn.getBlockState(blockpos).getBlock();

                                    if (block.isAir(worldIn, blockpos) || block.isLeaves(worldIn, blockpos) || block.getMaterial() == Material.vine)
                                    {
                                        setBlockAndNotifyAdequately(worldIn, blockpos, leavesType);

                                    }
                                }
                            }
                        }
                    }

                    for (int j3 = 0; j3 < treeHeight; ++j3)
                    {
                        BlockPos upN = position.up(j3);
                        Block block2 = worldIn.getBlockState(upN).getBlock();

                        if (block2.isAir(worldIn, upN))
                        {
                        	setBlockAndNotifyAdequately(worldIn, position.up(j3), fruitWoodType);
                        }
                        if (block2.isLeaves(worldIn, upN))
                        {
                            // Necessary to stop leaf decay
                        	setBlockAndNotifyAdequately(worldIn, position.up(j3), woodType);
                        }

                    }
                    
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }
}
