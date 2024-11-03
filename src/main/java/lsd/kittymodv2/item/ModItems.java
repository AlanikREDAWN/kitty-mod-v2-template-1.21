package lsd.kittymodv2.item;

import lsd.kittymodv2.KittyModV2;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item STAR = registerItem("star", new Item(new Item.Settings()));
    public static final Item RED_COLLAR = registerItem("red_collar", new Item(new Item.Settings()));
    public static final Item ORANGE_COLLAR = registerItem("orange_collar", new Item(new Item.Settings()));
    public static final Item YELLOW_COLLAR = registerItem("yellow_collar", new Item(new Item.Settings()));
    public static final Item GREEN_COLLAR = registerItem("green_collar", new Item(new Item.Settings()));
    public static final Item BLUE_COLLAR = registerItem("blue_collar", new Item(new Item.Settings()));
    public static final Item TEAL_COLLAR = registerItem("teal_collar", new Item(new Item.Settings()));
    public static final Item PURPLE_COLLAR = registerItem("purple_collar", new Item(new Item.Settings()));
    public static final Item PINK_COLLAR = registerItem("pink_collar", new Item(new Item.Settings()));
    public static final Item BLACK_COLLAR = registerItem("black_collar", new Item(new Item.Settings()));
    public static final Item GREY_COLLAR = registerItem("grey_collar", new Item(new Item.Settings()));
    public static final Item WHITE_COLLAR = registerItem("white_collar", new Item(new Item.Settings()));
    public static final Item YARN = registerItem("yarn", new Item(new Item.Settings()));
    public static final Item CATNIP = registerItem("catnip", new Item(new Item.Settings()));
    public static final Item DANGLE_TOY = registerItem("dangle_toy", new Item(new Item.Settings()));
    public static final Item TREAT = registerItem("treat", new Item(new Item.Settings()));
    public static final Item MEOW_MUFFIN = registerItem("meow_muffin", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KittyModV2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        KittyModV2.LOGGER.info("Registering Mod Items for " + KittyModV2.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
            entries.add(YARN);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(STAR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(RED_COLLAR);
            entries.add(ORANGE_COLLAR);
            entries.add(YELLOW_COLLAR);
            entries.add(GREEN_COLLAR);
            entries.add(BLUE_COLLAR);
            entries.add(TEAL_COLLAR);
            entries.add(PURPLE_COLLAR);
            entries.add(PINK_COLLAR);
            entries.add(BLACK_COLLAR);
            entries.add(GREY_COLLAR);
            entries.add(WHITE_COLLAR);
            entries.add(DANGLE_TOY);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CATNIP);
            entries.add(TREAT);
            entries.add(MEOW_MUFFIN);
        });
    }
}
