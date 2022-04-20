package com.robertorange.pinkexpansion.registry;

import com.robertorange.pinkexpansion.entity.ModBoat;
import com.robertorange.pinkexpansion.pinkExpansion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, pinkExpansion.MOD_ID);

    public static final RegistryObject<EntityType<ModBoat>> BOAT = ENTITY_TYPES.register("boat", () -> EntityType.Builder.<ModBoat>of(ModBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build(new ResourceLocation(pinkExpansion.MOD_ID, "boat").toString()));
}