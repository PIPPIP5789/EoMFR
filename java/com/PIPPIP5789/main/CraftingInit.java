package com.PIPPIP5789.main;

import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;
import teamroots.embers.RegistryManager;
import teamroots.embers.recipe.RecipeRegistry;

import java.util.ArrayList;

public class CraftingInit {

    public static void removeRecipes() {
        ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>) ForgeRegistries.RECIPES;

        recipeRegistry.remove(RegistryManager.tinker_hammer.getRegistryName());
        //recipeRegistry.remove(RegistryManager.tinker_hammer.getRegistryName());
        recipeRegistry.remove(RegistryManager.mech_core.getRegistryName());

        recipeRegistry.remove(RegistryManager.plate_copper.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_aluminum.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_bronze.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_dawnstone.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_electrum.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_gold.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_iron.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_lead.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_nickel.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_silver.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());

        /*
        recipeRegistry.remove(RegistryManager.alchemy_tablet.getRegistryName());
        recipeRegistry.remove(RegistryManager.beam_cannon.getRegistryName());
        recipeRegistry.remove(RegistryManager.charger.getRegistryName());
        recipeRegistry.remove(RegistryManager.cinder_plinth.getRegistryName());
        recipeRegistry.remove(RegistryManager.axe_clockwork.getRegistryName());
        recipeRegistry.remove(RegistryManager.combustor.getRegistryName());
        recipeRegistry.remove(RegistryManager.ember_cartridge.getRegistryName());
        recipeRegistry.remove(RegistryManager.ember_gauge.getRegistryName());
        recipeRegistry.remove(RegistryManager.heat_coil.getRegistryName());
        recipeRegistry.remove(RegistryManager.item_pipe.getRegistryName());
        recipeRegistry.remove(RegistryManager.item_transfer.getRegistryName());
        recipeRegistry.remove(RegistryManager.tinker_lens.getRegistryName());

        recipeRegistry.remove(RegistryManager.alchemy_pedestal.getRegistryName());
        recipeRegistry.remove(RegistryManager.ashen_cloak_chest.getRegistryName());
        recipeRegistry.remove(RegistryManager.beam_splitter.getRegistryName());
        recipeRegistry.remove(RegistryManager.bin.getRegistryName());
        recipeRegistry.remove(RegistryManager.caster_orb.getRegistryName());
        recipeRegistry.remove(RegistryManager.catalyzer.getRegistryName());
        recipeRegistry.remove(RegistryManager.clockwork_attenuator.getRegistryName());
        recipeRegistry.remove(RegistryManager.crystal_cell.getRegistryName());
        recipeRegistry.remove(RegistryManager..getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());
        recipeRegistry.remove(RegistryManager.plate_tin.getRegistryName());

        This was a complete waste of time -_-.
        */
    }

}
