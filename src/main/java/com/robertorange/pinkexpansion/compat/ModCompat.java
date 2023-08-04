package com.robertorange.pinkexpansion.compat;

import com.robertorange.pinkexpansion.compat.decorative_blocks.DBCompat;
import com.robertorange.pinkexpansion.compat.farmersdelight.FDCompat;
import com.robertorange.pinkexpansion.compat.quark.QuarkCompat;
import com.robertorange.pinkexpansion.compat.quark.QuarkCompatClient;
import com.robertorange.pinkexpansion.compat.quark.QuarkFlagRecipeCondition;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLLoader;

public class ModCompat {
    public static final boolean quark;
    public static final boolean autoreglib;
    public static final boolean decorative_blocks;
    public static final boolean farmersdelight;

    static {
        quark = isModPresent("quark");
        autoreglib = isModPresent("autoreglib");
        decorative_blocks = isModPresent("decorative_blocks");
        farmersdelight = isModPresent("farmersdelight");
    }

    public static boolean isModPresent(String modid) {
        return FMLLoader.getLoadingModList().getModFileById(modid) != null;
    }

    public static void init() {
        if (quark) {
            QuarkCompat.init();
            FMLJavaModLoadingContext.get().getModEventBus().addListener(QuarkCompatClient::registerRenderLayers);
            FMLJavaModLoadingContext.get().getModEventBus().addListener(QuarkCompatClient::registerBlockColors);
            FMLJavaModLoadingContext.get().getModEventBus().addListener(QuarkCompatClient::registerItemColors);
            FMLJavaModLoadingContext.get().getModEventBus().addListener(QuarkCompatClient::registerRenderers);
            FMLJavaModLoadingContext.get().getModEventBus().addListener(QuarkCompatClient::stitchTextures);
        }
        if (decorative_blocks) DBCompat.init();
        if (farmersdelight) {
            FDCompat.init();
        }
        CraftingHelper.register(new QuarkFlagRecipeCondition.Serializer());
    }
}
