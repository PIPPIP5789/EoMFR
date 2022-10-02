package com.PIPPIP5789.eomfr.main;

import com.google.common.collect.Lists;
import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.item.ItemMetalComponent;
import minefantasy.mfr.util.CustomToolHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreIngredient;
import teamroots.embers.RegistryManager;
import teamroots.embers.api.alchemy.AspectList;
import teamroots.embers.block.BlockSeedNew;
import teamroots.embers.recipe.AlchemyRecipe;
import teamroots.embers.recipe.RecipeRegistry;
import teamroots.embers.util.IngredientSpecial;

import static minefantasy.mfr.init.MineFantasyItems.PLATE;
import static teamroots.embers.recipe.RecipeRegistry.alchemyRecipes;

public class AlchemyInit {

    public static void preInit(FMLInitializationEvent event) {
        // RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectRangeList().setRange("iron", 8, 32).setRange("copper", 8, 32), Ingredient.fromItem(RegistryManager.ember_cluster), Lists.newArrayList(archaicBrick, leather, archaicBrick, archaicBrick), new ItemStack(explosion_charm, 1)));

        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 32, 48).setRange("silver", 24, 32), Ingredient.fromItem(RegistryManager.ancient_motive_core), Lists.newArrayList(Ingredient.fromItem(RegistryManager.ingot_dawnstone), Ingredient.fromItem(RegistryManager.ember_cluster), Ingredient.fromItem(RegistryManager.ingot_dawnstone), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("copper", 1).getItem())), new ItemStack(RegistryManager.wildfire_core,1)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper", 16, 24), Ingredient.fromItem(Items.GUNPOWDER), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("copper", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("iron", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("iron", 1).getItem()), Ingredient.fromItem(RegistryManager.ingot_copper)), new ItemStack(RegistryManager.blasting_core,1)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("dawnstone", 16, 32).setRange("silver", 16, 32), Ingredient.fromItem(RegistryManager.crystal_ember), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(RegistryManager.ingot_silver)), new ItemStack(RegistryManager.flame_barrier,1)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper",  8, 16).setRange("silver", 32, 64), Ingredient.fromItem(RegistryManager.crystal_ember), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("silver", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("silver", 1).getItem())), new ItemStack(RegistryManager.focal_lens,1)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("lead",  32, 128), Ingredient.fromItem(RegistryManager.ashen_cloth), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem())), new ItemStack(RegistryManager.shifting_scales,1)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper",  32, 128), Ingredient.fromItem(RegistryManager.ingot_bronze), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem())), new ItemStack(RegistryManager.winding_gears,1)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 8, 16).setRange("silver", 8, 16).setRange("dawnstone", 8, 16).setRange("lead", 8, 16).setRange("copper",  8, 16).fixMathematicalError(), Ingredient.fromItem(RegistryManager.wildfire_core), Lists.newArrayList(Ingredient.fromItem(RegistryManager.ingot_silver), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(RegistryManager.ingot_silver), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem())), new ItemStack(RegistryManager.ember_pipe,8)));

        /*
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 48, 64).setRange("silver", 48, 64), quartz, Lists.newArrayList(ingotSilver, ingotSilver, emberShard, emberShard), new ItemStack(RegistryManager.seed_silver)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 48, 64).setRange("lead", 48, 64), quartz, Lists.newArrayList(ingotLead, ingotLead, emberShard, emberShard), new ItemStack(RegistryManager.seed_lead)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 48, 64).setRange("dawnstone", 48, 64), quartz, Lists.newArrayList(ingotGold, ingotGold, emberShard, emberShard), new ItemStack(RegistryManager.seed_gold)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 72, 96).setRange("silver", 24, 32), quartz, Lists.newArrayList(ingotTin, ingotTin, emberShard, emberShard), new ItemStack(RegistryManager.seed_tin)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 48, 64).setRange("copper", 24, 32).setRange("silver", 24, 32), quartz, Lists.newArrayList(ingotAluminum, ingotAluminum, emberShard, emberShard), new ItemStack(RegistryManager.seed_aluminum)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 72, 96).setRange("lead", 24, 32), quartz, Lists.newArrayList(ingotNickel, ingotNickel, emberShard, emberShard), new ItemStack(RegistryManager.seed_nickel)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 96, 128), quartz, Lists.newArrayList(ingotIron, ingotIron, emberShard, emberShard), new ItemStack(RegistryManager.seed_iron)));

        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 12, 24).setRange("lead", 12, 24), wool, Lists.newArrayList(ash, ash, string, string), new ItemStack(RegistryManager.ashen_cloth,2)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("dawnstone", 32, 48).setRange("lead", 24, 40), diamond, Lists.newArrayList(ingotDawnstone, coal, coal, coal), new ItemStack(RegistryManager.inflictor_gem,1)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("dawnstone", 64, 80), quartz,  Lists.newArrayList(gunpowder, gunpowder, emberShard, emberShard), new ItemStack(RegistryManager.glimmer_shard,1)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 24, 36), ingotIron, Lists.newArrayList(quartz, clay, lapis), new ItemStack(RegistryManager.isolated_materia,4)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 12, 18), clay, Lists.newArrayList(bonemeal, bonemeal), new ItemStack(RegistryManager.adhesive,6)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper",  8, 16), redstone, Lists.newArrayList(ash, ash, cobblestone, cobblestone), new ItemStack(Blocks.NETHERRACK,2)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper",  8, 16), ash, Lists.newArrayList(sand, sand, sand, sand), new ItemStack(Blocks.SOUL_SAND,4)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("silver", 64, 96).setRange("lead", 64, 96), leadSword, Lists.newArrayList(blockCoal, obsidian, ingotLead, ingotLead), new ItemStack(RegistryManager.tyrfing,1)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("dawnstone", 24, 48).setRange("copper", 24, 48), emberCrystal, Lists.newArrayList(gunpowder, emberShard, emberShard, emberShard), new ItemStack(RegistryManager.ember_cluster,1)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 32, 48).setRange("silver", 24, 32), Ingredient.fromItem(RegistryManager.ancient_motive_core), Lists.newArrayList(ingotDawnstone, emberCluster, ingotDawnstone, plateCopper), new ItemStack(RegistryManager.wildfire_core,1)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("dawnstone", 4, 8), archaicBrick,Lists.newArrayList(soulsand, soulsand, clay, clay), new ItemStack(RegistryManager.archaic_brick,5)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("dawnstone", 24, 32), emberShard, Lists.newArrayList(archaicBrick, archaicBrick, archaicBrick, archaicBrick), new ItemStack(RegistryManager.ancient_motive_core,1)));

        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper", 16, 24),
                gunpowder,
                Lists.newArrayList(plateIron, plateIron, plateIron, ingotCopper),
                new ItemStack(RegistryManager.blasting_core,1)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper",  24, 48).setRange("lead",  40, 64),
                plateCopper,
                Lists.newArrayList(archaicCircuit, ingotCopper, archaicCircuit, ingotCopper),
                new ItemStack(RegistryManager.intelligent_apparatus,1)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("dawnstone", 16, 32).setRange("silver", 16, 32),
                emberCrystal,
                Lists.newArrayList(plateDawnstone, plateDawnstone, plateDawnstone, ingotSilver),
                new ItemStack(RegistryManager.flame_barrier,1)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper",  8, 16).setRange("silver", 32, 64),
                emberCrystal,
                Lists.newArrayList(plateDawnstone, plateSilver, plateDawnstone, plateSilver),
                new ItemStack(RegistryManager.focal_lens,1)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("lead",  32, 128),
                Ingredient.fromItem(RegistryManager.ashen_cloth),
                Lists.newArrayList(plateLead, plateLead, plateLead, plateLead),
                new ItemStack(RegistryManager.shifting_scales,1)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper",  32, 128),
                ingotBronze,
                Lists.newArrayList(plateBronze, plateBronze, plateBronze, plateBronze),
                new ItemStack(RegistryManager.winding_gears,1)));
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 8, 16).setRange("silver", 8, 16).setRange("dawnstone", 8, 16).setRange("lead", 8, 16).setRange("copper",  8, 16).fixMathematicalError(),
                Ingredient.fromItem(RegistryManager.wildfire_core),
                Lists.newArrayList(ingotSilver, plateDawnstone, ingotSilver, plateDawnstone),
                new ItemStack(RegistryManager.ember_pipe,8)));
    */}

}
