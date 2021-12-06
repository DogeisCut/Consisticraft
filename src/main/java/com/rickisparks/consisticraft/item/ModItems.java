package com.rickisparks.consisticraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.rickisparks.consisticraft.Consisticraft;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Consisticraft.MOD_ID);

    public static final RegistryObject<Item> BEDROCK_PICKAXE = ITEMS.register("bedrock_pickaxe",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}