package com.robertorange.pinkexpansion.block.entity;

import com.robertorange.pinkexpansion.registry.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ModSignBlockEntity extends SignBlockEntity {
    public ModSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    @NotNull
    public BlockEntityType<?> getType() {
        return ModBlockEntityTypes.SIGN.get();
    }
}