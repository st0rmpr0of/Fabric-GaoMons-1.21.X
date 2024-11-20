package net.st0rmpr0of.gaomons.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.st0rmpr0of.gaomons.GaoMons;
import net.st0rmpr0of.gaomons.block.custom.FuserBlock;

public class ModBlocks {

    public static final Block FUSER_BLOCK = registerBlock("fuser_block",
            new FuserBlock(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GaoMons.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GaoMons.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GaoMons.LOGGER.info("Registering Mod Blocks for " + GaoMons.MOD_ID);
    }
}
