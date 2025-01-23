package lsd.kittymodv2;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import lsd.kittymodv2.block.ModBlocks;
import net.fabricmc.fabric.impl.registry.sync.trackers.vanilla.BlockInitTracker;
import net.minecraft.client.render.RenderLayer;

public class KittyModV2Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CATNIP_PLANT, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CATNIP_PLANT_POT, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.CATNIP_PLANT);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.CATNIP_PLANT_POT);
	}
}