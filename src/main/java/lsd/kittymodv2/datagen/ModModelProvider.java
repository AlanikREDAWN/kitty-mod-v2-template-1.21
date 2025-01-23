package lsd.kittymodv2.datagen;

import lsd.kittymodv2.block.ModBlocks;
import lsd.kittymodv2.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool pinkGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YARN_BLOCK);



        pinkGarnetPool.stairs(ModBlocks.PINK_GARNET_STAIRS);
        pinkGarnetPool.slab(ModBlocks.PINK_GARNET_SLAB);

        pinkGarnetPool.button(ModBlocks.PINK_GARNET_BUTTON);
        pinkGarnetPool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

        pinkGarnetPool.fence(ModBlocks.PINK_GARNET_FENCE);
        pinkGarnetPool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);
        pinkGarnetPool.wall(ModBlocks.PINK_GARNET_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CATNIP_PLANT, ModBlocks.CATNIP_PLANT_POT, BlockStateModelGenerator.TintType.NOT_TINTED);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STARLIGHT_ASHES, Models.GENERATED);
        itemModelGenerator.register(ModItems.LASER_POINTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_COLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_COLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_COLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_COLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_COLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_COLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_COLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.CATNIP_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREY_COLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEOW_MUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_COLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEAL_COLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.DANGLE_TOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_COLLAR, Models.GENERATED);
//        itemModelGenerator.register(ModItems.FOOD_BOWL, Models.GENERATED);
//        itemModelGenerator.register(ModItems.MILK_BOWL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAT_BELL, Models.GENERATED);
//        itemModelGenerator.register(ModItems.CAT_BED, Models.GENERATED);
        itemModelGenerator.register(ModItems.CATNIP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.TREAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.YARN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAT_FUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.FUR_BRUSH, Models.GENERATED);
    }
}
