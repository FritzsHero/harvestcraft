package com.pam.harvestcraft.item;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomFishable;


public class FishRegistry
{
    public static void registerItems()
    {
        if (ItemRegistry.enableharvestcraftfish)
        {
            registerLoot(new ItemStack(ItemRegistry.seaweedItem, 1, 0), 10);
            registerNormal(new ItemStack(ItemRegistry.anchovyrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.bassrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.carprawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.catfishrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.charrrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.eelrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.grouperrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.herringrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.jellyfishrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.mudfishrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.octopusrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.perchrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.snapperrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.tilapiarawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.troutrawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.tunarawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.walleyerawItem, 1, 0), 25);
            registerNormal(new ItemStack(ItemRegistry.greenheartfishItem, 1, 0), 25);
        }
    }


    public static void registerNormal(ItemStack item, int weight)
    {
        try
        {
            Field field = EntityFishHook.class.getDeclaredField("field_146036_f");
            List list = new ArrayList(getStaticFinalList(field));
            list.add(new WeightedRandomFishable(item, weight));
            setStaticFinalList(EntityFishHook.class.getDeclaredField("field_146036_f"), list);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public static void registerLoot(ItemStack loot, int weight)
    {
        try
        {
            Field field = EntityFishHook.class.getDeclaredField("field_146039_d");
            List list = new ArrayList(getStaticFinalList(field));
            list.add(new WeightedRandomFishable(loot, weight));
            setStaticFinalList(EntityFishHook.class.getDeclaredField("field_146039_d"), list);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public static void registerRare(ItemStack rare, int weight)
    {
        try
        {
            Field field = EntityFishHook.class.getDeclaredField("field_146041_e");
            List list = new ArrayList(getStaticFinalList(field));
            list.add(new WeightedRandomFishable(rare, weight));
            setStaticFinalList(EntityFishHook.class.getDeclaredField("field_146041_e"), list);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    private static List getStaticFinalList(Field field) throws Exception
    {
        field.setAccessible(true);
        Field modifiers = Field.class.getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(field, field.getModifiers() & 0xFFFFFFEF);
        return (List)field.get(field);
    }


    private static void setStaticFinalList(Field field, Object object) throws Exception
    {
        field.setAccessible(true);
        Field modifiers = Field.class.getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(field, field.getModifiers() & 0xFFFFFFEF);
        field.set(null, object);
    }
}
