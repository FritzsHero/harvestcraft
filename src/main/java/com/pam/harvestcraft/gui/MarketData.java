package com.pam.harvestcraft.gui;

import net.minecraft.item.ItemStack;


public class MarketData
{
    ItemStack item;
    ItemStack currency;
    int price;


    public MarketData(ItemStack _item, ItemStack _currency, int _price)
    {
        item = _item;
        currency = _currency;
        price = _price;
    }


    public ItemStack getItem()
    {
        return item;
    }


    public ItemStack getCurrency()
    {
        return currency;
    }


    public int getPrice()
    {
        return price;
    }
}
