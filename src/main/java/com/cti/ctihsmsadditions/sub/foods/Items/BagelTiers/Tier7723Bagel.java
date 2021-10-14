package com.cti.ctihsmsadditions.sub.foods.Items.BagelTiers;

import com.cti.ctihsmsadditions.CtiHsmsAdditions;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Tier7723Bagel extends Item {
    public Tier7723Bagel() {
        super(new Properties()


                .group(CtiHsmsAdditions.ITEM_GROUP)
                .food(new Food.Builder()
                        .hunger(7723)
                        .saturation(77230f)
                        //.effect(new EffectInstance(Effects.REGENERATION, 2400, 2)),

                        .build()



                )
        );







    }
    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}

