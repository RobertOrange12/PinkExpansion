package com.robertorange.pinkexpansion.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EnchantedRoseGoldOrange extends Item {
    public EnchantedRoseGoldOrange(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return true;
    }
}

