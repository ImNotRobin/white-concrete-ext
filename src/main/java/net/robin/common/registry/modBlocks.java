package net.robin.common.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.robin.wce;

public class modBlocks {

    public static Block registerBlock(String id, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(wce.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, Identifier.of(wce.MOD_ID, id), block);
    }

    public static final Block white_concrete_stair = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block white_concrete_slab = registerBlock("white_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));

    private static void addItemToColoredBlocks(FabricItemGroupEntries entries) {
        entries.add(white_concrete_stair.asItem());
        entries.add(white_concrete_slab.asItem());
    }

    public static void registerBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(modBlocks::addItemToColoredBlocks);
    }
}
