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


public class FruitTreeGen extends WorldGenAbstractTree
{
    private final int minTreeHeight;
    private final boolean vinesGrow;
    private final IBlockState metaWood;
    private final IBlockState metaLeaves;
    private final IBlockState fruitType;
 

	public FruitTreeGen(boolean _isNotifying, int _minTreeHeight, IBlockState _woodType, IBlockState _leavesType, boolean _isVineGrowing, IBlockState _fruitType)
	{
        super(_isNotifying);
        minTreeHeight = _minTreeHeight;
        metaWood = _woodType;
        metaLeaves = _leavesType;
        vinesGrow = _isVineGrowing;
        fruitType = _fruitType;
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
                                        setBlockAndNotifyAdequately(worldIn, blockpos, metaLeaves);
                                        
                                        // Create the fruits
                                        if (worldIn.isAirBlock(blockpos2))
                                        {
                                        	if (worldIn.isAirBlock(blockpos3) && i3 > 2)
                                        	{
                                        		if (rand.nextInt(4) == 0)
                                        		{
                                        			setBlockAndNotifyAdequately(worldIn, blockpos2, fruitType);
                                        		}
                                        	}
                                        }
                                    }
                                }
                            }
                        }
                    }

                    for (int j3 = 0; j3 < treeHeight; ++j3)
                    {
                        BlockPos upN = position.up(j3);
                        Block block2 = worldIn.getBlockState(upN).getBlock();

                        if (block2.isAir(worldIn, upN) || block2.isLeaves(worldIn, upN) || block2.getMaterial() == Material.vine)
                        {
                            setBlockAndNotifyAdequately(worldIn, position.up(j3), metaWood);

                            if (vinesGrow && j3 > 0)
                            {
                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(position.add(-1, j3, 0)))
                                {
                                    func_181651_a(worldIn, position.add(-1, j3, 0), BlockVine.EAST);
                                }

                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(position.add(1, j3, 0)))
                                {
                                    func_181651_a(worldIn, position.add(1, j3, 0), BlockVine.WEST);
                                }

                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(position.add(0, j3, -1)))
                                {
                                    func_181651_a(worldIn, position.add(0, j3, -1), BlockVine.SOUTH);
                                }

                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(position.add(0, j3, 1)))
                                {
                                    func_181651_a(worldIn, position.add(0, j3, 1), BlockVine.NORTH);
                                }
                            }
                        }
                    }

                    if (vinesGrow)
                    {
                        for (int k3 = position.getY() - 3 + treeHeight; k3 <= position.getY() + treeHeight; ++k3)
                        {
                            int j4 = k3 - (position.getY() + treeHeight);
                            int k4 = 2 - j4 / 2;
                            BlockPos.MutableBlockPos blockpos$mutableblockpos1 = new BlockPos.MutableBlockPos();

                            for (int l4 = position.getX() - k4; l4 <= position.getX() + k4; ++l4)
                            {
                                for (int i5 = position.getZ() - k4; i5 <= position.getZ() + k4; ++i5)
                                {
                                    blockpos$mutableblockpos1.set(l4, k3, i5);

                                    if (worldIn.getBlockState(blockpos$mutableblockpos1).getBlock().isLeaves(worldIn,blockpos$mutableblockpos1))
                                    {
                                        BlockPos blockpos2 = blockpos$mutableblockpos1.west();
                                        BlockPos blockpos3 = blockpos$mutableblockpos1.east();
                                        BlockPos blockpos4 = blockpos$mutableblockpos1.north();
                                        BlockPos blockpos1 = blockpos$mutableblockpos1.south();

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos2).getBlock().isAir(worldIn,blockpos2))
                                        {
                                            func_181650_b(worldIn, blockpos2, BlockVine.EAST);
                                        }

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos3).getBlock().isAir(worldIn,blockpos3))
                                        {
                                            func_181650_b(worldIn, blockpos3, BlockVine.WEST);
                                        }

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos4).getBlock().isAir(worldIn,blockpos4))
                                        {
                                            func_181650_b(worldIn, blockpos4, BlockVine.SOUTH);
                                        }

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos1).getBlock().isAir(worldIn,blockpos1))
                                        {
                                            func_181650_b(worldIn, blockpos1, BlockVine.NORTH);
                                        }
                                    }
                                }
                            }
                        }

                        if (rand.nextInt(5) == 0 && treeHeight > 5)
                        {
                            for (int l3 = 0; l3 < 2; ++l3)
                            {
                                for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
                                {
                                    if (rand.nextInt(4 - l3) == 0)
                                    {
                                        EnumFacing enumfacing1 = enumfacing.getOpposite();
                                        func_181652_a(worldIn, rand.nextInt(3), position.add(enumfacing1.getFrontOffsetX(), treeHeight - 5 + l3, enumfacing1.getFrontOffsetZ()), enumfacing);
                                    }
                                }
                            }
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


    private void func_181652_a(World p_181652_1_, int p_181652_2_, BlockPos p_181652_3_, EnumFacing p_181652_4_)
    {
        setBlockAndNotifyAdequately(p_181652_1_, p_181652_3_, Blocks.cocoa.getDefaultState().withProperty(BlockCocoa.AGE, Integer.valueOf(p_181652_2_)).withProperty(BlockCocoa.FACING, p_181652_4_));
    }


    private void func_181651_a(World p_181651_1_, BlockPos p_181651_2_, PropertyBool p_181651_3_)
    {
        setBlockAndNotifyAdequately(p_181651_1_, p_181651_2_, Blocks.vine.getDefaultState().withProperty(p_181651_3_, Boolean.valueOf(true)));
    }


    private void func_181650_b(World p_181650_1_, BlockPos p_181650_2_, PropertyBool p_181650_3_)
    {
        func_181651_a(p_181650_1_, p_181650_2_, p_181650_3_);
        int i = 4;

        for (p_181650_2_ = p_181650_2_.down(); p_181650_1_.getBlockState(p_181650_2_).getBlock().isAir(p_181650_1_,p_181650_2_) && i > 0; --i)
        {
            func_181651_a(p_181650_1_, p_181650_2_, p_181650_3_);
            p_181650_2_ = p_181650_2_.down();
        }
    }
}
