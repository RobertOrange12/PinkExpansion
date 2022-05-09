package com.robertorange.pinkexpansion.biome;

import com.robertorange.pinkexpansion.registry.ModPlacedFeatures;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModDefaultBiomeFeatures {

    public static void addPinkIvoryTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.PINK_IVORY_PLACED);

    }
}