package com.robertorange.pinkexpansion.block;

import com.robertorange.pinkexpansion.block.grower.PinkIvoryTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class PinkIvorySaplingBlock extends SaplingBlock {
    public PinkIvorySaplingBlock() {
        super(new PinkIvoryTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.WOOD));
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(Blocks.SAND) || pState.is(Blocks.RED_SAND);
    }
}
