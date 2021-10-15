package com.cti.ctihsmsadditions.sub.decor.blocks;

import com.cti.ctihsmsadditions.CtiHsmsAdditions;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CtiHsmsAdditions.ModID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CtiHsmsAdditions.ModID);

public static void init() {

    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
}




public static final RegistryObject<Block> WOOD_RACK = BLOCKS.register("WoodRack", WoodRack::new);







//Register Block-Items

    public static final RegistryObject<Item> WOOD_RACK_ITEM = ITEMS.register("woodRackItem", () -> new BlockItemCreate(WOOD_RACK.get()));
}
