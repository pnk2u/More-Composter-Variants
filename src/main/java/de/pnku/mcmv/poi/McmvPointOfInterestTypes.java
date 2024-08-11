package de.pnku.mcmv.poi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import de.pnku.mcmv.init.McmvBlockInit;
import de.pnku.mcmv.mixin.PoiTypesAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class McmvPointOfInterestTypes {
    public static void init() {
        Map<BlockState, Holder<PoiType>> poiStatesToType = PoiTypesAccessor
                .getPointOfInterestStatesToType();

        Holder<PoiType> composterEntry = BuiltInRegistries.POINT_OF_INTEREST_TYPE
                .getHolder(PoiTypes.FARMER).get();

        PoiType farmerPoiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.get(PoiTypes.FARMER);

        List<BlockState> composterBlockStates = new ArrayList<BlockState>(farmerPoiType.matchingStates);

        for (Block block : McmvBlockInit.more_composters) {
            ImmutableList<BlockState> blockStates = block.getStateDefinition().getPossibleStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, composterEntry);
            }

            composterBlockStates.addAll(blockStates);
        }

        farmerPoiType.matchingStates = ImmutableSet.copyOf(composterBlockStates);
    }
}