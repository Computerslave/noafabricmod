package fr.computerslave.noafabricmod;

import fr.computerslave.noafabricmod.block.Blocks;
import fr.computerslave.noafabricmod.item.Items;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NoaFabricMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("noafabricmod");
	public static final String MOD_ID = "noafabricmod";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Items.registerItems();
		Blocks.registerBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}
