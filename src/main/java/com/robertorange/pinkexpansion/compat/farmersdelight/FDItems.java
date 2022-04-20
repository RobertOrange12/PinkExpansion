package com.robertorange.pinkexpansion.compat.farmersdelight;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.item.DrinkableItem;

public class FDItems {

    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Item> ORANGE_JUICE;

    public static void init() {
    }

    static {

    ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "pinkexpansion");

    ORANGE_JUICE = ITEMS.register("orange_juice", () -> {
        return new DrinkableItem((new Item.Properties()).food(FDItems.ORANGE_JUICE_VALUES).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FarmersDelight.CREATIVE_TAB), true, false);
    });
    }

    public static final FoodProperties ORANGE_JUICE_VALUES = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0);
    }, 1.0F).build();


}
