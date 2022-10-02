package com.PIPPIP5789.eomfr.main;

import minefantasy.mfr.client.knowledge.EntryPageText;
import minefantasy.mfr.constants.Skill;
import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.mechanics.knowledge.InformationBase;
import minefantasy.mfr.mechanics.knowledge.InformationPage;
import minefantasy.mfr.mechanics.knowledge.ResearchLogic;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import teamroots.embers.RegistryManager;

import static minefantasy.mfr.init.MineFantasyKnowledgeList.engineering_components;
import static minefantasy.mfr.init.MineFantasyKnowledgeList.engineering_tanner;
import static minefantasy.mfr.mechanics.knowledge.InformationList.engineering;

public class ResearchInit {

    public static InformationBase mechanicalCore;
    public static InformationBase emberActivator;
    public static InformationBase melter;

    public static void init() {
        mechanicalCore = (new NewInformationBase("Mechanical Core", 7, 5, 1, RegistryManager.mech_core, engineering_tanner)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        emberActivator = (new NewInformationBase("Ember Activator", 9, 5, 1, RegistryManager.ember_activator, mechanicalCore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        melter = (new NewInformationBase("Melter", 9, 7, 1, RegistryManager.mixer, emberActivator)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        initPages();
    }

    public static void initPages() {
        mechanicalCore.addPages(new EntryPageText(Information.mechancialCore1));
        emberActivator.addPages(new EntryPageText(Information.mechancialCore1));
        melter.addPages(new EntryPageText(Information.mechancialCore1));
    }

    private static class NewInformationBase extends InformationBase {

        public NewInformationBase(String name, int x, int y, int artefacts, Item icon, InformationBase parent) {
            super(name, x, y, artefacts, icon, parent);
        }

        public NewInformationBase(String name, int x, int y, int artefacts, Block icon, InformationBase parent) {
            super(name, x, y, artefacts, icon, parent);
        }

        @SideOnly(Side.CLIENT)
        public String getDisplayName() {
            String disName = super.getDisplayName();
            return disName.substring(10);
        }

    }

}
