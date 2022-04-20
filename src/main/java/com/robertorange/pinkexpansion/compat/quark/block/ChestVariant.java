package com.robertorange.pinkexpansion.compat.quark.block;

import com.robertorange.pinkexpansion.pinkExpansion;
import net.minecraft.resources.ResourceLocation;

// Credit to SnappyDragon18 for this helper class https://github.com/SnappyDragon18/Habitat/blob/1.18/src/main/java/mod/schnappdragon/habitat/common/block/ChestVariant.java
public enum ChestVariant {
    PINK_IVORY("pink_ivory"),
    PINK_IVORY_TRAPPED("pink_ivory", true);

    private final String location;

    ChestVariant(String name, boolean trapped) {
        this.location = name + "/" + name + (trapped ? "_trapped" : "");
    }

    ChestVariant(String name) {
        this(name, false);
    }

    public ResourceLocation getSingle() {
        return new ResourceLocation(pinkExpansion.MOD_ID, "entity/chest/" + this.location);
    }

    public ResourceLocation getRight() {
        return new ResourceLocation(pinkExpansion.MOD_ID, "entity/chest/" + this.location + "_right");
    }

    public ResourceLocation getLeft() {
        return new ResourceLocation(pinkExpansion.MOD_ID, "entity/chest/" + this.location + "_left");
    }
}
