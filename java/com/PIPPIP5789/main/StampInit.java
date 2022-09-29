package com.PIPPIP5789.main;

import fluids.FluidInit;
import fluids.MoltenFluid;
import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.init.MineFantasyMaterials;
import minefantasy.mfr.item.ItemMetalComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import teamroots.embers.RegistryManager;
import teamroots.embers.recipe.ItemStampingRecipe;
import teamroots.embers.recipe.RecipeRegistry;

import static minefantasy.mfr.init.MineFantasyItems.BAR;
import static minefantasy.mfr.init.MineFantasyItems.PLATE;

public class StampInit {

    public static void preInitStamps(FMLPreInitializationEvent event) {
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_steel, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("steel")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_pig_iron, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("pig_iron")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_black_steel, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("black_steel")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_blue_steel, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("blue_steel")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_red_steel, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("red_steel")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_adamantium, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("adamantium")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_mithril, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("mithril")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_ignotumite, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("ignotumite")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_mithium, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("mithium")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_enderforge, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("ender")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_tungsten, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("tungsten")));
    }

    public static void initStamps(FMLInitializationEvent event) {
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_steel, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("steel")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_pig_iron, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("pig_iron")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_black_steel, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("black_steel")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_blue_steel, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("blue_steel")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_red_steel, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("red_steel")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_adamantium, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("adamantium")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_mithril, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("mithril")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_ignotumite, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("ignotumite")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_mithium, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("mithium")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_enderforge, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("ender")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_tungsten, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("tungsten")));

        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_dawnstone, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("dawnstone")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_aluminum, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("aluminum")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_electrum, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("electrum")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_lead, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("lead")));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_nickel, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar("nickel")));

        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_copper, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("copper", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_aluminum, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("aluminum", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_dawnstone, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_lead, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_electrum, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("electrum", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_bronze, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_nickel, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("nickel", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_gold, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("gold", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_iron, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("iron", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_silver, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("silver", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_tin, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("tin", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_steel, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("steel", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_pig_iron, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("pig_iron", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_black_steel, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("black_steel", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_blue_steel, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("blue_steel", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_red_steel, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("red_steel", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_adamantium, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("adamantium", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_mithril, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("mithril", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_ignotumite, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("ignotumite", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_mithium, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("mithium", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_enderforge, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("ender", 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_tungsten, RecipeRegistry.INGOT_AMOUNT * 2), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack("tungsten", 1)));

        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(RegistryManager.fluid_molten_bronze, RecipeRegistry.INGOT_AMOUNT * 3), Ingredient.fromItem(RegistryManager.stamp_gear), new ItemStack(MineFantasyItems.BRONZE_GEARS, 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(FluidInit.molten_tungsten, RecipeRegistry.INGOT_AMOUNT * 3), Ingredient.fromItem(RegistryManager.stamp_gear), new ItemStack(MineFantasyItems.TUNGSTEN_GEARS, 1)));
    }

}
