package com.PIPPIP5789.main;

import fluids.FluidInit;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
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
    public static final String VERSION = "0.1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        initFiles(event);
        logger = event.getModLog();
        FluidInit.preInitFluids(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        StampInit.initStamps(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        CraftingInit.removeRecipes();
    }

    private static void initFiles(FMLPreInitializationEvent event) {
        try {
            String path =  "MineFantasyReforged/custom/recipes/anvil_recipes/";
            PrintWriter writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "AlchemyPedestal" + ".json"));
            writer.println(IOInit.ALCHEMYPEDESTAL);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "AlchemyTablet" + ".json"));
            writer.println(IOInit.ALCHEMYTABLET);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "AshenCloak" + ".json"));
            writer.println(IOInit.ASHENCLOAK);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "BeamCannon" + ".json"));
            writer.println(IOInit.BEAMCANNON);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "BeamSplitter" + ".json"));
            writer.println(IOInit.BEAMSPLITTER);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "Bin" + ".json"));
            writer.println(IOInit.BIN);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "CasterOrb" + ".json"));
            writer.println(IOInit.CASTERORB);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "Catalyzer" + ".json"));
            writer.println(IOInit.CATALYZER);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "Charger" + ".json"));
            writer.println(IOInit.CHARGER);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "CinderPlinth" + ".json"));
            writer.println(IOInit.CINDERPLINTH);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "ClockworkAttenuator" + ".json"));
            writer.println(IOInit.CLOCKWORKATTENUATOR);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "ClockworkAxe" + ".json"));
            writer.println(IOInit.CLOCKWORKAXE);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "Combustor" + ".json"));
            writer.println(IOInit.COMBUSTOR);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "CrystalCell" + ".json"));
            writer.println(IOInit.CRYSTALCELL);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "DawnstoneMail" + ".json"));
            writer.println(IOInit.DAWNSTONEMAIL);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "DiffractionBarrel" + ".json"));
            writer.println(IOInit.DIFFRACTIONBARREL);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "EmberActivator" + ".json"));
            writer.println(IOInit.EMBERACTIVATOR);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "EmberBelt" + ".json"));
            writer.println(IOInit.EMBERBELT);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "EmberBulb" + ".json"));
            writer.println(IOInit.EMBERBULB);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "EmberCartridge" + ".json"));
            writer.println(IOInit.EMBERCARTRIDGE);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "EmberFunnel" + ".json"));
            writer.println(IOInit.EMBERFUNNEL);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "EmberGauge" + ".json"));
            writer.println(IOInit.EMBERGAUGE);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "EmberInjector" + ".json"));
            writer.println(IOInit.EMBERINJECTOR);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "EmberPulser" + ".json"));
            writer.println(IOInit.EMBERPULSER);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "EmberRelay" + ".json"));
            writer.println(IOInit.EMBERRELAY);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "EmberSiphon" + ".json"));
            writer.println(IOInit.EMBERSIPHON);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "EmberStaff" + ".json"));
            writer.println(IOInit.EMBERSTAFF);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "FluidGauge" + ".json"));
            writer.println(IOInit.FLUIDGAUGE);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "FluidPipe" + ".json"));
            writer.println(IOInit.FLUIDPIPE);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "FluidTransfer" + ".json"));
            writer.println(IOInit.FLUIDTRANSFER);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "GlimmerLamp" + ".json"));
            writer.println(IOInit.GLIMMERLAMP);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "HearthCoil" + ".json"));
            writer.println(IOInit.HEARTHCOIL);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "IgnitionCannon" + ".json"));
            writer.println(IOInit.IGNITIONCANNON);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "InfernoForge" + ".json"));
            writer.println(IOInit.INFERNOFORGE);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "ItemTransfer" + ".json"));
            writer.println(IOInit.ITEMTRANSFER);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "JetAugment" + ".json"));
            writer.println(IOInit.JETAUGMENT);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "Lantern" + ".json"));
            writer.println(IOInit.LANTERN);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "MechAccessor" + ".json"));
            writer.println(IOInit.MECHACCESSOR);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "MechanicalCore" + ".json"));
            writer.println(IOInit.MECHANICALCORE);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "MechanicalPump" + ".json"));
            writer.println(IOInit.MECHANICALPUMP);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "MiniBoiler" + ".json"));
            writer.println(IOInit.MINIBOILER);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "Mixer" + ".json"));
            writer.println(IOInit.MIXER);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "Reactor" + ".json"));
            writer.println(IOInit.REACTOR);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "ResonatingBell" + ".json"));
            writer.println(IOInit.RESONATINGBELL);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "SparkPlug" + ".json"));
            writer.println(IOInit.SPARKPLUG);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "Stirling" + ".json"));
            writer.println(IOInit.STIRLING);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "Superheater" + ".json"));
            writer.println(IOInit.SUPERHEATER);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "Tank" + ".json"));
            writer.println(IOInit.TANK);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "TinkerHammer" + ".json"));
            writer.println(IOInit.TINKERHAMMER);
            writer.flush();

            writer = new PrintWriter(new File(event.getModConfigurationDirectory(), path +  "TinkerLens" + ".json"));
            writer.println(IOInit.TINKERLENS);
            writer.flush();

            writer.close();
        }
        catch(IOException e) {
        }

    }

}
