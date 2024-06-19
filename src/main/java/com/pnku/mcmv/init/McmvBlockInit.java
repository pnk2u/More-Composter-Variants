package com.pnku.mcmv.init;

import com.pnku.mcmv.MoreComposterVariants;
import com.pnku.mcmv.block.MoreComposterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

import java.util.ArrayList;
import java.util.List;

public class McmvBlockInit {
    public static final MoreComposterBlock OAK_COMPOSTER = new MoreComposterBlock(MapColor.OAK_TAN, "oak");
    public static final MoreComposterBlock SPRUCE_COMPOSTER = new MoreComposterBlock(MapColor.SPRUCE_BROWN, "spruce");
    public static final MoreComposterBlock BIRCH_COMPOSTER = new MoreComposterBlock(MapColor.PALE_YELLOW, "birch");
    public static final MoreComposterBlock JUNGLE_COMPOSTER = new MoreComposterBlock(MapColor.DIRT_BROWN, "jungle");
    public static final MoreComposterBlock ACACIA_COMPOSTER = new MoreComposterBlock(MapColor.ORANGE, "acacia");
    public static final MoreComposterBlock DARK_OAK_COMPOSTER = new MoreComposterBlock(MapColor.BROWN, "dark_oak");
    public static final MoreComposterBlock MANGROVE_COMPOSTER = new MoreComposterBlock(MapColor.RED, "mangrove");
    public static final MoreComposterBlock CHERRY_COMPOSTER = new MoreComposterBlock(MapColor.TERRACOTTA_WHITE, BlockSoundGroup.CHERRY_WOOD, "cherry");
    public static final MoreComposterBlock BAMBOO_COMPOSTER = new MoreComposterBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD, "bamboo");
    public static final MoreComposterBlock CRIMSON_COMPOSTER = new MoreComposterBlock(MapColor.DULL_PINK, BlockSoundGroup.NETHER_WOOD, "crimson");
    public static final MoreComposterBlock WARPED_COMPOSTER = new MoreComposterBlock(MapColor.DARK_AQUA, BlockSoundGroup.NETHER_WOOD, "warped");

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
        Registry.register(Registries.BLOCK, MoreComposterVariants.asId(composter.composterType + "_composter"), composter);
        more_composters.add(composter);
    }
}