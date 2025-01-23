package lsd.kittymodv2;

//import lsd.kittymodv2.init.ItemInit;
import lsd.kittymodv2.block.ModBlocks;
import lsd.kittymodv2.item.ModItemGroups;
import lsd.kittymodv2.item.ModItems;
import lsd.kittymodv2.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KittyModV2 implements ModInitializer {
	public static final String MOD_ID = "kittymodv2";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSounds.registerSounds();
//		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CATNIP_PLANT, RenderLayer.getCutout());
//		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CATNIP_PLANT_POT, RenderLayer.getCutout());

//		ItemInit.load();
	}

//	public static Identifier id(String path) {
//		return Identifier.of(MOD_ID, path);
//	}
}