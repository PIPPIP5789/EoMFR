package com.PIPPIP5789.main;

import fluids.FluidInit;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = EoMFRMain.MODID, name = EoMFRMain.NAME, version = EoMFRMain.VERSION)
public class EoMFRMain
{
    public static final String MODID = "eomfr";
    public static final String NAME = "Embers of MineFantasy: Reforged";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        FluidInit.preInit(event);
        StampInit.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        CraftingInit.removeRecipes();
        StampInit.init(event);
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
