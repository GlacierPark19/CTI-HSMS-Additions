package com.cti.ctihsmsadditions.sub.decor.blocks;

import com.cti.ctihsmsadditions.CtiHsmsAdditions;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemCreate extends BlockItem {


    public BlockItemCreate(Block block) {
        super(block, new Item.Properties()
                .group(CtiHsmsAdditions.ITEM_GROUP)



        );
    }


};
