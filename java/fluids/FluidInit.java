package fluids;

import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.init.MineFantasyMaterials;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import teamroots.embers.RegistryManager;
import teamroots.embers.recipe.ItemMeltingRecipe;
import teamroots.embers.recipe.RecipeRegistry;

import java.awt.*;
import java.util.Map;

public class FluidInit {

    public static MoltenFluid molten_steel;
    public static MoltenFluid molten_pig_iron;
    public static MoltenFluid molten_black_steel;
    public static MoltenFluid molten_blue_steel;
    public static MoltenFluid molten_red_steel;
    public static MoltenFluid molten_adamantium;
    public static MoltenFluid molten_mithril;
    public static MoltenFluid molten_ignotumite;
    public static MoltenFluid molten_mithium;
    public static MoltenFluid molten_enderforge;
    public static MoltenFluid molten_tungsten;

    public static void preInit(FMLPreInitializationEvent event) {
        initFluids();
        registerFluids();
        addFluidRecipes();
    }

    private static void initFluids() {
        molten_steel = new MoltenFluid("molten_steel", new Color(206, 199, 206));
        molten_pig_iron = new MoltenFluid("molten_pig_iron", new Color(94, 92, 90));
        molten_black_steel = new MoltenFluid("molten_black_steel", new Color(26, 25, 25));
        molten_blue_steel = new MoltenFluid("molten_blue_steel", new Color(13, 13, 217));
        molten_red_steel = new MoltenFluid("molten_red_steel", new Color(218, 13, 13));
        molten_adamantium = new MoltenFluid("molten_adamanium", new Color(31, 119, 8));
        molten_mithril = new MoltenFluid("molten_mithril", new Color(255, 1, 234));
        molten_ignotumite = new MoltenFluid("molten_ignotumite", new Color(13, 238, 13));
        molten_mithium = new MoltenFluid("molten_mithium", new Color(0, 229, 253));
        molten_enderforge = new MoltenFluid("molten_enderforge", new Color(148, 16, 203));
        molten_tungsten = new MoltenFluid("molten_tungsten", new Color(7, 75, 14));
    }

    private static void registerFluids() {
        FluidRegistry.registerFluid(molten_steel);
        FluidRegistry.addBucketForFluid(molten_steel);
        FluidRegistry.registerFluid(molten_pig_iron);
        FluidRegistry.addBucketForFluid(molten_pig_iron);
        FluidRegistry.registerFluid(molten_black_steel);
        FluidRegistry.addBucketForFluid(molten_black_steel);
        FluidRegistry.registerFluid(molten_blue_steel);
        FluidRegistry.addBucketForFluid(molten_blue_steel);
        FluidRegistry.registerFluid(molten_red_steel);
        FluidRegistry.addBucketForFluid(molten_red_steel);
        FluidRegistry.registerFluid(molten_adamantium);
        FluidRegistry.addBucketForFluid(molten_adamantium);
        FluidRegistry.registerFluid(molten_mithril);
        FluidRegistry.addBucketForFluid(molten_mithril);
        FluidRegistry.registerFluid(molten_ignotumite);
        FluidRegistry.addBucketForFluid(molten_ignotumite);
        FluidRegistry.registerFluid(molten_mithium);
        FluidRegistry.addBucketForFluid(molten_mithium);
        FluidRegistry.registerFluid(molten_enderforge);
        FluidRegistry.addBucketForFluid(molten_enderforge);
        FluidRegistry.registerFluid(molten_tungsten);
        FluidRegistry.addBucketForFluid(molten_tungsten);
    }

    private static void addFluidRecipes() {
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(MineFantasyItems.STEEL_INGOT), new FluidStack(molten_steel, RecipeRegistry.INGOT_AMOUNT)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(MineFantasyItems.PIG_IRON_INGOT), new FluidStack(molten_pig_iron, RecipeRegistry.INGOT_AMOUNT)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(MineFantasyItems.BLACK_STEEL_INGOT), new FluidStack(molten_black_steel, RecipeRegistry.INGOT_AMOUNT)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(MineFantasyItems.BLUE_STEEL_INGOT), new FluidStack(molten_blue_steel, RecipeRegistry.INGOT_AMOUNT)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(MineFantasyItems.RED_STEEL_INGOT), new FluidStack(molten_red_steel, RecipeRegistry.INGOT_AMOUNT)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(MineFantasyItems.ADAMANTIUM_INGOT), new FluidStack(molten_adamantium, RecipeRegistry.INGOT_AMOUNT)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(MineFantasyItems.MITHRIL_INGOT), new FluidStack(molten_mithril, RecipeRegistry.INGOT_AMOUNT)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(MineFantasyItems.IGNOTUMITE_INGOT), new FluidStack(molten_ignotumite, RecipeRegistry.INGOT_AMOUNT)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(MineFantasyItems.MITHIUM_INGOT), new FluidStack(molten_mithium, RecipeRegistry.INGOT_AMOUNT)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(MineFantasyItems.ENDER_INGOT), new FluidStack(molten_enderforge, RecipeRegistry.INGOT_AMOUNT)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(MineFantasyItems.TUNGSTEN_INGOT), new FluidStack(molten_tungsten, RecipeRegistry.INGOT_AMOUNT)));
    }

}
