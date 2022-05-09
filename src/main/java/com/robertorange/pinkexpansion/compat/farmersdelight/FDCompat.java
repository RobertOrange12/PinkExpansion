package com.robertorange.pinkexpansion.compat.farmersdelight;

import com.robertorange.pinkexpansion.registry.ModBlocks;
import com.robertorange.pinkexpansion.registry.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import java.util.function.Supplier;

public class FDCompat {

    public static final RegistryObject<Block> PINK_IVORY_CABINET;
    public static final RegistryObject<Block> ORANGE_CRATE;
    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Item> ORANGE_JUICE;
    private static final RegistryObject<Item> ROSE_QUARTZ_MYSTICAL_WATER;

    static {
        PINK_IVORY_CABINET = registerBlock("pink_ivory_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
        ORANGE_CRATE = registerBlock("orange_crate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "pinkexpansion");
        ORANGE_JUICE = ITEMS.register("orange_juice", () -> {
            return new DrinkableItem((new Item.Properties()).food(FDCompat.ORANGE_JUICE_VALUES).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FarmersDelight.CREATIVE_TAB), true, false);
        });

        ROSE_QUARTZ_MYSTICAL_WATER = ITEMS.register("rose_quartz_mystical_water", () -> {
            return new DrinkableItem((new Item.Properties()).food(FDCompat.ROSE_QUARTZ_MYSTICAL_WATER_VALUES).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FarmersDelight.CREATIVE_TAB), true, false);
        });
    }


    public static final FoodProperties ORANGE_JUICE_VALUES = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0);
    }, 1.0F).build();

    public static final FoodProperties ROSE_QUARTZ_MYSTICAL_WATER_VALUES = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0);
    }, 1.0F).build();

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ModBlocks.BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));
        return toReturn;
    }



    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        FDCompat.ITEMS.register(bus);
    }
}
