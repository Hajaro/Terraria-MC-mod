package com.hajaro.terracraftia.items;

import com.hajaro.terracraftia.Terracraftia;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase(){
        super(new Item.Properties().group(Terracraftia.TAB));
    }
}
