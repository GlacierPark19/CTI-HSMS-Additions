package com.cti.ctihsmsadditions.sub.foods.Items;

import com.cti.ctihsmsadditions.CtiHsmsAdditions;
import com.cti.ctihsmsadditions.sub.foods.Blocks.BlockRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;


public class SeedRegistry {

    public static Item tomatoseeditem;






    public static void registerAll(RegistryEvent.Register<Item> event) {
        if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName()))
            return;

        tomatoseeditem = register("tomato_seed", new ItemSeed(BlockRegistry.foodstomatocrop, (new Item.Properties()).group(ItemGroup.MISC)));



    }


    private static <T extends Item> T register(String name, T item) {
        ResourceLocation id = CtiHsmsAdditions.getId(name);
        item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

    private static <T extends BlockItem> T register(String name, T block_item) {
        ResourceLocation id = CtiHsmsAdditions.getId(name);
        block_item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(block_item);
        return block_item;
    }





}
