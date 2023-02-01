package com.goodobearo.mobexpansion;

import com.goodobearo.mobexpansion.item.ModCreativeModTabs;
import com.goodobearo.mobexpansion.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MobExpansion.MOD_ID)
public class MobExpansion {

    public static final String MOD_ID = "mobexpansion";
    private static final Logger LOGGER = LogUtils.getLogger();
    public MobExpansion() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() == ModCreativeModTabs.MOB_EXPANSION_TAB) {
            event.accept(ModItems.BLANK_CRYSTAL);
            event.accept(ModItems.RED_CRYSTAL);
        }
        if(event.getTab() == ModCreativeModTabs.MOB_EXPANSION_TAB) {
            event.accept(ModItems.BLANK_CRYSTAL);
            event.accept(ModItems.RED_CRYSTAL);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
