package com.robertorange.pinkexpansion;

import com.robertorange.pinkexpansion.biome.PinkRegion;
import com.robertorange.pinkexpansion.compat.ModCompat;
import com.robertorange.pinkexpansion.registry.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import terrablender.api.Regions;

@Mod("pinkexpansion")
@Mod.EventBusSubscriber(modid = pinkExpansion.MOD_ID)
public class pinkExpansion{

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "pinkexpansion";
    public static final CreativeModeTab TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.ROSE_GOLD_BLOCK.get());
        }
    };

    public pinkExpansion() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModConfiguration.COMMON_CONFIG);

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModEntityTypes.ENTITY_TYPES.register(bus);
        ModBlockEntityTypes.BLOCK_ENTITY_TYPES.register(bus);
        ModCompat.init();

        Regions.register(new PinkRegion(new ResourceLocation(MOD_ID, "overworld"), 2));

        MinecraftForge.EVENT_BUS.register(this);

    }
}