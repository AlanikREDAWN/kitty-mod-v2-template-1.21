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
        public void appendTooltip(ItemStack stack, TooltipContext context, List<T