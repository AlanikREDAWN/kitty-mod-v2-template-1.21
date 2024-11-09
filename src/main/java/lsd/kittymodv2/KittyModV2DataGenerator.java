package lsd.kittymodv2;

import lsd.kittymodv2.datagen.ModBlockTagProvider;
import lsd.kittymodv2.datagen.ModItemTagProvider;
import lsd.kittymodv2.datagen.ModLootTableProvider;
import lsd.kittymodv2.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class KittyModV2DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
