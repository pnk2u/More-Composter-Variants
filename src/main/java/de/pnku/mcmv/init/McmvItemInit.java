package de.pnku.mcmv.init;

import de.pnku.mcmv.MoreComposterVariants;
import de.pnku.mcmv.block.MoreComposterBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import static de.pnku.mcmv.init.McmvBlockInit.*;

public class McmvItemInit {
    public static final BlockItem OAK_COMPOSTER_I = itemFromBlock(OAK_COMPOSTER);
    public static final BlockItem SPRUCE_COMPOSTER_I = itemFromBlock(SPRUCE_COMPOSTER);
    public static final BlockItem BIRCH_COMPOSTER_I = itemFromBlock(BIRCH_COMPOSTER);
    public static final BlockItem JUNGLE_COMPOSTER_I = itemFromBlock(JUNGLE_COMPOSTER);
    public static final BlockItem ACACIA_COMPOSTER_I = itemFromBlock(ACACIA_COMPOSTER);
    public static final BlockItem DARK_OAK_COMPOSTER_I = itemFromBlock(DARK_OAK_COMPOSTER);
    public static final BlockItem PALE_OAK_COMPOSTER_I = itemFromBlock(PALE_OAK_COMPOSTER);
    public static final BlockItem MANGROVE_COMPOSTER_I = itemFromBlock(MANGROVE_COMPOSTER);
    public static final BlockItem CHERRY_COMPOSTER_I = itemFromBlock(CHERRY_COMPOSTER);
    public static final BlockItem BAMBOO_COMPOSTER_I = itemFromBlock(BAMBOO_COMPOSTER);
    public static final BlockItem CRIMSON_COMPOSTER_I = itemFromBlock(CRIMSON_COMPOSTER);
    public static final BlockItem WARPED_COMPOSTER_I = itemFromBlock(WARPED_COMPOSTER);

    public static BlockItem itemFromBlock(MoreComposterBlock moreComposterBlock) {
        return new BlockItem(moreComposterBlock, setProperties(moreComposterBlock));
    }

    public static Item.Properties setProperties(MoreComposterBlock moreComposterBlock) {
        return new Item.Properties().setId(ResourceKey.create(Registries.ITEM, BuiltInRegistries.BLOCK.getKey(moreComposterBlock))).useBlockDescriptionPrefix();
    }

    public static void registerItems() {
        registerItem(OAK_COMPOSTER_I, Items.COMPOSTER);
        registerItem(SPRUCE_COMPOSTER_I, OAK_COMPOSTER_I);
        registerItem(BIRCH_COMPOSTER_I, SPRUCE_COMPOSTER_I);
        registerItem(JUNGLE_COMPOSTER_I, BIRCH_COMPOSTER_I);
        registerItem(ACACIA_COMPOSTER_I, JUNGLE_COMPOSTER_I);
        registerItem(DARK_OAK_COMPOSTER_I, ACACIA_COMPOSTER_I);
        registerItem(PALE_OAK_COMPOSTER_I, DARK_OAK_COMPOSTER_I);
        registerItem(MANGROVE_COMPOSTER_I, PALE_OAK_COMPOSTER_I);
        registerItem(CHERRY_COMPOSTER_I, MANGROVE_COMPOSTER_I);
        registerItem(BAMBOO_COMPOSTER_I, CHERRY_COMPOSTER_I);
        registerItem(CRIMSON_COMPOSTER_I, BAMBOO_COMPOSTER_I);
        registerItem(WARPED_COMPOSTER_I, CRIMSON_COMPOSTER_I);
    }

    private static void registerItem(BlockItem composter, Item composterAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreComposterVariants.asId(((MoreComposterBlock) composter.getBlock()).composterType + "_composter"), composter);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(composterAfter, composter));
    }
}