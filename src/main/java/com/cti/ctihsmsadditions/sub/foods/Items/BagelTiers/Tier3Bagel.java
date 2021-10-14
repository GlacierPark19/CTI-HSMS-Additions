package com.cti.ctihsmsadditions.sub.foods.Items.BagelTiers;

import com.cti.ctihsmsadditions.CtiHsmsAdditions;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Tier3Bagel extends Item {
    public Tier3Bagel() {
        super(new Properties()


                .group(CtiHsmsAdditions.ITEM_GROUP)
                .food(new Food.Builder()
                        .hunger(24)
                        .saturation(30f)
                        //.effect(new EffectInstance(Effects.REGENERATION, 2400, 2)),

                        .build()



                )
        );







    }
}
