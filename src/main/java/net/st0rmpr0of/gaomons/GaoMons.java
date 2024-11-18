package net.st0rmpr0of.gaomons;

import net.fabricmc.api.ModInitializer;

import net.st0rmpr0of.gaomons.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GaoMons implements ModInitializer {
	public static final String MOD_ID = "GaoMons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}