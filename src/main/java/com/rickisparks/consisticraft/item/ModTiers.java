package com.rickisparks.consisticraft.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier BEDROCK = new ForgeTier(0,-1,0.5f,
            1f,9999, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(Items.BEDROCK));
}
