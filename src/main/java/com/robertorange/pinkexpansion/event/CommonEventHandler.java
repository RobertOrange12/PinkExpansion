package com.robertorange.pinkexpansion.event;

import com.robertorange.pinkexpansion.pinkExpansion;
import com.robertorange.pinkexpansion.util.CodecUtils;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = pinkExpansion.MOD_ID)
public class CommonEventHandler {


    @SubscribeEvent
    public static void onServerStarted(ServerStartedEvent event) {
        CodecUtils.clearCache();
    }
}