package lsd.kittymodv2.item;

import lsd.kittymodv2.KittyModV2;
import lsd.kittymodv2.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KittyModV2.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.kittymodv2.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);

                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.STARLIGHT_ASHES);
                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KittyModV2.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.kittymodv2.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                        entries.add(ModBlocks.MAGIC_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_SLAB);

                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_WALL);

                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);


                    }).build());
    public static final ItemGroup COLLAR_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KittyModV2.MOD_ID, "collar_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RED_COLLAR))
                    .displayName(Text.translatable("itemgroup.kittymodv2.collar_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_COLLAR);
                        entries.add(ModItems.ORANGE_COLLAR);
                        entries.add(ModItems.YELLOW_COLLAR);
                        entries.add(ModItems.GREEN_COLLAR);
                        entries.add(ModItems.BLUE_COLLAR);
                        entries.add(ModItems.TEAL_COLLAR);
                        entries.add(ModItems.PURPLE_COLLAR);
                        entries.add(ModItems.PINK_COLLAR);
                        entries.add(ModItems.BLACK_COLLAR);
                        entries.add(ModItems.GREY_COLLAR);
                        entries.add(ModItems.WHITE_COLLAR);

                    }).build());

    public static final ItemGroup CAT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KittyModV2.MOD_ID, "cat_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.YARN))
                    .displayName(Text.translatable("itemgroup.kittymodv2.cat_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.YARN_BLOCK);
                        entries.add(ModItems.CAT_BELL);
                        entries.add(ModItems.MEOW_MUFFIN);
                        entries.add(ModItems.TREAT);
                        entries.add(ModItems.CATNIP);
                        entries.add(ModItems.YARN);
                        entries.add(ModItems.CATNIP_LEAF);
                        entries.add(ModBlocks.SCRATCHING_POST);
                        entries.add(ModItems.DANGLE_TOY);
                        entries.add(ModBlocks.LITTER_BOX);
                        entries.add(ModBlocks.CARDBOARD_BOX);
                        entries.add(ModItems.CAT_FUR);
                        entries.add(ModItems.FUR_BRUSH);
                        entries.add(ModBlocks.CAT_BED);
                        entries.add(ModBlocks.FOOD_BOWL);
                        entries.add(ModBlocks.MILK_BOWL);
                        entries.add(ModBlocks.CATNIP_PLANT);
//                        entries.add(ModBlocks.CATNIP_PLANT_POT);

                    }).build());

    public static void registerItemGroups() {
        KittyModV2.LOGGER.info("Registering Item Groups for " + KittyModV2.MOD_ID);
    }
}
