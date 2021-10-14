package com.cti.ctihsmsadditions.sub.foods.Events;

import com.cti.ctihsmsadditions.CtiHsmsAdditions;

import net.minecraft.loot.LootPool;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class GrassLootHandler {
    private static ResourceLocation grass_drops = new ResourceLocation("minecraft", "blocks/grass");

    @SubscribeEvent
    public void lootTableLoad(LootTableLoadEvent event) {
        if (event.getName().equals(grass_drops))
            event.getTable().addPool(LootPool.builder()
                    .addEntry(TableLootEntry.builder(new ResourceLocation(CtiHsmsAdditions.ModID, "blocks/grass_drops")))
                    .name("sf_grass_drops").build());


    }
}
