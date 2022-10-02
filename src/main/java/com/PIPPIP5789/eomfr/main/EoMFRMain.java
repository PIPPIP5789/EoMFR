package com.PIPPIP5789.eomfr.main;

import com.PIPPIP5789.eomfr.fluids.FluidInit;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;

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
import java.nio.file.StandardCopyOption;

@Mod(modid = EoMFRMain.MODID, name = EoMFRMain.NAME, version = EoMFRMain.VERSION)
public class EoMFRMain
{
    public static final String MODID = "eomfr";
    public static final String NAME = "Embers of MineFantasy: Reforged";
    public static final String VERSION = "0.1.2";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        initFiles(event);
        logger = event.getModLog();
        FluidInit.preInitFluids(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        AlchemyInit.preInit(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //ResearchInit.init();
        StampInit.initStamps(event);
        CraftingInit.removeRecipes();
        SmeltingInit.smeltingInit();
    }

    private static void initFiles(FMLPreInitializationEvent event) {
        try {
            String path =  "MineFantasyReforged/custom/recipes/anvil_recipes/";
            File file = new File(event.getModConfigurationDirectory(), path +  "AlchemyPedestal" + ".json");
            file.deleteOnExit();
            PrintWriter writer = new PrintWriter(file);
            writer.println(IOInit.ALCHEMYPEDESTAL);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "AlchemyTablet" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.ALCHEMYTABLET);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "AshenCloak" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.ASHENCLOAK);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "BeamCannon" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.BEAMCANNON);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "BeamSplitter" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.BEAMSPLITTER);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "Bin" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.BIN);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "CasterOrb" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.CASTERORB);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "Catalyzer" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.CATALYZER);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "Charger" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.CHARGER);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "CinderPlinth" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.CINDERPLINTH);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "ClockworkAttenuator" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.CLOCKWORKATTENUATOR);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "ClockworkAxe" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.CLOCKWORKAXE);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "Combustor" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.COMBUSTOR);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "CrystalCell" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.CRYSTALCELL);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "DawnstoneMail" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.DAWNSTONEMAIL);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "DiffractionBarrel" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.DIFFRACTIONBARREL);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "EmberActivator" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERACTIVATOR);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "EmberBelt" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERBELT);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "EmberBulb" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERBULB);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "EmberCartridge" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERCARTRIDGE);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "EmberFunnel" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERFUNNEL);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "EmberGauge" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERGAUGE);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "EmberInjector" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERINJECTOR);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "EmberPulser" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERPULSER);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "EmberRelay" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERRELAY);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "EmberSiphon" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERSIPHON);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "EmberStaff" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERSTAFF);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "FluidGauge" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.FLUIDGAUGE);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "FluidPipe" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.FLUIDPIPE);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "FluidTransfer" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.FLUIDTRANSFER);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "GlimmerLamp" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.GLIMMERLAMP);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "HearthCoil" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.HEARTHCOIL);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "IgnitionCannon" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.IGNITIONCANNON);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "InfernoForge" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.INFERNOFORGE);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "ItemTransfer" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.ITEMTRANSFER);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "JetAugment" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.JETAUGMENT);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "Lantern" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.LANTERN);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "MechAccessor" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.MECHACCESSOR);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "MechanicalCore" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.MECHANICALCORE);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "MechanicalPump" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.MECHANICALPUMP);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "MiniBoiler" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.MINIBOILER);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "Mixer" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.MIXER);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "Reactor" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.REACTOR);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "ResonatingBell" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.RESONATINGBELL);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "SparkPlug" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.SPARKPLUG);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "Stirling" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.STIRLING);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "Superheater" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.SUPERHEATER);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "Tank" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.TANK);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "TinkerHammer" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.TINKERHAMMER);
            writer.flush();

            file = new File(event.getModConfigurationDirectory(), path +  "TinkerLens" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.TINKERLENS);
            writer.flush();

            writer.close();
        }
        catch(IOException e) {
        }

    }

}
