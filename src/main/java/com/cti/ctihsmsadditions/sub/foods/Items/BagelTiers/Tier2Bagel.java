package com.cti.ctihsmsadditions.sub.foods.Items.BagelTiers;

import com.cti.ctihsmsadditions.CtiHsmsAdditions;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Tier2Bagel extends Item {
    public Tier2Bagel() {
        super(new Properties()


                .group(CtiHsmsAdditions.ITEM_GROUP)
                .food(new Food.Builder()
                        .hunger(9)
                        .saturation(10f)
                        //.effect(new EffectInstance(Effects.REGENERATION, 2400, 2)),

                        .build()



                )
        );







    }
}

