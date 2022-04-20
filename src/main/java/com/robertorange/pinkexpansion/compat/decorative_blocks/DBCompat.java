package com.robertorange.pinkexpansion.compat.decorative_blocks;

import com.robertorange.pinkexpansion.registry.ModBlocks;
import com.robertorange.pinkexpansion.registry.ModItems;
import lilypuree.decorative_blocks.Constants;
import lilypuree.decorative_blocks.blocks.types.WoodDecorativeBlockTypes;
import lilypuree.decorative_blocks.core.DBBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class DBCompat {
    public static final RegistryObject<Block> PINK_IVORY_BEAM;
    public static final RegistryObject<Block> PINK_IVORY_SUPPORT;
    public static final RegistryObject<Block> PINK_IVORY_PALISADE;
    public static final RegistryObject<Block> PINK_IVORY_SEAT;

    static {
        PINK_IVORY_BEAM = registerBlock("pink_ivory_beam", () -> DBBlocks.createDecorativeBlock(DBCompatWoodTypes.PINK_IVORY, WoodDecorativeBlockTypes.BEAM));
        PINK_IVORY_SUPPORT = registerBlock("pink_ivory_support", () -> DBBlocks.createDecorativeBlock(DBCompatWoodTypes.PINK_IVORY, WoodDecorativeBlockTypes.SUPPORT));
        PINK_IVORY_PALISADE = registerBlock("pink_ivory_palisade", () -> DBBlocks.createDecorativeBlock(DBCompatWoodTypes.PINK_IVORY, WoodDecorativeBlockTypes.PALISADE));
        PINK_IVORY_SEAT = registerBlock("pink_ivory_seat", () -> DBBlocks.createDecorativeBlock(DBCompatWoodTypes.PINK_IVORY, WoodDecorativeBlockTypes.SEAT));

}

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ModBlocks.BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().tab(Constants.ITEM_GROUP)));
        return toReturn;
    }
    
    public static void init() {
    }
}
