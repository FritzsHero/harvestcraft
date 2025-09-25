package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.harvestcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PressedWaxBlock extends Block
{
    private final String name = "PressedWax";


    public PressedWaxBlock()
    {
        super(Material.wood);
        GameRegistry.registerBlock(this, name);
        setUnlocalizedName(name);
        setCreativeTab(harvestcraft.modTab);
    }
}
