package com.robertorange.pinkexpansion.registry;

import com.robertorange.pinkexpansion.block.ModStandingSignBlock;
import com.robertorange.pinkexpansion.block.ModWallSignBlock;
import com.robertorange.pinkexpansion.block.custom.ModFlammableRotatedPillarBlock;
import com.robertorange.pinkexpansion.block.grower.PinkIvoryTreeGrower;
import com.robertorange.pinkexpansion.block.properties.ModWoodTypes;
import com.robertorange.pinkexpansion.pinkExpansion;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, pinkExpansion.MOD_ID);


    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(pinkExpansion.TAB)));
    }

    //PINK IVORY
    //Wood and Logs
    public static final RegistryObject<RotatedPillarBlock> PINK_IVORY_LOG = registerBlock("pink_ivory_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG))
    );
    public static final RegistryObject<RotatedPillarBlock> PINK_IVORY_WOOD = registerBlock("pink_ivory_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD))
    );
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_PINK_IVORY_LOG = registerBlock("stripped_pink_ivory_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG))
    );
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_PINK_IVORY_WOOD = registerBlock("stripped_pink_ivory_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD))
    );

    //Sign
    public static final RegistryObject<ModStandingSignBlock> PINK_IVORY_SIGN = BLOCKS.register("pink_ivory_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodTypes.PINK_IVORY));
    public static final RegistryObject<ModWallSignBlock> PINK_IVORY_WALL_SIGN = BLOCKS.register("pink_ivory_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(PINK_IVORY_SIGN.get()), ModWoodTypes.PINK_IVORY));


    //Stairs
    public static final RegistryObject<StairBlock> PINK_IVORY_STAIRS = registerBlock("pink_ivory_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_IVORY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(5f).requiresCorrectToolForDrops()));

    //Slab
    public static final RegistryObject<SlabBlock> PINK_IVORY_SLAB = registerBlock("pink_ivory_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops()));

    //Fences
    public static final RegistryObject<FenceBlock> PINK_IVORY_FENCE = registerBlock("pink_ivory_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> PINK_IVORY_FENCE_GATE = registerBlock("pink_ivory_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops()));

    //Button
    public static final RegistryObject<WoodButtonBlock> PINK_IVORY_BUTTON = registerBlock("pink_ivory_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noCollission()));

    //Pressure Plate
    public static final RegistryObject<PressurePlateBlock> PINK_IVORY_PRESSURE_PLATE = registerBlock("pink_ivory_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops()));

    //Planks
    public static final RegistryObject<Block> PINK_IVORY_PLANKS = registerBlock("pink_ivory_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    //Leafs
    public static final RegistryObject<LeavesBlock> PINK_IVORY_LEAVES = registerBlock("pink_ivory_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));


    //Door
    public static final RegistryObject<DoorBlock> PINK_IVORY_DOOR = registerBlock("pink_ivory_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()));

    //Trapdoor
    public static final RegistryObject<TrapDoorBlock> PINK_IVORY_TRAPDOOR = registerBlock("pink_ivory_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()));

    //Seed
    public static final RegistryObject<SaplingBlock> PINK_IVORY_SAPLING = registerBlock("pink_ivory_sapling", () -> new SaplingBlock(new PinkIvoryTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    //ROSE GOLD
    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));

    //ROSE QUARTZ

    //Rose quartz ore
    public static final RegistryObject<Block> ROSE_QUARTZ_ORE = registerBlock("rose_quartz_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_ROSE_QUARTZ_ORE = registerBlock("deepslate_rose_quartz_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(2f).requiresCorrectToolForDrops()));

    //Rhodonite
    public static final RegistryObject<Block> RHODONITE = registerBlock("rhodonite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<StairBlock> RHODONITE_STAIRS = registerBlock("rhodonite_stairs",
            () -> new StairBlock(() -> ModBlocks.RHODONITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> RHODONITE_SLAB = registerBlock("rhodonite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RHODONITE_WALL = registerBlock("rhodonite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));


    //Polished Rhodonite
    public static final RegistryObject<Block> POLISHED_RHODONITE = registerBlock("polished_rhodonite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<StairBlock> POLISHED_RHODONITE_STAIRS = registerBlock("polished_rhodonite_stairs",
            () -> new StairBlock(() -> ModBlocks.RHODONITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> POLISHED_RHODONITE_SLAB = registerBlock("polished_rhodonite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_RHODONITE_WALL = registerBlock("polished_rhodonite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ModBlocks.BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().tab(pinkExpansion.TAB)));
        return toReturn;
    }


}