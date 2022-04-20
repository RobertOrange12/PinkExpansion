package com.robertorange.pinkexpansion.compat.quark;

import com.robertorange.pinkexpansion.compat.quark.block.ChestVariant;
import com.robertorange.pinkexpansion.compat.quark.block.entity.ModChestRenderer;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class QuarkCompatClient {

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayers(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(QuarkCompat.PINK_IVORY_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkCompat.PINK_IVORY_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkCompat.PINK_IVORY_LEAF_CARPET.get(), RenderType.cutoutMipped());
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerBlockColors(ColorHandlerEvent.Block event) {
        event.getBlockColors().register((pState, pLevel, pPos, pTintIndex) -> pLevel != null && pPos != null ? BiomeColors.getAverageFoliageColor(pLevel, pPos) : FoliageColor.getDefaultColor(), QuarkCompat.PINK_IVORY_HEDGE.get(), QuarkCompat.PINK_IVORY_LEAF_CARPET.get());
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        event.getItemColors().register((pStack, pTintIndex) -> {
            BlockState blockstate = ((BlockItem)pStack.getItem()).getBlock().defaultBlockState();
            return event.getBlockColors().getColor(blockstate, null, null, pTintIndex);
        }, QuarkCompat.PINK_IVORY_HEDGE.get(), QuarkCompat.PINK_IVORY_LEAF_CARPET.get());
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(QuarkCompat.CHEST.get(), ModChestRenderer::new);
        event.registerBlockEntityRenderer(QuarkCompat.TRAPPED_CHEST.get(), ModChestRenderer::new);
    }

    @OnlyIn(Dist.CLIENT)
    public static void stitchTextures(TextureStitchEvent.Pre event) {
        if (event.getAtlas().location().equals(Sheets.CHEST_SHEET)) {
            for (ChestVariant variant : ChestVariant.values()) {
                event.addSprite(variant.getSingle());
                event.addSprite(variant.getRight());
                event.addSprite(variant.getLeft());
            }
        }
    }
}
