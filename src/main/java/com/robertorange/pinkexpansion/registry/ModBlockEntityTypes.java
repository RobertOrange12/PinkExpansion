package com.robertorange.pinkexpansion.registry;

import com.robertorange.pinkexpansion.block.entity.ModSignBlockEntity;
import com.robertorange.pinkexpansion.pinkExpansion;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, pinkExpansion.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN = BLOCK_ENTITY_TYPES.register("sign", () -> BlockEntityType.Builder.of(ModSignBlockEntity::new,
            ModBlocks.PINK_IVORY_SIGN.get(), ModBlocks.PINK_IVORY_WALL_SIGN.get()
    ).build(null));



}