package com.PIPPIP5789.eomfr.main;

import minefantasy.mfr.client.knowledge.EntryPage;
import minefantasy.mfr.client.knowledge.EntryPageImage;
import minefantasy.mfr.client.knowledge.EntryPageSmelting;
import minefantasy.mfr.client.knowledge.EntryPageText;
import minefantasy.mfr.constants.Skill;
import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.init.MineFantasyKnowledgeList;
import minefantasy.mfr.mechanics.knowledge.InformationBase;
import minefantasy.mfr.mechanics.knowledge.InformationPage;
import minefantasy.mfr.mechanics.knowledge.ResearchArtefacts;
import minefantasy.mfr.mechanics.knowledge.ResearchLogic;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import teamroots.embers.RegistryManager;

import javax.swing.*;

import static minefantasy.mfr.init.MineFantasyKnowledgeList.*;
import static minefantasy.mfr.mechanics.knowledge.InformationList.engineering;

public class ResearchInit {

    public static InformationBase golems;
    public static InformationBase tinkerHammer;
    public static InformationBase gadgets;
    public static InformationBase pipes;
    public static InformationBase mechanicalCore;
    public static InformationBase emberTransfer;
    public static InformationBase melter;
    public static InformationBase stamper;
    public static InformationBase ember;
    public static InformationBase golemEye;
    public static InformationBase storage;
    public static InformationBase emberBore;
    public static InformationBase crystallizedEmber;
    public static InformationBase emberActivator;
    public static InformationBase pressureRefinery;
    public static InformationBase miniBoiler;
    public static InformationBase reactionChamber;




