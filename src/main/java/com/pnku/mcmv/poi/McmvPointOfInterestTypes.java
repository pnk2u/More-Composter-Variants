package com.pnku.mcmv.poi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.pnku.mcmv.init.McmvBlockInit;
import com.pnku.mcmv.mixin.PointOfInterestTypesAccessor;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class McmvPointOfInterestTypes {
    public static void init() {
        Map<BlockState, RegistryEntry<PointOfInterestType>> poiStatesToType = PointOfInterestTypesAccessor
                .getPointOfInterestStatesToType();

        RegistryEntry<PointOfInterestType> farmerEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.FARMER).get();

        PointOfInterestType farmerPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.FARMER);

        List<BlockState> farmerBlockStates = new ArrayList<BlockState>(farmerPoiType.blockStates);

        for (Block block : McmvBlockInit.more_composters) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, farmerEntry);
            }

            farmerBlockStates.addAll(blockStates);
        }

        farmerPoiType.blockStates = ImmutableSet.copyOf(farmerBlockStates);
    }
}