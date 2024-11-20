package net.st0rmpr0of.gaomons;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.st0rmpr0of.gaomons.block.ModBlockEntityTypes;
import net.st0rmpr0of.gaomons.block.ModBlocks;
import net.st0rmpr0of.gaomons.item.ModItemGroups;
import net.st0rmpr0of.gaomons.item.ModItems;
import net.st0rmpr0of.gaomons.screenHandler.ModScreenHandlerTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GaoMons implements ModInitializer {
	public static final String MOD_ID = "gaomons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntityTypes.registerModBlockEntityTypes();
		ModScreenHandlerTypes.registerModScreenHandlerTypes();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}