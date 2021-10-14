package com.cti.ctihsmsadditions;

import com.cti.ctihsmsadditions.sub.foods.Config.Config;
import com.cti.ctihsmsadditions.sub.foods.Config.FeatureConfig;
import com.cti.ctihsmsadditions.sub.foods.Config.RightClickConfig;
import com.cti.ctihsmsadditions.sub.foods.Events.CropHarvest;
import com.cti.ctihsmsadditions.sub.foods.Items.ItemRegistry;
import com.cti.ctihsmsadditions.sub.foods.Items.SeedRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("cti-hsms-additions")
public class CtiHsmsAdditions {
    public static final String ModID = "ctihsmsadditions";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup ITEM_GROUP = new ItemGroup("HSMS_Additions") {
        public ItemStack createIcon() {
            return new ItemStack(ItemRegistry.CINNAMON_BAGEL.get());
        }


    };
    public CtiHsmsAdditions() {

        // Register the setup method for modloading
      //  FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(CtiHsmsAdditions.);
        // Register the enqueueIMC method for modloading
       // FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
       // FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        //Foods registerys
        ItemRegistry.init();






        //Specific Setup for the Foods module
        Config.loadConfig(Config.CONFIG, FMLPaths.CONFIGDIR.get().resolve("CTI_FOODS.toml").toString());
    }

    private void setup(final FMLCommonSetupEvent event) {
       //Code for CTI-Foods setup here

        if (FeatureConfig.rightclick_harvest.get()) {
            if (RightClickConfig.crop_right_click.get())
                MinecraftForge.EVENT_BUS.register(new CropHarvest());
        }
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("cti-hsms-additions", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m -> m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }


    @Nonnull
    public static ResourceLocation getId(String path) {
        return new ResourceLocation(ModID, path);
    }
}
