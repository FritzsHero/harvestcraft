package com.pam.harvestcraft.blocks;

import com.google.common.base.Predicate;
import com.pam.harvestcraft.harvestcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ItemBlockLantern extends Block
{
	private final String name = "Lantern";
    public static final PropertyDirection FACING = PropertyDirection.create("facing", new Predicate<EnumFacing>()
    {
        public boolean apply(EnumFacing p_apply_1_)
        {
            return true;
        }
    });

    public ItemBlockLantern()
    {
        super(Material.circuits);
        setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
        setTickRandomly(true);
		setUnlocalizedName(name);
		setCreativeTab(harvestcraft.modTab);
        setLightLevel(1f);
        setLightOpacity(0);
		GameRegistry.registerBlock(this, name);
    }

	public String getName()
	{
		return name;
	}


    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
    {
        return null;
    }


    /// <summary> Used to determine ambient occlusion and culling when rebuilding chunks for render </summary>
    public boolean isOpaqueCube()
    {
        return false;
    }


    public boolean isFullCube()
    {
        return false;
    }


    private boolean canPlaceOn(World worldIn, BlockPos pos)
    {
        return true;
    }


    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        return true;
    }


    private boolean canPlaceAt(World worldIn, BlockPos pos, EnumFacing facing)
    {
        BlockPos blockpos = pos.offset(facing.getOpposite());
        boolean flag = facing.getAxis().isHorizontal();
        return flag && worldIn.isSideSolid(blockpos, facing, true) || facing.equals(EnumFacing.UP) && this.canPlaceOn(worldIn, blockpos);
    }


    /// <summary> Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the IBlockstate </summary>
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, facing);
    }


    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        this.checkForDrop(worldIn, pos, state);
    }


    /// <summary> Called when a neighboring block changes. </summary>
    public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
    {
        this.onNeighborChangeInternal(worldIn, pos, state);
    }


    protected boolean onNeighborChangeInternal(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!this.checkForDrop(worldIn, pos, state))
        {
            return true;
        }
        else
        {
            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);
            EnumFacing.Axis enumfacing$axis = enumfacing.getAxis();
            EnumFacing enumfacing1 = enumfacing.getOpposite();
            boolean flag = false;

            if (enumfacing$axis.isHorizontal() && !worldIn.isSideSolid(pos.offset(enumfacing1), enumfacing, true))
            {
                flag = true;
            }
            else if (enumfacing$axis.isVertical() && !this.canPlaceOn(worldIn, pos.offset(enumfacing1)))
            {
                flag = true;
            }

            if (flag)
            {
                this.dropBlockAsItem(worldIn, pos, state, 0);
                worldIn.setBlockToAir(pos);
                return true;
            }
            else
            {
                return false;
            }
        }
    }


    protected boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state)
    {
        return false;
    }


    /// <summary> Ray traces through the blocks collision from start vector to end vector returning a ray trace hit. </summary>
    public MovingObjectPosition collisionRayTrace(World worldIn, BlockPos pos, Vec3 start, Vec3 end)
    {
        EnumFacing enumfacing = (EnumFacing)worldIn.getBlockState(pos).getValue(FACING);
        float size = 0.2F;

        if (enumfacing == EnumFacing.EAST)
        {
            setBlockBounds(0.0F, 0F, 0.5F - size, size * 2.0F, 0.6F, 0.5F + size);
        }
        else if (enumfacing == EnumFacing.WEST)
        {
            setBlockBounds(1.0F - size * 2.0F, 0F, 0.5F - size, 1.0F, 0.6F, 0.5F + size);
        }
        else if (enumfacing == EnumFacing.SOUTH)
        {
            setBlockBounds(0.5F - size, 0F, 0.0F, 0.5F + size, 0.6F, size * 2.0F);
        }
        else if (enumfacing == EnumFacing.NORTH)
        {
            setBlockBounds(0.5F - size, 0F, 1.0F - size * 2.0F, 0.5F + size, 0.6F, 1.0F);
        }
        else if (enumfacing == EnumFacing.DOWN)
        {
            setBlockBounds(0.5F - size, 0.0F, 0.5F - size, 0.5F + size, 1F, 0.5F + size);
        }
        else
        {
            setBlockBounds(0.5F - size, 0.0F, 0.5F - size, 0.5F + size, 0.6F, 0.5F + size);
        }

        return super.collisionRayTrace(worldIn, pos, start, end);
    }

    
    /// <summary> Convert the given metadata into a BlockState for this Block </summary>
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState();

        switch (meta)
        {
            case 1:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.EAST);
                break;
            case 2:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.WEST);
                break;
            case 3:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.SOUTH);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.NORTH);
                break;
            case 5:
            default:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.UP);
                break;
            case 6:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.DOWN);
        }

        return iblockstate;
    }


    /// <summary> Convert the BlockState into the correct metadata value </summary>
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;

        switch ((EnumFacing)state.getValue(FACING))
        {
            case EAST:
                i = i | 1;
                break;
            case WEST:
                i = i | 2;
                break;
            case SOUTH:
                i = i | 3;
                break;
            case NORTH:
                i = i | 4;
                break;
            case UP:
            default:
                i = i | 5;
                break;
            case DOWN:
                i = i | 6;
        }

        return i;
    }


    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.CUTOUT;
    }


    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {FACING});
    }
}
