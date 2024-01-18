package com.pam.harvestcraft.item;

import net.minecraftforge.event.entity.living.LivingDropsEvent;


public class PamSquidDrops
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
                    event.entityLiving.dropItem(ItemRegistry.calamarirawItem, 1);
                }
                if (rand < 0.25D)
                {
                    event.entityLiving.dropItem(ItemRegistry.calamarirawItem, 1);
                }
            }
        }
    }
}
