package com.cti.ctihsmsadditions.sub.foods.Config;

import net.minecraftforge.common.ForgeConfigSpec;

public class FeatureConfig {
    public static ForgeConfigSpec.BooleanValue rightclick_harvest;
    public static ForgeConfigSpec.BooleanValue grass_drop_seeds;
    public static ForgeConfigSpec.BooleanValue tallgrass_drop_seeds;
    public static ForgeConfigSpec.BooleanValue fern_drop_seeds;


    public static void init(ForgeConfigSpec.Builder config) {

        rightclick_harvest = config.comment("Disable/enable right-click harvesting of crops.")
                .define("Enable right-click harvesting for crops", true);



    }

}