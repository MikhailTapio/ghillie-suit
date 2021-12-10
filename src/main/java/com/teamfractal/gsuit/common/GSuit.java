package com.teamfractal.gsuit.common;

import com.teamfractal.gsuit.common.util.GSRegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GSuit.MODID)
public class GSuit
{
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "gsuit";

    {

        GSRegistryHandler.register();
        MinecraftForge.EVENT_BUS.register(this);

    }

    @SubscribeEvent
    public void onServerStarting(FMLDedicatedServerSetupEvent event) {

    }
}
