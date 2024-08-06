package com.pnku.mcmv.init;

import com.pnku.mcmv.MoreComposterVariants;
import com.pnku.mcmv.block.MoreComposterBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

public class McmvBlockInit {
    public static final MoreComposterBlock OAK_COMPOSTER = new MoreComposterBlock(MapColor.WOOD, "oak");
    public static final MoreComposterBlock SPRUCE_COMPOSTER = new MoreComposterBlock(MapColor.PODZOL, "spruce");
    public static final MoreComposterBlock BIRCH_COMPOSTER = new MoreComposterBlock(MapColor.SAND, "birch");
    public static final MoreComposterBlock JUNGLE_COMPOSTER = new MoreComposterBlock(MapColor.DIRT, "jungle");
    public static final MoreComposterBlock ACACIA_COMPOSTER = new MoreComposterBlock(MapColor.COLOR_ORANGE, "acacia");
    public static final MoreComposterBlock DARK_OAK_COMPOSTER = new MoreComposterBlock(MapColor.COLOR_BROWN, "dark_oak");
    public static final MoreComposterBlock MANGROVE_COMPOSTER = new MoreComposterBlock(MapColor.COLOR_RED, "mangrove");
    public static final MoreComposterBlock CHERRY_COMPOSTER = new MoreComposterBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry");
    public static final MoreComposterBlock BAMBOO_COMPOSTER = new MoreComposterBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo");
    public static final MoreComposterBlock CRIMSON_COMPOSTER = new MoreComposterBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson");
    public static final MoreComposterBlock WARPED_COMPOSTER = new MoreComposterBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped");

    public static final List<Block> more_composters = new ArrayList<>();


    public static void registerBlocks() {
        registerBlock(OAK_COMPOSTER);
        registerBlock(SPRUCE_COMPOSTER);
        registerBlock(BIRCH_COMPOSTER);
        registerBlock(JUNGLE_COMPOSTER);
        registerBlock(ACACIA_COMPOSTER);
        registerBlock(DARK_OAK_COMPOSTER);
        registerBlock(MANGROVE_COMPOSTER);
        registerBlock(CHERRY_COMPOSTER);
        registerBlock(BAMBOO_COMPOSTER);
        registerBlock(CRIMSON_COMPOSTER);
        registerBlock(WARPED_COMPOSTER);

    }

    private static void registerBlock(MoreComposterBlock composter) {
        Registry.register(BuiltInRegistries.BLOCK, MoreComposterVariants.asId(composter.composterType + "_composter"), composter);
        more_composters.add(composter);
    }
}