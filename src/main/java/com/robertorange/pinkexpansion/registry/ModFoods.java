package com.robertorange.pinkexpansion.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ORANGE = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties ROSE_GOLD_ORANGE = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.8F).effect(new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 0), 1.0F).effect(new MobEffectInstance(MobEffects.SATURATION, 300, 0), 1.0F).build();
    public static final FoodProperties ENCHANTED_ROSE_GOLD_ORANGE = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.8F).effect(new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 1), 1.0F).effect(new MobEffectInstance(MobEffects.SATURATION, 300, 0), 1.0F).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 6000, 0), 1.0F).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 6000, 0), 1.0F).build();
}
