package com.pam.harvestcraft.gui;

import net.minecraft.item.ItemStack;


public class MarketData
{
    ItemStack item;
    ItemStack currency;
    int price;


    public MarketData(ItemStack item, ItemStack currency, int price)
    {
        this.item = item;
        this.currency = currency;
        this.price = price;
    }


    public ItemStack getItem()
    {
        return this.item;
    }


    public ItemStack getCurrency()
    {
        return this.currency;
    }


    public int getPrice()
    {
        return this.price;
    }
}
