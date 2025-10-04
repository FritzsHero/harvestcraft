package com.pam.harvestcraft.events;

import net.minecraftforge.event.entity.living.LivingDropsEvent;
import com.pam.harvestcraft.item.ItemRegistry;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;


public class SquidDrops
{
    public static double rand;


    @net.minecraftforge.fml.common.eventhandler.SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event)
    {
        if (event.source.getDamageType().equals("player"))
        {
            rand = Math.random();
            if ((event.entityLiving instanceof net.minecraft.entity.passive.EntitySquid))
            {
                if (rand < 0.5D)
                {
                    event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, 
                    		event.entity.posY, event.entity.posZ, new ItemStack(ItemRegistry.calamarirawItem, 1)));
                    if (rand < 0.25D)
                    {
                    	event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, 
                        		event.entity.posY, event.entity.posZ, new ItemStack(ItemRegistry.calamarirawItem, 1)));
                    }
                }
            }
        }
    }
}
