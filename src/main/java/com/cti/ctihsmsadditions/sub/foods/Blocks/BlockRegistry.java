package com.cti.ctihsmsadditions.sub.foods.Blocks;

import com.cti.ctihsmsadditions.CtiHsmsAdditions;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

public class BlockRegistry {

    public static Block foodstomatocrop;


    public static void registerAll(RegistryEvent.Register<Block> event) {
        if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName()))
            return;
        foodstomatocrop = register("foods_tomato_crop", new CTICrops(Block.Properties.create(Material.PLANTS)
                .doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.CROP), "tomato"));
    }


    private static <T extends Block> T register(String name, T block) {
        BlockItem item = new BlockItem(block, new Item.Properties().group(ItemGroup.MISC));
        return register(name, block, item);
    }


    private static <T extends Block> T register(String name, T block, @Nullable BlockItem item) {
        ResourceLocation id = CtiHsmsAdditions.getId(name);
        block.setRegistryName(id);
        ForgeRegistries.BLOCKS.register(block);
        return block;
    }


}
