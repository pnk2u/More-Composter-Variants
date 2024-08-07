package de.pnku.mcmv.init;

import de.pnku.mcmv.MoreComposterVariants;
import de.pnku.mcmv.block.MoreComposterBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class McmvItemInit {
    public static final BlockItem OAK_COMPOSTER_I = new BlockItem(McmvBlockInit.OAK_COMPOSTER, new Item.Properties());
    public static final BlockItem SPRUCE_COMPOSTER_I = new BlockItem(McmvBlockInit.SPRUCE_COMPOSTER, new Item.Properties());
    public static final BlockItem BIRCH_COMPOSTER_I = new BlockItem(McmvBlockInit.BIRCH_COMPOSTER, new Item.Properties());
    public static final BlockItem JUNGLE_COMPOSTER_I = new BlockItem(McmvBlockInit.JUNGLE_COMPOSTER, new Item.Properties());
    public static final BlockItem ACACIA_COMPOSTER_I = new BlockItem(McmvBlockInit.ACACIA_COMPOSTER, new Item.Properties());
    public static final BlockItem DARK_OAK_COMPOSTER_I = new BlockItem(McmvBlockInit.DARK_OAK_COMPOSTER, new Item.Properties());
    public static final BlockItem MANGROVE_COMPOSTER_I = new BlockItem(McmvBlockInit.MANGROVE_COMPOSTER, new Item.Properties());
    public static final BlockItem CHERRY_COMPOSTER_I = new BlockItem(McmvBlockInit.CHERRY_COMPOSTER, new Item.Properties());
    public static final BlockItem BAMBOO_COMPOSTER_I = new BlockItem(McmvBlockInit.BAMBOO_COMPOSTER, new Item.Properties());
    public static final BlockItem CRIMSON_COMPOSTER_I = new BlockItem(McmvBlockInit.CRIMSON_COMPOSTER, new Item.Properties());
    public static final BlockItem WARPED_COMPOSTER_I = new BlockItem(McmvBlockInit.WARPED_COMPOSTER, new Item.Properties());


    public static void registerItems() {
        registerItem(OAK_COMPOSTER_I, Items.COMPOSTER);
        registerItem(SPRUCE_COMPOSTER_I, OAK_COMPOSTER_I);
        registerItem(BIRCH_COMPOSTER_I, SPRUCE_COMPOSTER_I);
        registerItem(JUNGLE_COMPOSTER_I, BIRCH_COMPOSTER_I);
        registerItem(ACACIA_COMPOSTER_I, JUNGLE_COMPOSTER_I);
        registerItem(DARK_OAK_COMPOSTER_I, ACACIA_COMPOSTER_I);
        registerItem(MANGROVE_COMPOSTER_I, DARK_OAK_COMPOSTER_I);
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