package com.rickisparks.consisticraft.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.rickisparks.consisticraft.Consisticraft;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Consisticraft.MOD_ID);

    public static final RegistryObject<Item> BEDROCK_SWORD = ITEMS.register("bedrock_sword",
            () -> new SwordItem(ModTiers.BEDROCK, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> BEDROCK_PICKAXE = ITEMS.register("bedrock_pickaxe",
            () -> new PickaxeItem(ModTiers.BEDROCK, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> BEDROCK_SHOVEL = ITEMS.register("bedrock_shovel",
            () -> new ShovelItem(ModTiers.BEDROCK, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> BEDROCK_AXE = ITEMS.register("bedrock_axe",
            () -> new AxeItem(ModTiers.BEDROCK, 4, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> BEDROCK_HOE = ITEMS.register("bedrock_hoe",
            () -> new HoeItem(ModTiers.BEDROCK, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
