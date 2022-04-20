package com.robertorange.pinkexpansion.registry;

import com.robertorange.pinkexpansion.item.EnchantedRoseGoldOrange;
import com.robertorange.pinkexpansion.item.ModBoatItem;
import com.robertorange.pinkexpansion.pinkExpansion;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, pinkExpansion.MOD_ID);

    public static final RegistryObject<Item> PINK_IVORY_BOAT = ITEMS.register("pink_ivory_boat", () -> new ModBoatItem("pink_ivory", new Item.Properties().stacksTo(1).tab(pinkExpansion.TAB)));
    public static final RegistryObject<Item> PINK_IVORY_SIGN = ITEMS.register("pink_ivory_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(pinkExpansion.TAB), ModBlocks.PINK_IVORY_SIGN.get(), ModBlocks.PINK_IVORY_WALL_SIGN.get()));

    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange", () -> new Item(new Item.Properties().tab(pinkExpansion.TAB).food(ModFoods.ORANGE)));
    public static final RegistryObject<Item> ROSE_GOLD_ORANGE = ITEMS.register("rose_gold_orange", () -> new Item(new Item.Properties().tab(pinkExpansion.TAB).rarity(Rarity.RARE).food(ModFoods.ROSE_GOLD_ORANGE)));
    public static final RegistryObject<Item> ENCHANTED_ROSE_GOLD_ORANGE = ITEMS.register("enchanted_rose_gold_orange", () -> new EnchantedRoseGoldOrange(new Item.Properties().tab(pinkExpansion.TAB).rarity(Rarity.EPIC).food(ModFoods.ENCHANTED_ROSE_GOLD_ORANGE)));


    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot", () -> new Item((new Item.Properties()).tab(pinkExpansion.TAB)));
    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget", () -> new Item((new Item.Properties()).tab(pinkExpansion.TAB)));

}





