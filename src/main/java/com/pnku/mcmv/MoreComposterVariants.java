package com.pnku.mcmv;

import com.pnku.mcmv.init.McmvBlockInit;
import com.pnku.mcmv.init.McmvItemInit;
import com.pnku.mcmv.poi.McmvPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class MoreComposterVariants implements ModInitializer {
    public static final String MODID = "lolmcmv";

    @Override
    public void onInitialize() {
        McmvBlockInit.registerBlocks();
        McmvItemInit.registerItems();
        McmvPointOfInterestTypes.init();
    }

    public static Identifier asId(String path) {
        return new Identifier(MODID, path);
    }
}