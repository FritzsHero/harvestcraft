package com.pam.harvestcraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;


public class PamCropSeedDropRegistry
{
    public static void getSeedDrops()
    {
        if (!ItemRegistry.isSeedDroppingFromGrass)
        {
            return;
        }

        for(int i = 0; i < ItemRegistry.PamSeeds.length; i++)
        {
            AddGrassSeed(ItemRegistry.PamSeeds[i]);
        }
    }


    private static void AddGrassSeed(Item _item)
    {
        MinecraftForge.addGrassSeed(new ItemStack(_item, 1, 0), ItemRegistry.seedrarity);
    }
}
