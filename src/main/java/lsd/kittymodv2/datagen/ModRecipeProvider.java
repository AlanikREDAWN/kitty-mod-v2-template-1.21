package lsd.kittymodv2.datagen;

import lsd.kittymodv2.KittyModV2;
import lsd.kittymodv2.block.ModBlocks;
import lsd.kittymodv2.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SCRATCHING_POST)
                .pattern("B#B")
                .pattern("I#I")
                .pattern("B#B")
                .input('#', Items.OAK_PLANKS)
                .input('I', Items.STRING)
                .input('B', Items.STICK)
                .criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LITTER_BOX)
                .pattern("WWW")
                .pattern("WSW")
                .pattern("WWW")
                .input('W', Items.OAK_PLANKS)
                .input('S', Items.SAND)
                .criterion(hasItem(Items.SAND), conditionsFromItem(Items.SAND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CARDBOARD_BOX)
                .pattern("PPP")
                .pattern("WSW")
                .pattern("WSW")
                .input('P', Items.PAPER)
                .input('W', Items.OAK_WOOD)
                .input('S', Items.STRING)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FUR_BRUSH)
                .pattern("  W")
                .pattern(" S ")
                .pattern("S  ")
                .input('W', Items.WHITE_WOOL)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CAT_BED)
                .pattern("   ")
                .pattern("W W")
                .pattern("WWW")
                .input('W', Items.RED_WOOL)
                .criterion(hasItem(Items.RED_WOOL), conditionsFromItem(Items.RED_WOOL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FOOD_BOWL)
                .pattern("   ")
                .pattern("RTR")
                .pattern("RRR")
                .input('R', Items.RED_TERRACOTTA)
                .input('T', ModItems.TREAT)
                .criterion(hasItem(ModItems.TREAT), conditionsFromItem(ModItems.TREAT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MILK_BOWL)
                .pattern("   ")
                .pattern("RMR")
                .pattern("RRR")
                .input('R', Items.RED_TERRACOTTA)
                .input('M', Items.MILK_BUCKET)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TREAT)
                .pattern("   ")
                .pattern("#WS")
                .pattern("   ")
                .input('#', Items.TROPICAL_FISH)
                .input('W', Items.WHEAT)
                .input('S', Items.SUGAR)
                .criterion(hasItem(Items.TROPICAL_FISH), conditionsFromItem(Items.TROPICAL_FISH))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DANGLE_TOY)
                .pattern("  S")
                .pattern(" S#")
                .pattern("S F")
                .input('#', Items.STRING)
                .input('F', Items.FEATHER)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter);

//        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.YARN, Items.STRING);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.YARN, RecipeCategory.MISC, ModBlocks.YARN_BLOCK);





    }
}
