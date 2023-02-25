package com.PIPPIP5789.eomfr.main;

import com.PIPPIP5789.eomfr.fluids.FluidInit;
import minefantasy.mfr.block.BasicBlockMF;
import minefantasy.mfr.init.MineFantasyMaterials;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryManager;
import org.apache.commons.io.FileUtils;
//import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.rmi.registry.Registry;

import static minefantasy.mfr.init.MineFantasyBlocks.LIMESTONE_COBBLE;

@Mod(modid = EoMFRMain.MODID, name = EoMFRMain.NAME, version = EoMFRMain.VERSION)
public class EoMFRMain
{
    public static final String MODID = "eomfr";
    public static final String NAME = "Embers of MineFantasy: Reforged";
    public static final String VERSION = "0.1.3";

    public static Block tester;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        IOInit.initTypes(event);
        IOInit.initRecipes(event);
        //logger = event.getModLog();
        FluidInit.preInitFluids(event);

        //tester = new BasicBlockMF("tester", Material.ROCK, LIMESTONE_COBBLE).setBlockSoundType(SoundType.STONE).setHardness(1.2F).setResistance(8F).setCreativeTab(CreativeTabs.FOOD);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.register(tester);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        AlchemyInit.preInit(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ResearchInit.init();
        StampInit.initStamps(event);
        CraftingInit.removeRecipes();
        SmeltingInit.smeltingInit();
    }

}
