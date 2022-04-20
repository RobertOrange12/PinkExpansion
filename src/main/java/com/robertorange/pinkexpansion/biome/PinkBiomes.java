package com.robertorange.pinkexpansion.biome;

import com.robertorange.pinkexpansion.pinkExpansion;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PinkBiomes
{
    public static final ResourceKey<Biome> PINK_IVORY_PLAINS = register("pink_ivory_plains");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(pinkExpansion.MOD_ID, name));
    }
}