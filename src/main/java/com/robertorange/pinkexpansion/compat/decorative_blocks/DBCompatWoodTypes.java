package com.robertorange.pinkexpansion.compat.decorative_blocks;

import com.robertorange.pinkexpansion.pinkExpansion;
import com.robertorange.pinkexpansion.registry.ModBlocks;
import lilypuree.decorative_blocks.blocks.types.IWoodType;
import net.minecraft.world.level.block.Block;

public enum DBCompatWoodTypes implements IWoodType {
    PINK_IVORY("pink_ivory");

    private final String name;

    DBCompatWoodTypes(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String namespace() {
        return pinkExpansion.MOD_ID;
    }

    @Override
    public Block getLog() {
        switch(this) {
            default:
                return ModBlocks.PINK_IVORY_LOG.get();
        }
    }

    @Override
    public Block getStrippedLog() {
        switch(this) {
            default:
                return ModBlocks.STRIPPED_PINK_IVORY_LOG.get();
        }
    }

    @Override
    public Block getSlab() {
        switch(this) {
            default:
                return ModBlocks.PINK_IVORY_SLAB.get();
        }
    }

    @Override
    public Block getFence() {
        switch(this) {
            default:
                return ModBlocks.PINK_IVORY_FENCE.get();
        }
    }

    @Override
    public Block getPlanks() {
        switch(this) {
            default:
                return ModBlocks.PINK_IVORY_PLANKS.get();
        }
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public boolean isFlammable() {
        return true;
    }
}
