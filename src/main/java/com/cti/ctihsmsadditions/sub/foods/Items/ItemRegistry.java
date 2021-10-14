package com.cti.ctihsmsadditions.sub.foods.Items;

import com.cti.ctihsmsadditions.CtiHsmsAdditions;
import com.cti.ctihsmsadditions.sub.foods.Blocks.BlockRegistry;
import com.cti.ctihsmsadditions.sub.foods.Items.BagelTiers.Tier1Bagel;
import com.cti.ctihsmsadditions.sub.foods.Items.BagelTiers.Tier2Bagel;
import com.cti.ctihsmsadditions.sub.foods.Items.BagelTiers.Tier3Bagel;
import com.cti.ctihsmsadditions.sub.foods.Items.BagelTiers.Tier7723Bagel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

import java.lang.ref.Reference;

public class ItemRegistry {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CtiHsmsAdditions.ModID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //Tier 1 Bagel
    public static final RegistryObject<Item> PLAIN_BAGEL = ITEMS.register("plain_bagel", Tier1Bagel::new);
    public static final RegistryObject<Item> EGG_BAGEL = ITEMS.register("egg_bagel", Tier1Bagel::new);


    //Tier 2 Bagels
    public static final RegistryObject<Item> SEED_BAGEL = ITEMS.register("seed_bagel", Tier2Bagel::new);
    public static final RegistryObject<Item> CREAM_CHEESE_BAGEL = ITEMS.register("cream_cheese_bagel", Tier2Bagel::new);
    public static final RegistryObject<Item> CINNAMON_BAGEL = ITEMS.register("cinnamon_bagel.json", Tier2Bagel::new);

//Tier 3 Bagels

    public static final RegistryObject<Item> COW_BAGEL = ITEMS.register("cow_bagel", Tier3Bagel::new);
    public static final RegistryObject<Item> PIZZA_BAGEL = ITEMS.register("pizza_bagel", Tier3Bagel::new);
    public static final RegistryObject<Item> CHEESY_BAGEL = ITEMS.register("cheesy_bagel", Tier3Bagel::new);
    //TIER 7723 BAGEL
    public static final RegistryObject<Item> BAGEL_7723 = ITEMS.register("bagel7723s_bagel", Tier7723Bagel::new);


    //Misc Items/ingredients

    public static final RegistryObject<Item> BASIC_DOUGH = ITEMS.register("basic_dough", ItemCreator::new);
    public static final RegistryObject<Item> CREAM_CHEESE = ITEMS.register("cream_cheese", ItemCreator::new);
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", ItemCreator::new);
    public static final RegistryObject<Item> CONDENSED_COW = ITEMS.register("condensed_cow", ItemCreator::new);
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", ItemCreator::new);


//Seeds- Take 3. ActioN!
}


