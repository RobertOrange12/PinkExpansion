package com.robertorange.pinkexpansion.event;

import com.robertorange.pinkexpansion.block.properties.ModWoodTypes;
import com.robertorange.pinkexpansion.pinkExpansion;
import com.robertorange.pinkexpansion.registry.ModBlocks;
import com.robertorange.pinkexpansion.registry.ModOreGeneration;
import cpw.mods.modlauncher.api.LamdbaExceptionUtils;
import lilypuree.decorative_blocks.core.DBTags;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.items.ItemHandlerHelper;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = pinkExpansion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventHandler {
    @SubscribeEvent
    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            WoodType.register(ModWoodTypes.PINK_IVORY);
        });
        ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_IVORY_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_IVORY_SAPLING.get().asItem(), 0.3F);
    }
}