    public static void init() {
        /*
        ~ Golems
        ~ Ores
        ~ Tinker's Hammer
        ~ Basic Pipes
        * Pipes
        * Pumps
        Advanced Pipes
        * Item Requisition
        * Item Transfer
        * Item Vacuum
        * Item Dropper
        ~ Eye of the Ancients
        ~ Storage
        * Fluid Vessel
        * Reservoir
        * Bin
        ~ Gadgets
        * Atmospheric Gauge
        * Tinker's Lens
        -- Commodities -- Caminite
        ~ Ember Bore
        ~ Crystallized Ember
        ~ Ember Activator
        ~ Pressure Refinery
        ~ Mini Boiler
        ~ Reaction Chamber
        */
        golems = (new InformationBase("golems", 0, 4, 0, RegistryManager.ancient_motive_core, null)).registerStat().setUnlocked();
        tinkerHammer = (new InformationBase("tinker_hammer", 10, 0, 1, RegistryManager.tinker_hammer, composite_alloy)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        gadgets = (new InformationBase("gadgets", 12, 0, 1, RegistryManager.ember_gauge, tinkerHammer)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        pipes = (new InformationBase("piping", 13, 2, 1, RegistryManager.item_pipe, gadgets)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        mechanicalCore = (new InformationBase("mechanical_core", 12, -2, 1, RegistryManager.mech_core, composite_alloy)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        //emberMachines = (new InformationBase("ember_production", 13, -4, 1, RegistryManager.ember_bore, mechanicalCore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        emberTransfer = (new InformationBase("basic_ember_transfer", 16, -5, 1, RegistryManager.ember_emitter, emberActivator)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        melter = (new InformationBase("melter", 16, -3, 2, RegistryManager.mixer, emberTransfer)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        //ember = (new InformationBase("ember", 15, 11, 1, RegistryManager.crystal_ember, null)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 55);
        stamper = (new InformationBase("stamper", 16, -1, 2, RegistryManager.stamper, melter)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        golemEye = (new InformationBase("golem_eye", 0, 6, 0, RegistryManager.golems_eye, golems)).registerStat().setUnlocked();
        storage = (new InformationBase("storage", 11, -4, 1, RegistryManager.bin, composite_alloy)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 40);

        emberBore = (new InformationBase("ember_bore", 14, -2, 1, RegistryManager.ember_bore, mechanicalCore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        crystallizedEmber = (new InformationBase("ember", 13, -1, 0, RegistryManager.crystal_ember, emberBore)).registerStat().setPage(engineering).setUnlocked();
        emberActivator = (new InformationBase("ember_activator", 14, -4, 1, RegistryManager.ember_activator, emberBore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        pressureRefinery = (new InformationBase("pressure_refinery", 14, 0, 1, RegistryManager.boiler, emberBore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        miniBoiler = (new InformationBase("mini_boiler", 13, -5, 1, RegistryManager.mini_boiler, emberActivator)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        reactionChamber = (new InformationBase("reaction_chamber", 14, -6, 1, RegistryManager.reaction_chamber, miniBoiler)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);

        initPages();
        initArtefacts();
    }

    private static void initPages() {
        //MineFantasyKnowledgeList.ores.addPages(new EntryPageText("knowledge.ores.3"));
        //MineFantasyKnowledgeList.ores.addPages(new EntryPage[] {new EntryPageImage("LeadOre.png", 96, 96, "knowledge.ores.lead"), new EntryPageSmelting(new ItemStack(RegistryManager.ore_lead), new ItemStack(RegistryManager.ingot_lead))});
        //MineFantasyKnowledgeList.ores.addPages(new EntryPageImage("textures/gui/knowledge/image/" + "QuartzOre" + ".png", 96, 96, "knowledge.ores.quartz"));

        golems.addPages(new EntryPageText("knowledge.golems.1"));

        //golems.addPages(new EntryPageImage("textures/gui/knowledge/images/" + "AncientGolem" + ".png", 96, 96, "knowledge.golems.1"));

        tinkerHammer.addPages(new EntryPageText("knowledge.tinker_hammer.1"));

        gadgets.addPages(new EntryPageText("knowledge.gadgets.1"));
        gadgets.addPages(new EntryPageText("knowledge.gadgets.2"));

        pipes.addPages(new EntryPageText("knowledge.piping.1"));
        pipes.addPages(new EntryPageText("knowledge.piping.2"));
        pipes.addPages(new EntryPageText("knowledge.piping.3"));
        pipes.addPages(new EntryPageText("knowledge.piping.4"));

        golemEye.addPages(new EntryPageText("knowledge.golem_eye.1"));

        storage.addPages(new EntryPageText("knowledge.storage.1"));
        storage.addPages(new EntryPageText("knowledge.storage.2"));
        storage.addPages(new EntryPageText("knowledge.storage.3"));

        emberBore.addPages((new EntryPageText("knowledge.ember_bore.1")));

        crystallizedEmber.addPages((new EntryPageText("knowledge.ember.1")));

        emberActivator.addPages((new EntryPageText("knowledge.ember_activator.1")));

        pressureRefinery.addPages((new EntryPageText("knowledge.pressure_refinery.1")));

        miniBoiler.addPages((new EntryPageText("knowledge.mini_boiler.1")));

        reactionChamber.addPages((new EntryPageText("knowledge.reaction_chamber.1")));

        mechanicalCore.addPages(new EntryPageText(Information.mechanicalCore1));
        //emberMachines.addPages(new EntryPageText(Information.emberMachines1));
        emberTransfer.addPages(new EntryPageText(Information.emberTransfer1));
        melter.addPages(new EntryPageText(Information.melter));
        stamper.addPages(new EntryPageText(Information.stamper));
    }

    private static void initArtefacts() {
        ResearchArtefacts.addArtefact(MineFantasyItems.COMPOSITE_ALLOY_INGOT, tinkerHammer);
        ResearchArtefacts.addArtefact(MineFantasyItems.COPPER_INGOT, gadgets);
        ResearchArtefacts.addArtefact(RegistryManager.plate_caminite, pipes);
        ResearchArtefacts.addArtefact(MineFantasyItems.COMPOSITE_ALLOY_INGOT, mechanicalCore);
        ResearchArtefacts.addArtefact(RegistryManager.crystal_ember, emberTransfer);
        ResearchArtefacts.addArtefact(RegistryManager.mech_core, melter);
        ResearchArtefacts.addArtefact(RegistryManager.crystal_ember, melter);
        ResearchArtefacts.addArtefact(RegistryManager.mech_core, stamper);
        ResearchArtefacts.addArtefact(RegistryManager.plate_caminite, stamper);

        ResearchArtefacts.addArtefact(MineFantasyItems.COMPOSITE_ALLOY_INGOT, storage);
        ResearchArtefacts.addArtefact(RegistryManager.crystal_ember, emberActivator);
        ResearchArtefacts.addArtefact(RegistryManager.crystal_ember, pressureRefinery);
        ResearchArtefacts.addArtefact(Items.WATER_BUCKET, miniBoiler);
        ResearchArtefacts.addArtefact(RegistryManager.spark_plug, reactionChamber);
    }

}
