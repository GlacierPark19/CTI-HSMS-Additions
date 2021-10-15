package com.cti.ctihsmsadditions.sub.decor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WoodRack extends Block {


    public WoodRack() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(7.0f, 24.0f)
                .sound(SoundType.METAL)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
        );
    }


}
