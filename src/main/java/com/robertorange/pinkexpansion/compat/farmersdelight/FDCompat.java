package com.robertorange.pinkexpansion.compat.farmersdelight;

import com.robertorange.pinkexpansion.registry.ModBlocks;
import com.robertorange.pinkexpansion.registry.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.block.CabinetBlock;

import java.util.function.Supplier;

public class FDCompat {

    public static final RegistryObject<Block> PINK_IVORY_CABINET;
    public static final RegistryObject<Block> ORANGE_CRATE;

    static {
        PINK_IVORY_CABINET = registerBlock("pink_ivory_cabinet", () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
        ORANGE_CRATE = registerBlock("orange_crate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ModBlocks.BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));
        return toReturn;
    }



    public static void init() {
    }
}
