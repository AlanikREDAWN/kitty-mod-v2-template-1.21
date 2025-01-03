package lsd.kittymodv2.datagen;

import lsd.kittymodv2.KittyModV2;
import lsd.kittymodv2.block.ModBlocks;
import lsd.kittymodv2.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        List<ItemConvertible> PINK_GARNET_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE,
                ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

        offerSmelting(exporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 200, "pink_garnet");
        offerBlasting(exporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 100, "pink_garnet");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_GARNET, RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_PINK_GARNET_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_PINK_GARNET)
                .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                .input(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 32)
                .input(ModBlocks.MAGIC_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
                .offerTo(exporter, Identifier.of(KittyModV2.MOD_ID, "raw_pink_garnet_from_magic_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MEOW_MUFFIN)
                .pattern(" # ")
                .pattern("WEM")
                .pattern(" S ")
                .input('#', Items.TROPICAL_FISH)
                .input('W', Items.WHEAT)
                .input('E', Items.EGG)
                .input('M', Items.MILK_BUCKET)
                .input('S', Items.SUGAR)
                .criterion(hasItem(Items.TROPICAL_FISH), conditionsFromItem(Items.TROPICAL_FISH))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORANGE_COLLAR)
                .pattern("#I#")
                .pattern(" O ")
                .pattern("#K#")
                .input('#', Items.LEATHER)
                .input('I', Items.IRON_NUGGET)
                .input('O', Items.ORANGE_DYE)
                .input('K', ModItems.CAT_BELL)
                .criterion(hasItem(ModItems.CAT_BELL), conditionsFromItem(ModItems.CAT_BELL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURPLE_COLLAR)
                .pattern("#I#")
                .pattern(" P ")
                .pattern("#K#")
                .input('#', Items.LEATHER)
                .input('I', Items.IRON_NUGGET)
                .input('P', Items.PURPLE_DYE)
                .input('K', ModItems.CAT_BELL)
                .criterion(hasItem(ModItems.CAT_BELL), conditionsFromItem(ModItems.CAT_BELL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YELLOW_COLLAR)
                .pattern("#I#")
                .pattern(" Y ")
                .pattern("#K#")
                .input('#', Items.LEATHER)
                .input('I', Items.IRON_NUGGET)
                .input('Y', Items.YELLOW_DYE)
                .input('K', ModItems.CAT_BELL)
                .criterion(hasItem(ModItems.CAT_BELL), conditionsFromItem(ModItems.CAT_BELL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLACK_COLLAR)
                .pattern("#I#")
                .pattern(" B ")
                .pattern("#K#")
                .input('#', Items.LEATHER)
                .input('I', Items.IRON_NUGGET)
                .input('B', Items.BLACK_DYE)
                .input('K', ModItems.CAT_BELL)
                .criterion(hasItem(ModItems.CAT_BELL), conditionsFromItem(ModItems.CAT_BELL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WHITE_COLLAR)
                .pattern("#I#")
                .pattern(" W ")
                .pattern("#K#")
                .input('#', Items.LEATHER)
                .input('I', Items.IRON_NUGGET)
                .input('W', Items.WHITE_DYE)
                .input('K', ModItems.CAT_BELL)
                .criterion(hasItem(ModItems.CAT_BELL), conditionsFromItem(ModItems.CAT_BELL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GREEN_COLLAR)
                .pattern("#I#")
                .pattern(" G ")
                .pattern("#K#")
                .input('#', Items.LEATHER)
                .input('I', Items.IRON_NUGGET)
                .input('G', Items.GREEN_DYE)
                .input('K', ModItems.CAT_BELL)
                .criterion(hasItem(ModItems.CAT_BELL), conditionsFromItem(ModItems.CAT_BELL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLUE_COLLAR)
                .pattern("#I#")
                .pattern(" B ")
                .pattern("#K#")
                .input('#', Items.LEATHER)
                .input('I', Items.IRON_NUGGET)
                .input('B', Items.BLUE_DYE)
                .input('K', ModItems.CAT_BELL)
                .criterion(hasItem(ModItems.CAT_BELL), conditionsFromItem(ModItems.CAT_BELL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GREY_COLLAR)
                .pattern("#I#")
                .pattern(" G ")
                .pattern("#K#")
                .input('#', Items.LEATHER)
                .input('I', Items.IRON_NUGGET)
                .input('G', Items.GRAY_DYE)
                .input('K', ModItems.CAT_BELL)
                .criterion(hasItem(ModItems.CAT_BELL), conditionsFromItem(ModItems.CAT_BELL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_COLLAR)
                .pattern("#I#")
                .pattern(" P ")
                .pattern("#K#")
                .input('#', Items.LEATHER)
                .input('I', Items.IRON_NUGGET)
                .input('P', Items.PINK_DYE)
                .input('K', ModItems.CAT_BELL)
                .criterion(hasItem(ModItems.CAT_BELL), conditionsFromItem(ModItems.CAT_BELL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TEAL_COLLAR)
                .pattern("#I#")
                .pattern(" C ")
                .pattern("#K#")
                .input('#', Items.LEATHER)
                .input('I', Items.IRON_NUGGET)
                .input('C', Items.CYAN_DYE)
                .input('K', ModItems.CAT_BELL)
                .criterion(hasItem(ModItems.CAT_BELL), conditionsFromItem(ModItems.CAT_BELL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_COLLAR)
                .pattern("#I#")
                .pattern(" R ")
                .pattern("#K#")
                .input('#', Items.LEATHER)
                .input('I', Items.IRON_NUGGET)
                .input('R', Items.RED_DYE)
                .input('K', ModItems.CAT_BELL)
                .criterion(hasItem(ModItems.CAT_BELL), conditionsFromItem(ModItems.CAT_BELL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAT_BELL)
                .pattern(" # ")
                .pattern("IBI")
                .pattern("BIB")
                .input('#', Items.STRING)
                .input('I', Items.IRON_NUGGET)
                .input('B', Items.GOLD_NUGGET)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter);

        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.CATNIP, ModItems.CATNIP_LEAF);

        S