package com.robertorange.pinkexpansion.compat.quark;

import com.robertorange.pinkexpansion.compat.quark.block.*;
import com.robertorange.pinkexpansion.compat.quark.block.entity.ModChestBlockEntity;
import com.robertorange.pinkexpansion.compat.quark.block.entity.ModTrappedChestBlockEntity;
import com.robertorange.pinkexpansion.compat.quark.item.ModChestBlockItem;
import com.robertorange.pinkexpansion.pinkExpansion;
import com.robertorange.pinkexpansion.registry.ModBlockEntityTypes;
import com.robertorange.pinkexpansion.registry.ModBlocks;
import com.robertorange.pinkexpansion.registry.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class QuarkCompat {
    public static final RegistryObject<Block> PINK_IVORY_VERTICAL_SLAB;
    public static final RegistryObject<Block> STRIPPED_PINK_IVORY_POST;
    public static final RegistryObject<Block> PINK_IVORY_POST;
    public static final RegistryObject<Block> PINK_IVORY_LADDER;
    public static final RegistryObject<Block> PINK_IVORY_BOOKSHELF;
    public static final RegistryObject<Block> PINK_IVORY_LEAF_CARPET;
    public static final RegistryObject<Block> PINK_IVORY_HEDGE;
    public static final RegistryObject<Block> PINK_IVORY_CHEST;
    public static final RegistryObject<Block> PINK_IVORY_TRAPPED_CHEST;
    public static final RegistryObject<Block> RHODONITE_BRICKS;

    public static final RegistryObject<Block> RHODONITE_BRICK_STAIRS;

    public static final RegistryObject<Block> RHODONITE_BRICK_SLAB;

    public static final RegistryObject<Block> RHODONITE_BRICK_WALL;


    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> CHEST;
    public static final RegistryObject<BlockEntityType<ModTrappedChestBlockEntity>> TRAPPED_CHEST;

    static {
        PINK_IVORY_VERTICAL_SLAB = registerBlock("pink_ivory_vertical_slab", VerticalSlabBlock::new, CreativeModeTab.TAB_BUILDING_BLOCKS);
        STRIPPED_PINK_IVORY_POST = registerBlock("stripped_pink_ivory_post", WoodPostBlock::new, CreativeModeTab.TAB_BUILDING_BLOCKS);
        PINK_IVORY_POST = registerBlock("pink_ivory_post", () -> new WoodPostBlock(STRIPPED_PINK_IVORY_POST), CreativeModeTab.TAB_BUILDING_BLOCKS);
        PINK_IVORY_LADDER = registerBlock("pink_ivory_ladder", () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)), CreativeModeTab.TAB_DECORATIONS);
        PINK_IVORY_BOOKSHELF = registerBlock("pink_ivory_bookshelf", BookshelfBlock::new, CreativeModeTab.TAB_BUILDING_BLOCKS);
        PINK_IVORY_LEAF_CARPET = registerBlock("pink_ivory_leaf_carpet", LeafCarpetBlock::new, CreativeModeTab.TAB_DECORATIONS);
        PINK_IVORY_HEDGE = registerBlock("pink_ivory_hedge", HedgeBlock::new, CreativeModeTab.TAB_DECORATIONS);
        PINK_IVORY_CHEST = registerChest("pink_ivory_chest", () -> new ModChestBlock(ChestVariant.PINK_IVORY));
        PINK_IVORY_TRAPPED_CHEST = registerChest("pink_ivory_trapped_chest", () -> new ModTrappedChestBlock(ChestVariant.PINK_IVORY_TRAPPED));

        //RHODONITE
        RHODONITE_BRICKS = registerBlock("rhodonite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)), pinkExpansion.TAB);
        RHODONITE_BRICK_STAIRS = registerBlock("rhodonite_brick_stairs", () -> new StairBlock(() -> ModBlocks.RHODONITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), pinkExpansion.TAB);
        RHODONITE_BRICK_SLAB = registerBlock("rhodonite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), pinkExpansion.TAB);
        RHODONITE_BRICK_WALL = registerBlock("rhodonite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), pinkExpansion.TAB);

        CHEST = ModBlockEntityTypes.BLOCK_ENTITY_TYPES.register("chest", () -> BlockEntityType.Builder.of(ModChestBlockEntity::new, PINK_IVORY_CHEST.get()).build(null));
        TRAPPED_CHEST = ModBlockEntityTypes.BLOCK_ENTITY_TYPES.register("trapped_chest", () -> BlockEntityType.Builder.of(ModTrappedChestBlockEntity::new, PINK_IVORY_TRAPPED_CHEST.get()).build(null));
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = ModBlocks.BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().tab(tab)));
        return toReturn;
    }

    public static <T extends Block> RegistryObject<T> registerChest(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ModBlocks.BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new ModChestBlockItem(toReturn.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
        return toReturn;
    }

    public static void init() {
    }
}
