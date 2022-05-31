package com.robertorange.pinkexpansion.item;

import com.robertorange.pinkexpansion.registry.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ROSE_GOLD = new ForgeTier(2, 500, 15.0f, 1f, 30,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get()));
}
