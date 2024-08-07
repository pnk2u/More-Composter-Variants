package de.pnku.mcmv.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreComposterBlock extends ComposterBlock {
    public final String composterType;

    public MoreComposterBlock(MapColor colour, String composterType) {
        super(Properties.ofFullCopy(Blocks.COMPOSTER).mapColor(colour));
        this.composterType = composterType;
    }

    public MoreComposterBlock(MapColor colour, SoundType sound, String composterType) {
        super(Properties.ofFullCopy(Blocks.COMPOSTER).mapColor(colour).sound(sound));
        this.composterType = composterType;
    }
}