package com.goodobearo.mobexpansion.item;

import com.goodobearo.mobexpansion.MobExpansion;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MobExpansion.MOD_ID);

    public static final RegistryObject<Item> BLANK_CRYSTAL = ITEMS.register("blank_crystal", () -> new Item( new Item.Properties()));
    public static final RegistryObject<Item> RED_CRYSTAL = ITEMS.register("red_crystal", () -> new Item( new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
