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

    public static void registerItemGroups() {
        KittyModV2.LOGGER.info("Registering Item Groups for " + KittyModV2.MOD_ID);
    }
}
