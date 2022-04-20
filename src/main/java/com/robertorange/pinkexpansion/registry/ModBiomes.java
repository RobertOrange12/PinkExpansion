package com.robertorange.pinkexpansion.registry;

import com.robertorange.pinkexpansion.biome.ModOverworldBiomes;
import com.robertorange.pinkexpansion.biome.PinkBiomes;
import com.robertorange.pinkexpansion.pinkExpansion;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomes {

    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, pinkExpansion.MOD_ID);

    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event)
    {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registry.register(ModOverworldBiomes.PinkIvoryForest().setRegistryName(PinkBiomes.PINK_IVORY_PLAINS.location()));
    }
}
