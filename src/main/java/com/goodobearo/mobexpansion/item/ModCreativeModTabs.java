package com.goodobearo.mobexpansion.item;

import com.goodobearo.mobexpansion.MobExpansion;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MobExpansion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD )
public class ModCreativeModTabs {
    public static CreativeModeTab MOB_EXPANSION_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        MOB_EXPANSION_TAB = event.registerCreativeModeTab(new ResourceLocation(MobExpansion.MOD_ID,"mob_expansion_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLANK_CRYSTAL.get()))
                        .title(Component.translatable("creativemodetab.mob_expansion_tab")));
    }
}
