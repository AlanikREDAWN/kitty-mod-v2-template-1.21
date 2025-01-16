package lsd.kittymodv2.item;

import lsd.kittymodv2.KittyModV2;
import lsd.kittymodv2.item.custom.ChiselItem;
import lsd.kittymodv2.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.util.List;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item STAR = registerItem("star", new Item(new Item.Settings()));
    public static final Item RED_COLLAR = registerItem("red_collar", new Item(new Item.Settings()) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();


            if(!world.isClient()) {
                world.playSound(null, context.getBlockPos(), ModSounds.BELL_JINGLE, SoundCategory.BLOCKS);
            }
            return ActionResult.SUCCESS;
        }

        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.collars.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item ORANGE_COLLAR = registerItem("orange_collar", new Item(new Item.Settings()) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();


            if(!world.isClient()) {
                world.playSound(null, context.getBlockPos(), ModSounds.BELL_JINGLE, SoundCategory.BLOCKS);
            }
            return ActionResult.SUCCESS;
        }

        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.collars.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item YELLOW_COLLAR = registerItem("yellow_collar", new Item(new Item.Settings()) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();


            if(!world.isClient()) {
                world.playSound(null, context.getBlockPos(), ModSounds.BELL_JINGLE, SoundCategory.BLOCKS);
            }
            return ActionResult.SUCCESS;
        }

        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.collars.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item GREEN_COLLAR = registerItem("green_collar", new Item(new Item.Settings()) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();


            if(!world.isClient()) {
                world.playSound(null, context.getBlockPos(), ModSounds.BELL_JINGLE, SoundCategory.BLOCKS);
            }
            return ActionResult.SUCCESS;
        }

        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.collars.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item BLUE_COLLAR = registerItem("blue_collar", new Item(new Item.Settings()) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();


            if(!world.isClient()) {
                world.playSound(null, context.getBlockPos(), ModSounds.BELL_JINGLE, SoundCategory.BLOCKS);
            }
            return ActionResult.SUCCESS;
        }

        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.collars.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item TEAL_COLLAR = registerItem("teal_collar", new Item(new Item.Settings()) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();


            if(!world.isClient()) {
                world.playSound(null, context.getBlockPos(), ModSounds.BELL_JINGLE, SoundCategory.BLOCKS);
            }
            return ActionResult.SUCCESS;
        }

        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.collars.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PURPLE_COLLAR = registerItem("purple_collar", new Item(new Item.Settings()) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();


            if(!world.isClient()) {
                world.playSound(null, context.getBlockPos(), ModSounds.BELL_JINGLE, SoundCategory.BLOCKS);
            }
            return ActionResult.SUCCESS;
        }

        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.collars.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PINK_COLLAR = registerItem("pink_collar", new Item(new Item.Settings()) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();


            if(!world.isClient()) {
                world.playSound(null, context.getBlockPos(), ModSounds.BELL_JINGLE, SoundCategory.BLOCKS);
            }
            return ActionResult.SUCCESS;
        }

        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.collars.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item BLACK_COLLAR = registerItem("black_collar", new Item(new Item.Settings()) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();


            if(!world.isClient()) {
                world.playSound(null, context.getBlockPos(), ModSounds.BELL_JINGLE, SoundCategory.BLOCKS);
            }
            return ActionResult.SUCCESS;
        }

        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.collars.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item GREY_COLLAR = registerItem("grey_collar", new Item(new Item.Settings()) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();


            if(!world.isClient()) {
                world.playSound(null, context.getBlockPos(), ModSounds.BELL_JINGLE, SoundCategory.BLOCKS);
            }
            return ActionResult.SUCCESS;
        }

        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.collars.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item WHITE_COLLAR = registerItem("white_collar", new Item(new Item.Settings()) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();


            if(!world.isClient()) {
                world.playSound(null, context.getBlockPos(), ModSounds.BELL_JINGLE, SoundCategory.BLOCKS);
            }
            return ActionResult.SUCCESS;
        }

        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.collars.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item YARN = registerItem("yarn", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.dangle_toy.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item CATNIP = registerItem("catnip", new Item(new Item.Settings().food(ModFoodComponents.CATNIP)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.catnip.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item DANGLE_TOY = registerItem("dangle_toy", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.dangle_toy.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item TREAT = registerItem("treat", new Item(new Item.Settings().food(ModFoodComponents.TREAT)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.treat.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item MEOW_MUFFIN = registerItem("meow_muffin", new Item(new Item.Settings().food(ModFoodComponents.MEOW_MUFFIN)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.meow_muffin.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    public static final Item LASER_POINTER = registerItem("laser_pointer", new Item(new Item.Settings()));
    public static final Item MILK_BOWL = registerItem("milk_bowl", new Item(new Item.Settings()));
    public static final Item CAT_BED = registerItem("cat_bed", new Item(new Item.Settings()));
    public static final Item FOOD_BOWL = registerItem("food_bowl", new Item(new Item.Settings()));
    public static final Item CAT_BELL = registerItem("cat_bell", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.cat_bell.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item CATNIP_LEAF = registerItem("catnip_leaf", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.catnip_leaf.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });


    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.cauliflower.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));

    public static final Item CAT_FUR = registerItem("cat_fur", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kittymodv2.cat_fur.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

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
            entries.add(LASER_POINTER);
            entries.add(CAT_BED);
            entries.add(CAT_BELL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CATNIP);
            entries.add(TREAT);
            entries.add(MEOW_MUFFIN);
            entries.add(MILK_BOWL);
            entries.add(FOOD_BOWL);
            entries.add(CATNIP_LEAF);
        });
    }
}
