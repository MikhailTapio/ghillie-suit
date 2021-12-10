package com.teamfractal.gsuit.client.render;

import com.teamfractal.gsuit.common.armor.GSArmorItems;
import net.minecraft.world.level.GrassColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GSColorHandler {
    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event){
        event.getItemColors().register((stack, index) -> GrassColor.get(0.5D, 1.0D), GSArmorItems.armorPGHelmet.get());
        event.getItemColors().register((stack, index) -> GrassColor.get(0.5D, 1.0D), GSArmorItems.armorPGChestplate.get());
        event.getItemColors().register((stack, index) -> GrassColor.get(0.5D, 1.0D), GSArmorItems.armorPGLeggings.get());
        event.getItemColors().register((stack, index) -> GrassColor.get(0.5D, 1.0D), GSArmorItems.armorPGBoots.get());
    }

}
