package com.pnku.mcmv.block;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class MoreComposterBlock extends ComposterBlock {
    public final String composterType;

    public MoreComposterBlock(MapColor colour, String composterType) {
        super(Settings.copy(Blocks.COMPOSTER).mapColor(colour));
        this.composterType = composterType;
    }

    public MoreComposterBlock(MapColor colour, BlockSoundGroup sound, String composterType) {
        super(Settings.copy(Blocks.COMPOSTER).mapColor(colour).sounds(sound));
        this.composterType = composterType;
    }
}