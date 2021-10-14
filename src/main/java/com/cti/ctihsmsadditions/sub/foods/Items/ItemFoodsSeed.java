package com.cti.ctihsmsadditions.sub.foods.Items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemFoodsSeed extends BlockNamedItem {
    public ItemFoodsSeed(Block blockIn, Properties properties) {
        super(blockIn, properties);

    }

    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        if (this.isInGroup(group)) {
            items.add(new ItemStack(this));
        }

    }
}

