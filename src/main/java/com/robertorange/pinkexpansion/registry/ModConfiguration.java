package com.robertorange.pinkexpansion.registry;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;

public class ModConfiguration {
    public static ForgeConfigSpec COMMON_CONFIG;


    public static final String CATEGORY_PINKEXPANSION = "plains";
    public static final ForgeConfigSpec.BooleanValue SPAWN_FLAMINGOS;

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        COMMON_BUILDER.comment("Pink Expansion Config").push(CATEGORY_PINKEXPANSION);
        SPAWN_FLAMINGOS = COMMON_BUILDER.comment("Spawn flamingos in pink ivory plains").define("spawnFlamingos", true);

        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent.Loading configEvent) { }

    @SubscribeEvent
    public static void onReload(final ModConfigEvent.Reloading configEvent) { }
}
