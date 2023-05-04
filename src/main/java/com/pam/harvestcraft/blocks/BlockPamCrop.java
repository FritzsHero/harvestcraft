package com.pam.harvestcraft.blocks;

import java.util.List;
import java.util.Random;

import com.pam.harvestcraft.harvestcraft;
import com.pam.harvestcraft.item.ItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockPamCrop extends Block  implements IGrowable, net.minecraftforge.common.IPlantable
{
	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 3);
	

	public BlockPamCrop() 
	{
        super(Material.plants);
        setCreativeTab(harvestcraft.modTab);
        setTickRandomly(true);
        float f = 0.5F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        setHardness(1.0F);
        setStepSound(soundTypeGrass);
        disableStats();
        setDefaultState(blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)));
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
		return soilBlock == Blocks.farmland;
	}


	@Override
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return getDefaultState().withProperty(AGE, Integer.valueOf(meta));
	}


	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((Integer) state.getValue(AGE)).intValue();
	}


	@Override
	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] { AGE });
	}


	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        super.updateTick(worldIn, pos, state, rand);

        if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
        {
            int i = ((Integer)state.getValue(AGE)).intValue();

            if (i < 3)
            {
                float f = getGrowthChance(this, worldIn, pos);

                if (rand.nextInt((int)(50.0F / f) + 1) == 0)
                {
                    worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(i + 1)), 2);
                }
            }
        }
    }
	

	protected static float getGrowthChance(Block blockIn, World worldIn, BlockPos pos)
    {
        float f = 1.0F;
        BlockPos blockpos = pos.down();

        for (int i = -1; i <= 1; ++i)
        {
            for (int j = -1; j <= 1; ++j)
            {
                float f1 = 0.0F;
                IBlockState iblockstate = worldIn.getBlockState(blockpos.add(i, 0, j));

                if (iblockstate.getBlock().canSustainPlant(worldIn, blockpos.add(i, 0, j), net.minecraft.util.EnumFacing.UP, (net.minecraftforge.common.IPlantable)blockIn))
                {
                    f1 = 1.0F;

                    if (iblockstate.getBlock().isFertile(worldIn, blockpos.add(i, 0, j)))
                    {
                        f1 = 3.0F;
                    }
                }

                if (i != 0 || j != 0)
                {
                    f1 /= 4.0F;
                }

                f += f1;
            }
        }

        BlockPos blockpos1 = pos.north();
        BlockPos blockpos2 = pos.south();
        BlockPos blockpos3 = pos.west();
        BlockPos blockpos4 = pos.east();
        boolean flag = blockIn == worldIn.getBlockState(blockpos3).getBlock() || blockIn == worldIn.getBlockState(blockpos4).getBlock();
        boolean flag1 = blockIn == worldIn.getBlockState(blockpos1).getBlock() || blockIn == worldIn.getBlockState(blockpos2).getBlock();

        if (flag && flag1)
        {
            f /= 2.0F;
        }
        else
        {
            boolean flag2 = blockIn == worldIn.getBlockState(blockpos3.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.south()).getBlock() || blockIn == worldIn.getBlockState(blockpos3.south()).getBlock();

            if (flag2)
            {
                f /= 2.0F;
            }
        }

        return f;
    }
	

	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
    {
        return (worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos)) && worldIn.getBlockState(pos.down()).getBlock().canSustainPlant(worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
    }


	public void grow(World worldIn, BlockPos pos, IBlockState state)
    {
        int i = ((Integer)state.getValue(AGE)).intValue() + MathHelper.getRandomIntegerInRange(worldIn.rand, 2, 5);

        if (i > 3)
        {
            i = 3;
        }

        worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(i)), 2);
    }


	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
	{
		return ((Integer) state.getValue(AGE)).intValue() < 3;
	}


	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		return true;
	}


	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		grow(worldIn, pos, state);
	}
	
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		if (((Integer) state.getValue(AGE)).intValue() == 3)
		{
			if (worldIn.isRemote)
			{
				return true;
			}

			Block currentBlock = worldIn.getBlockState(pos).getBlock();
            ItemStack savedStack = GetStack(currentBlock);

            worldIn.setBlockState(pos, state.withProperty(AGE, 0), 3);
            EntityItem entityItem = new EntityItem(worldIn, playerIn.posX, playerIn.posY - 1D, playerIn.posZ, savedStack);
			worldIn.spawnEntityInWorld(entityItem);
			entityItem.onCollideWithPlayer(playerIn);
			return true;
		}
		return false;
	}


    private static ItemStack GetStack(Block _currentBlock)
    {
        if (_currentBlock == BlockRegistry.AgaveCrop) {
            return new ItemStack(ItemRegistry.AgaveItem);
        } else if (_currentBlock == BlockRegistry.AmaranthCrop) {
            return new ItemStack(ItemRegistry.AmaranthItem);
        } else if (_currentBlock == BlockRegistry.ArrowrootCrop) {
            return new ItemStack(ItemRegistry.ArrowrootItem);
        } else if (_currentBlock == BlockRegistry.CassavaCrop) {
            return new ItemStack(ItemRegistry.CassavaItem);
        } else if (_currentBlock == BlockRegistry.ChickpeaCrop) {
            return new ItemStack(ItemRegistry.ChickpeaItem);
        } else if (_currentBlock == BlockRegistry.ElderberryCrop) {
            return new ItemStack(ItemRegistry.ElderberryItem);
        } else if (_currentBlock == BlockRegistry.FlaxCrop) {
            return new ItemStack(ItemRegistry.FlaxItem);
        } else if (_currentBlock == BlockRegistry.GigaPickleCrop) {
            return new ItemStack(ItemRegistry.GigaPickleItem);
        } else if (_currentBlock == BlockRegistry.GreenGrapeCrop) {
            return new ItemStack(ItemRegistry.GreenGrapeItem);
        } else if (_currentBlock == BlockRegistry.HuckleberryCrop) {
            return new ItemStack(ItemRegistry.HuckleberryItem);
        } else if (_currentBlock == BlockRegistry.JicamaCrop) {
            return new ItemStack(ItemRegistry.JicamaItem);
        } else if (_currentBlock == BlockRegistry.JuniperberryCrop) {
            return new ItemStack(ItemRegistry.JuniperberryItem);
        } else if (_currentBlock == BlockRegistry.JuteCrop) {
            return new ItemStack(ItemRegistry.JuteItem);
        } else if (_currentBlock == BlockRegistry.KaleCrop) {
            return new ItemStack(ItemRegistry.KaleItem);
        } else if (_currentBlock == BlockRegistry.KenafCrop) {
            return new ItemStack(ItemRegistry.KenafItem);
        } else if (_currentBlock == BlockRegistry.KohlrabiCrop) {
            return new ItemStack(ItemRegistry.KohlrabiItem);
        } else if (_currentBlock == BlockRegistry.LentilCrop) {
            return new ItemStack(ItemRegistry.LentilItem);
        } else if (_currentBlock == BlockRegistry.MilletCrop) {
            return new ItemStack(ItemRegistry.MiletItem);
        } else if (_currentBlock == BlockRegistry.pamblackberryCrop) {
            return new ItemStack(ItemRegistry.blackberryItem);
        } else if (_currentBlock == BlockRegistry.pamblueberryCrop) {
            return new ItemStack(ItemRegistry.blueberryItem);
        } else if (_currentBlock == BlockRegistry.pamcandleberryCrop) {
            return new ItemStack(ItemRegistry.candleberryItem);
        } else if (_currentBlock == BlockRegistry.pamraspberryCrop) {
            return new ItemStack(ItemRegistry.raspberryItem);
        } else if (_currentBlock == BlockRegistry.pamstrawberryCrop) {
            return new ItemStack(ItemRegistry.strawberryItem);
        } else if (_currentBlock == BlockRegistry.pamcactusfruitCrop) {
            return new ItemStack(ItemRegistry.cactusfruitItem);
        } else if (_currentBlock == BlockRegistry.pamasparagusCrop) {
            return new ItemStack(ItemRegistry.asparagusItem);
        } else if (_currentBlock == BlockRegistry.pambarleyCrop) {
            return new ItemStack(ItemRegistry.barleyItem);
        } else if (_currentBlock == BlockRegistry.pamoatsCrop) {
            return new ItemStack(ItemRegistry.oatsItem);
        } else if (_currentBlock == BlockRegistry.pamryeCrop) {
            return new ItemStack(ItemRegistry.ryeItem);
        } else if (_currentBlock == BlockRegistry.pamcornCrop) {
            return new ItemStack(ItemRegistry.cornItem);
        } else if (_currentBlock == BlockRegistry.pambambooshootCrop) {
            return new ItemStack(ItemRegistry.bambooshootItem);
        } else if (_currentBlock == BlockRegistry.pamcantaloupeCrop) {
            return new ItemStack(ItemRegistry.cantaloupeItem);
        } else if (_currentBlock == BlockRegistry.pamcucumberCrop) {
            return new ItemStack(ItemRegistry.cucumberItem);
        } else if (_currentBlock == BlockRegistry.pamwintersquashCrop) {
            return new ItemStack(ItemRegistry.wintersquashItem);
        } else if (_currentBlock == BlockRegistry.pamzucchiniCrop) {
            return new ItemStack(ItemRegistry.zucchiniItem);
        } else if (_currentBlock == BlockRegistry.pambeetCrop) {
            return new ItemStack(ItemRegistry.beetItem);
        } else if (_currentBlock == BlockRegistry.pamonionCrop) {
            return new ItemStack(ItemRegistry.onionItem);
        } else if (_currentBlock == BlockRegistry.pamparsnipCrop) {
            return new ItemStack(ItemRegistry.parsnipItem);
        } else if (_currentBlock == BlockRegistry.pampeanutCrop) {
            return new ItemStack(ItemRegistry.peanutItem);
        } else if (_currentBlock == BlockRegistry.pamradishCrop) {
            return new ItemStack(ItemRegistry.radishItem);
        } else if (_currentBlock == BlockRegistry.pamrutabagaCrop) {
            return new ItemStack(ItemRegistry.rutabagaItem);
        } else if (_currentBlock == BlockRegistry.pamsweetpotatoCrop) {
            return new ItemStack(ItemRegistry.sweetpotatoItem);
        } else if (_currentBlock == BlockRegistry.pamturnipCrop) {
            return new ItemStack(ItemRegistry.turnipItem);
        } else if (_currentBlock == BlockRegistry.pamrhubarbCrop) {
            return new ItemStack(ItemRegistry.rhubarbItem);
        } else if (_currentBlock == BlockRegistry.pamceleryCrop) {
            return new ItemStack(ItemRegistry.celeryItem);
        } else if (_currentBlock == BlockRegistry.pamgarlicCrop) {
            return new ItemStack(ItemRegistry.garlicItem);
        } else if (_currentBlock == BlockRegistry.pamgingerCrop) {
            return new ItemStack(ItemRegistry.gingerItem);
        } else if (_currentBlock == BlockRegistry.pamspiceleafCrop) {
            return new ItemStack(ItemRegistry.spiceleafItem);
        } else if (_currentBlock == BlockRegistry.pamtealeafCrop) {
            return new ItemStack(ItemRegistry.tealeafItem);
        } else if (_currentBlock == BlockRegistry.pamcoffeebeanCrop) {
            return new ItemStack(ItemRegistry.coffeebeanItem);
        } else if (_currentBlock == BlockRegistry.pammustardseedsCrop) {
            return new ItemStack(ItemRegistry.mustardseedsItem);
        } else if (_currentBlock == BlockRegistry.pambroccoliCrop) {
            return new ItemStack(ItemRegistry.broccoliItem);
        } else if (_currentBlock == BlockRegistry.pamcauliflowerCrop) {
            return new ItemStack(ItemRegistry.cauliflowerItem);
        } else if (_currentBlock == BlockRegistry.pamleekCrop) {
            return new ItemStack(ItemRegistry.leekItem);
        } else if (_currentBlock == BlockRegistry.pamlettuceCrop) {
            return new ItemStack(ItemRegistry.lettuceItem);
        } else if (_currentBlock == BlockRegistry.pamscallionCrop) {
            return new ItemStack(ItemRegistry.scallionItem);
        } else if (_currentBlock == BlockRegistry.pamartichokeCrop) {
            return new ItemStack(ItemRegistry.artichokeItem);
        } else if (_currentBlock == BlockRegistry.pambrusselsproutCrop) {
            return new ItemStack(ItemRegistry.brusselsproutItem);
        } else if (_currentBlock == BlockRegistry.pamcabbageCrop) {
            return new ItemStack(ItemRegistry.cabbageItem);
        } else if (_currentBlock == BlockRegistry.pamspinachCrop) {
            return new ItemStack(ItemRegistry.spinachItem);
        } else if (_currentBlock == BlockRegistry.pambeanCrop) {
            return new ItemStack(ItemRegistry.beanItem);
        } else if (_currentBlock == BlockRegistry.pamsoybeanCrop) {
            return new ItemStack(ItemRegistry.soybeanItem);
        } else if (_currentBlock == BlockRegistry.pambellpepperCrop) {
            return new ItemStack(ItemRegistry.bellpepperItem);
        } else if (_currentBlock == BlockRegistry.pamchilipepperCrop) {
            return new ItemStack(ItemRegistry.chilipepperItem);
        } else if (_currentBlock == BlockRegistry.pameggplantCrop) {
            return new ItemStack(ItemRegistry.eggplantItem);
        } else if (_currentBlock == BlockRegistry.pamokraCrop) {
            return new ItemStack(ItemRegistry.okraItem);
        } else if (_currentBlock == BlockRegistry.pampeasCrop) {
            return new ItemStack(ItemRegistry.peasItem);
        } else if (_currentBlock == BlockRegistry.pamtomatoCrop) {
            return new ItemStack(ItemRegistry.tomatoItem);
        } else if (_currentBlock == BlockRegistry.pamcottonCrop) {
            return new ItemStack(ItemRegistry.cottonItem);
        } else if (_currentBlock == BlockRegistry.pampineappleCrop) {
            return new ItemStack(ItemRegistry.pineappleItem);
        } else if (_currentBlock == BlockRegistry.pamgrapeCrop) {
            return new ItemStack(ItemRegistry.grapeItem);
        } else if (_currentBlock == BlockRegistry.pamkiwiCrop) {
            return new ItemStack(ItemRegistry.kiwiItem);
        } else if (_currentBlock == BlockRegistry.pamcranberryCrop) {
            return new ItemStack(ItemRegistry.cranberryItem);
        } else if (_currentBlock == BlockRegistry.pamriceCrop) {
            return new ItemStack(ItemRegistry.riceItem);
        } else if (_currentBlock == BlockRegistry.pamseaweedCrop) {
            return new ItemStack(ItemRegistry.seaweedItem);
        } else if (_currentBlock == BlockRegistry.pamcurryleafCrop) {
            return new ItemStack(ItemRegistry.curryleafItem);
        } else if (_currentBlock == BlockRegistry.pamsesameseedsCrop) {
            return new ItemStack(ItemRegistry.sesameseedsItem);
        } else if (_currentBlock == BlockRegistry.pamwaterchestnutCrop) {
            return new ItemStack(ItemRegistry.waterchestnutItem);
        } else if (_currentBlock == BlockRegistry.pamwhitemushroomCrop) {
            return new ItemStack(ItemRegistry.whitemushroomItem);
        } else
            return new ItemStack(Items.wheat);
    }


	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		list.add(new ItemStack(itemIn, 1, 0));
		list.add(new ItemStack(itemIn, 1, 3));
	}


	@Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
		return net.minecraftforge.common.EnumPlantType.Crop;
    }


    @Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }
}
