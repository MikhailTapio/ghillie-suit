package com.teamfractal.gsuit.common.util;

import com.teamfractal.gsuit.common.GSuit;
import com.teamfractal.gsuit.common.armor.GSArmorItems;
import com.teamfractal.gsuit.common.config.GSCommonConfig;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class GSRegistryHandler {

    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, GSuit.MODID);

    public static void register(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GSArmorItems.register();

        Items.register(eventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GSCommonConfig.COMMON_CONFIG);
    }
}
