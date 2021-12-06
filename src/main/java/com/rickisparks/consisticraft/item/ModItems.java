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
            () -> new SwordItem(ModTiers.BEDROCK, 3, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> BEDROCK_SHOVEL = ITEMS.register("bedrock_shovel",
            () -> new ShovelItem(ModTiers.BEDROCK, 1.5F, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> BEDROCK_PICKAXE = ITEMS.register("bedrock_pickaxe",
            () -> new PickaxeItem(ModTiers.BEDROCK, 1, -2.8F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> BEDROCK_AXE = ITEMS.register("bedrock_axe",
            () -> new AxeItem(ModTiers.BEDROCK, 7.0F, -3.2F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> BEDROCK_HOE = ITEMS.register("bedrock_hoe",
            () -> new HoeItem(ModTiers.BEDROCK, -1, -2.0F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));

    public static final RegistryObject<Item> STONE_SWORD = ITEMS.register("stone_sword",
            () -> new SwordItem(Tiers.STONE, 3, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL = ITEMS.register("stone_shovel",
            () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE = ITEMS.register("stone_pickaxe",
            () -> new PickaxeItem(Tiers.STONE, 1, -2.8F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> STONE_AXE = ITEMS.register("stone_axe",
            () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> STONE_HOE = ITEMS.register("stone_hoe",
            () -> new HoeItem(Tiers.STONE, -1, -2.0F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));

    public static final RegistryObject<Item> DIORITE_SWORD = ITEMS.register("diorite_sword",
            () -> new SwordItem(Tiers.STONE, 3, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> DIORITE_SHOVEL = ITEMS.register("diorite_shovel",
            () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> DIORITE_PICKAXE = ITEMS.register("diorite_pickaxe",
            () -> new PickaxeItem(Tiers.STONE, 1, -2.8F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> DIORITE_AXE = ITEMS.register("diorite_axe",
            () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> DIORITE_HOE = ITEMS.register("diorite_hoe",
            () -> new HoeItem(Tiers.STONE, -1, -2.0F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));

    public static final RegistryObject<Item> OAK_WOODEN_SWORD = ITEMS.register("oak_wooden_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> OAK_WOODEN_SHOVEL = ITEMS.register("oak_wooden_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5F, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> OAK_WOODEN_PICKAXE = ITEMS.register("oak_wooden_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> OAK_WOODEN_AXE = ITEMS.register("oak_wooden_axe",
            () -> new AxeItem(Tiers.WOOD, 7.0F, -3.2F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));
    public static final RegistryObject<Item> OAK_WOODEN_HOE = ITEMS.register("oak_wooden_hoe",
            () -> new HoeItem(Tiers.WOOD, -1, -2.0F,
                    new Item.Properties().tab(ModCreativeModeTab.CONSISTICRAFT_TAB)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
