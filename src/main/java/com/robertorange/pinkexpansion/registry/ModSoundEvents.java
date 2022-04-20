package com.robertorange.pinkexpansion.registry;

import com.robertorange.pinkexpansion.pinkExpansion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, pinkExpansion.MOD_ID);

public static final RegistryObject<SoundEvent> FLAMINGO_AMBIENT = SOUND_EVENTS.register("flamingo_ambient", () -> new SoundEvent(new ResourceLocation(pinkExpansion.MOD_ID, "entity.flamingo.ambient")));
    public static final RegistryObject<SoundEvent> FLAMINGO_DEATH = SOUND_EVENTS.register("flamingo_death", () -> new SoundEvent(new ResourceLocation(pinkExpansion.MOD_ID, "entity.flamingo.death")));
    public static final RegistryObject<SoundEvent> FLAMINGO_HURT = SOUND_EVENTS.register("flamingo_hurt", () -> new SoundEvent(new ResourceLocation(pinkExpansion.MOD_ID, "entity.flamingo.hurt")));
}
