package com.pam.harvestcraft.events;


import java.util.List;
import java.util.Arrays;

import com.pam.harvestcraft.item.ItemRegistry;

import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraftforge.event.entity.player.EntityInteractEvent;


public class BreedingItems
{
    public static double rand;
    public static Item[] editableCowPigItems = {ItemRegistry.barleyItem, ItemRegistry.ryeItem, ItemRegistry.oatsItem, ItemRegistry.riceItem, ItemRegistry.cornItem, ItemRegistry.soybeanItem, ItemRegistry.bananaItem, Items.apple, Items.carrot};
    public static List<Item> edibleCowPigItemsList = Arrays.asList(editableCowPigItems);
    
    public static Item[] editableChickenItems = {ItemRegistry.barleyItem, ItemRegistry.ryeItem, ItemRegistry.oatsItem, ItemRegistry.riceItem, ItemRegistry.cornItem, ItemRegistry.peasItem, ItemRegistry.sunflowerseedsItem,ItemRegistry.bananaItem, ItemRegistry.QuinoaItem, ItemRegistry.MilletItem, ItemRegistry.AmaranthItem, Items.apple, Items.pumpkin_seeds};
    public static List<Item> edibleChickenItemsList = Arrays.asList(editableChickenItems);

    public static Item[] editableSheepItems = {ItemRegistry.barleyItem, ItemRegistry.ryeItem, ItemRegistry.oatsItem, ItemRegistry.cornItem, ItemRegistry.soybeanItem, ItemRegistry.bananaItem, Items.apple, Items.carrot};
    public static List<Item> edibleSheepItemsList = Arrays.asList(editableSheepItems);

    public static Item[] editableRabbitItems = {ItemRegistry.barleyItem, ItemRegistry.ryeItem, ItemRegistry.oatsItem, ItemRegistry.pearItem, ItemRegistry.bananaItem, Items.carrot, Items.apple};
    public static List<Item> edibleRabbitItemsList = Arrays.asList(editableRabbitItems);


    @net.minecraftforge.fml.common.eventhandler.SubscribeEvent
    public void PlayerInteractEvent(EntityInteractEvent event)
    {
        ItemStack itemstack = event.entityPlayer.inventory.getCurrentItem();
        if (itemstack == null)
        {
        	return;
        }
        
        if (event.target instanceof EntityCow)
    	{
    		if (edibleCowPigItemsList.contains(itemstack.getItem()))
    		{
    			FeedEntityAnimal((EntityAnimal)event.target, event.entityPlayer, itemstack);
    		}
    	}
    	else if (event.target instanceof EntityPig)
    	{
    		if (edibleCowPigItemsList.contains(itemstack.getItem()))
    		{
    			FeedEntityAnimal((EntityAnimal)event.target, event.entityPlayer, itemstack);
    		}
    	}
    	else if (event.target instanceof EntityChicken)
    	{
    		if (edibleChickenItemsList.contains(itemstack.getItem()))
    		{
    			FeedEntityAnimal((EntityAnimal)event.target, event.entityPlayer, itemstack);
    		}
    	}
    	else if (event.target instanceof EntitySheep)
    	{
    		if (edibleSheepItemsList.contains(itemstack.getItem()))
    		{
    			FeedEntityAnimal((EntityAnimal)event.target, event.entityPlayer, itemstack);
    		}
    	}
    	else if (event.target instanceof EntityRabbit)
    	{
    		if (edibleRabbitItemsList.contains(itemstack.getItem()))
    		{
    			FeedEntityAnimal((EntityAnimal)event.target, event.entityPlayer, itemstack);
    		}
    	}
    }
    
    
    
    public void FeedEntityAnimal(EntityAnimal animal, EntityPlayer player, ItemStack itemstack)
    {
		if (animal.getGrowingAge() == 0 && !animal.isInLove())
		{
			ConsumeItemFromStack(player, itemstack);
			animal.setInLove(player);
		}
		else if (animal.isChild())
		{
			ConsumeItemFromStack(player, itemstack);
			animal.func_175501_a((int)((float)(-animal.getGrowingAge() / 20) * 0.1F), true);
		}
    }


    public void ConsumeItemFromStack(EntityPlayer player, ItemStack stack)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --stack.stackSize;

            if (stack.stackSize <= 0)
            {
                player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
            }
        }
    }
    

    // Original Function in forge:
    //if (itemstack != null)
    //{
    //    if (this.isBreedingItem(itemstack) && this.getGrowingAge() == 0 && this.inLove <= 0)
    //    {
    //        this.consumeItemFromStack(player, itemstack);
    //        this.setInLove(player);
    //        return true;
    //    }

    //    if (this.isChild() && this.isBreedingItem(itemstack))
    //    {
    //        this.consumeItemFromStack(player, itemstack);
    //        this.func_175501_a((int)((float)(-this.getGrowingAge() / 20) * 0.1F), true);
    //        return true;
    //    }
    //}
}
