package com.robertorange.pinkexpansion.client.renderer.entity;

import com.mojang.datafixers.util.Pair;
import com.robertorange.pinkexpansion.entity.ModBoat;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import com.robertorange.pinkexpansion.pinkExpansion;
public class ModBoatRenderer extends BoatRenderer {
    public static final ModelLayerLocation PINK_IVORY_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(pinkExpansion.MOD_ID, "boat/pink_ivory"), "main");

    private final Pair<ResourceLocation, BoatModel> pink_ivory;


    public ModBoatRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.shadowRadius = 0.8F;
        pink_ivory = new Pair<>(new ResourceLocation(pinkExpansion.MOD_ID, "textures/entity/boat/pink_ivory.png"), new BoatModel(context.bakeLayer(PINK_IVORY_LAYER_LOCATION)));
    }

    @Override
    public Pair<ResourceLocation, BoatModel> getModelWithLocation(Boat boat) {
        switch (((ModBoat)boat).getWoodType()) {
            default:
                return pink_ivory;
        }
    }
}
