package com.robertorange.pinkexpansion.registry;

import com.robertorange.pinkexpansion.item.EnchantedRoseGoldOrange;
import com.robertorange.pinkexpansion.item.ModArmorMaterials;
import com.robertorange.pinkexpansion.item.ModBoatItem;
import com.robertorange.pinkexpansion.item.ModTiers;
import com.robertorange.pinkexpansion.pinkExpansion;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> ROSE_QUARTZ = ITEMS.register("rose_quartz", () -> new Item((new Item.Properties()).tab(pinkExpansion.TAB)));

    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(ModTiers.ROSE_GOLD, 2, 3f,
                    new Item.Properties().tab(pinkExpansion.TAB)));
    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe",
            () -> new PickaxeItem(ModTiers.ROSE_GOLD, 1, 1f,
                    new Item.Properties().tab(pinkExpansion.TAB)));
    public static final RegistryObject<Item> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel",
            () -> new ShovelItem(ModTiers.ROSE_GOLD, 0, 1f,
                    new Item.Properties().tab(pinkExpansion.TAB)));
    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe",
            () -> new AxeItem(ModTiers.ROSE_GOLD, 4, 0f,
                    new Item.Properties().tab(pinkExpansion.TAB)));
    public static final RegistryObject<Item> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe",
            () -> new HoeItem(ModTiers.ROSE_GOLD, 0, 0f,
                    new Item.Properties().tab(pinkExpansion.TAB)));

    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.HEAD,
                    new Item.Properties().tab(pinkExpansion.TAB)));
    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.CHEST,
                    new Item.Properties().tab(pinkExpansion.TAB)));
    public static final RegistryObject<Item> ROSE_GOLD_LEGGING = ITEMS.register("rose_gold_leggings",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.LEGS,
                    new Item.Properties().tab(pinkExpansion.TAB)));
    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.FEET,
                    new Item.Properties().tab(pinkExpansion.TAB)));

    public static final RegistryObject<Item> ROSE_GOLD_HORSE_ARMOR = ITEMS.register("rose_gold_horse_armor",
            () -> new HorseArmorItem(9, "rose_gold",
                    new Item.Properties().tab(pinkExpansion.TAB)));
}





