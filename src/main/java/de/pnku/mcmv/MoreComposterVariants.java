package de.pnku.mcmv;

import de.pnku.mcmv.init.McmvBlockInit;
import de.pnku.mcmv.init.McmvItemInit;
import de.pnku.mcmv.poi.McmvPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;

public class MoreComposterVariants implements ModInitializer {
    public static final String MODID = "lolmcmv";

    @Override
    public void onInitialize() {
        McmvBlockInit.registerBlocks();
        McmvItemInit.registerItems();
        McmvPointOfInterestTypes.init();
    }


    public static Identifier asId(String path) {
        return Identifier.fromNamespaceAndPath(MODID, path);
    }
}