package com.robertorange.pinkexpansion.registry;

import com.robertorange.pinkexpansion.pinkExpansion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class ModBlockTags {

        public static final TagKey<Block> PINK_IVORY_LOGS = createTag("pink_ivory_logs");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(new ResourceLocation(pinkExpansion.MOD_ID, name));
        }
    }

    public static class ModItemTags {

        public static final TagKey<Item> PINK_IVORY_LOGS = createTag("pink_ivory_logs");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(new ResourceLocation(pinkExpansion.MOD_ID, name));
        }
    }
}
