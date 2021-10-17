package com.cti.ctihsmsadditions.sub.decor.blocks;

import com.cti.ctihsmsadditions.CtiHsmsAdditions;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DecorBlockRegistry {


    public static final DeferredRegister<Block> DecorBLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CtiHsmsAdditions.ModID);
    public static final DeferredRegister<Item> DecorITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CtiHsmsAdditions.ModID);

public static void init() {

    DecorBLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    DecorITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
}




public static final RegistryObject<Block> WOOD_RACK = DecorBLOCKS.register("wood_rack", wood_rack::new);







//Register Block-Items

    public static final RegistryObject<Item> WOOD_RACK_ITEM = DecorITEMS.register("wood_rack_item", () -> new BlockItemCreate(WOOD_RACK.get()));
}
