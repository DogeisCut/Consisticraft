package com.rickisparks.consisticraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CONSISTICRAFT_TAB = new CreativeModeTab("consisticraftTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BEDROCK_PICKAXE.get());
        }
    };
}
