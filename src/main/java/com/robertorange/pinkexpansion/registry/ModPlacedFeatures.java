package com.robertorange.pinkexpansion.registry;

import com.robertorange.pinkexpansion.pinkExpansion;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> PINK_IVORY_PLACED = PlacementUtils.register("pink_ivory_placed",
            ModConfiguredFeatures.PINK_IVORY_TREE, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));

    public static final Holder<PlacedFeature> ROSE_QUARTZ_ORE_PLACED = PlacementUtils.register("rose_quartz_ore_placed",
            ModConfiguredFeatures.ROSE_QUARTZ_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(100))));

    public static <FC extends FeatureConfiguration> Holder<PlacedFeature> createPlacedFeature(String id, Holder<ConfiguredFeature<FC, ?>> feature, List<PlacementModifier> placementModifiers) {
        return BuiltinRegistries.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(pinkExpansion.MOD_ID), new PlacedFeature(Holder.hackyErase(feature), List.copyOf(placementModifiers)));
    }

    }