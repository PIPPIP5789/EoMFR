package com.PIPPIP5789.main;

import minefantasy.mfr.init.MineFantasyItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.ShapedOreRecipe;
import teamroots.embers.RegistryManager;
import teamroots.embers.recipe.RecipeRegistry;

import static teamroots.embers.recipe.RecipeRegistry.getRL;

public class RecipeInit {

    //@SubscribeEvent
    public void initRecipe(RegistryEvent.Register<IRecipe> event) {
        event.getRegistry().register(new ShapedOreRecipe(null, new ItemStack(MineFantasyItems.ARROWHEAD, 1), true, new Object[] {
                "ILI",
                "ISI",
                " S ",
                'L', "leadIngot",
                "I", "ironIngot",
                'S', "stickWood"}));
    }

}
