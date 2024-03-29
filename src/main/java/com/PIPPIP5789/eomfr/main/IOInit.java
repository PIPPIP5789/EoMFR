package com.PIPPIP5789.eomfr.main;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class IOInit {

    public static final String
            ALCHEMYPEDESTAL = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"P P\",\n" +
            "    \"IEI\",\n" +
            "    \"SBS\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:crystal_ember\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"S\": {\n" +
            "      \"item\": \"embers:stairs_caminite_brick\"\n" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"embers:block_copper\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:alchemy_pedestal\"\n" +
            "  }\n" +
            "}",
    ALCHEMYTABLET = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,  \"pattern\": [\n" +
            "    \" P \",\n" +
            "    \"SCS\",\n" +
            "    \"BDB\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"D\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"embers:block_caminite_brick\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"copper\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"S\": {\n" +
            "      \"item\": \"embers:stairs_caminite_brick\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:alchemy_tablet\"\n" +
            "  }\n" +
            "}",
    ASHENCLOAK = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,  \"pattern\": [\n" +
            "    \"P P\",\n" +
            "    \"CIC\",\n" +
            "    \"CIC\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"embers:ashen_cloth\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ashen_cloak_chest\"\n" +
            "  }\n" +
            "}",
    BEAMCANNON = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,  \"pattern\": [\n" +
            "    \"PEP\",\n" +
            "    \"PEP\",\n" +
            "    \"DBD\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"D\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"copper\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:crystal_ember\"\n" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"embers:block_caminite_brick\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:beam_cannon\"\n" +
            "  }\n" +
            "}",
    BEAMSPLITTER = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,  \"pattern\": [\n" +
            "    \" D \",\n" +
            "    \"CPC\",\n" +
            "    \" I \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    },\n" +
            "    \"D\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:beam_splitter\"\n" +
            "  }\n" +
            "}",
    BIN = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,  \"pattern\": [\n" +
            "    \"I I\",\n" +
            "    \"I I\",\n" +
            "    \"IPI\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:bin\"\n" +
            "  }\n" +
            "}",
    CASTERORB = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"IEI\",\n" +
            "    \"III\",\n" +
            "    \" P \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:crystal_ember\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:caster_orb\"\n" +
            "  }\n" +
            "}",
    CATALYZER = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,  \"pattern\": [\n" +
            "    \" I \",\n" +
            "    \"PEP\",\n" +
            "    \"IMI\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "    \"item\": \"minefantasyreforged:silver_ingot\"" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"silver\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"M\": {\n" +
            "      \"item\": \"embers:mech_core\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:ember_cluster\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:catalyzer\"\n" +
            "  }\n" +
            "}",
    CHARGER = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,  \"pattern\": [\n" +
            "    \" X \",\n" +
            "    \"DCD\",\n" +
            "    \"IPI\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"D\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"copper\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"X\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:charger\"\n" +
            "  }\n" +
            "}",
    CINDERPLINTH = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,  \"pattern\": [\n" +
            "    \" P \",\n" +
            "    \"IFI\",\n" +
            "    \"PBP\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "    \"item\": \"minefantasyreforged:silver_ingot\"" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"lead\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"embers:block_caminite_brick\"\n" +
            "    },\n" +
            "    \"F\": {\n" +
            "      \"item\": \"minecraft:furnace\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:cinder_plinth\"\n" +
            "  }\n" +
            "}",
    CLOCKWORKATTENUATOR = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,  \"pattern\": [\n" +
            "    \"NRN\",\n" +
            "    \" P \",\n" +
            "    \"NEN\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"E\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"electrum\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"N\": {\n" +
            "      \"item\": \"embers:nugget_electrum\"\n" +
            "    },\n" +
            "    \"R\": {\n" +
            "      \"item\": \"minecraft:redstone\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"item\": \"minecraft:paper\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:clockwork_attenuator\"\n" +
            "  }\n" +
            "}",
    CLOCKWORKAXE = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,  \"pattern\": [\n" +
            "    \"PCP\",\n" +
            "    \"DED\",\n" +
            "    \" S \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"D\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:shard_ember\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"copper\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"S\": {\n" +
            "      \"item\": \"minecraft:stick\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:axe_clockwork\"\n" +
            "  }\n" +
            "}",
    COMBUSTOR = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \" C \",\n" +
            "    \"PEP\",\n" +
            "    \"CMC\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"C\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"M\": {\n" +
            "      \"item\": \"embers:mech_core\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:ember_cluster\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:combustor\"\n" +
            "  }\n" +
            "}",
    CRYSTALCELL = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \" E \",\n" +
            "    \"PEP\",\n" +
            "    \"CDC\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:crystal_ember\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"embers:block_copper\"\n" +
            "    },\n" +
            "    \"D\": {\n" +
            "      \"item\": \"embers:block_dawnstone\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:crystal_cell\"\n" +
            "  }\n" +
            "}",
    DAWNSTONEMAIL = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"P P\",\n" +
            "    \"PPP\",\n" +
            "    \"PPP\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:dawnstone_mail\"\n" +
            "  }\n" +
            "}",
    DIFFRACTIONBARREL = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"IPS\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"item\": \"minecraft:iron_bars\"\n" +
            "    },\n" +
            "    \"S\": {\n" +
            "      \"item\": \"embers:superheater\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:diffraction_barrel\"\n" +
            "  }\n" +
            "}",
    EMBERACTIVATOR = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"III\",\n" +
            "    \"III\",\n" +
            "    \"PFP\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    },\n" +
            "    \"F\": {\n" +
            "      \"item\": \"minecraft:furnace\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ember_activator\"\n" +
            "  }\n" +
            "}",
    EMBERBELT = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"LIL\",\n" +
            "    \"L L\",\n" +
            "    \"PEP\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:ember_cluster\"\n" +
            "    },\n" +
            "    \"L\": {\n" +
            "      \"item\": \"minecraft:leather\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ember_belt\"\n" +
            "  }\n" +
            "}",
    EMBERBORE = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"ember_production\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"SCS\",\n" +
            "    \"SMS\",\n" +
            "    \"III\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"C\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"S\": {\n" +
            "      \"item\": \"embers:stairs_caminite_brick\"\n" +
            "    },\n" +
            "    \"M\": {\n" +
            "      \"item\": \"embers:mech_core\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ember_bore\"\n" +
            "  }\n" +
            "}",
    EMBERBULB = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \" PI\",\n" +
            "    \"GEG\",\n" +
            "    \" G \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:ember_cluster\"\n" +
            "    },\n" +
            "    \"G\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"blockGlass\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ember_bulb\"\n" +
            "  }\n" +
            "}",
    EMBERCARTRIDGE = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"IPI\",\n" +
            "    \"GCG\",\n" +
            "    \" G \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"copper\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"G\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"blockGlass\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"embers:crystal_ember\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ember_cartridge\"\n" +
            "  }\n" +
            "}",
    EMBERFUNNEL = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"P P\",\n" +
            "    \"IEI\",\n" +
            "    \" P \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:ember_receiver\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ember_funnel\"\n" +
            "  }\n" +
            "}",
    EMBERGAUGE = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"Gadgets\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"R\",\n" +
            "    \"P\",\n" +
            "    \"C\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"R\": {\n" +
            "      \"item\": \"minecraft:redstone\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"copper\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"item\": \"minecraft:paper\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ember_gauge\"\n" +
            "  }\n" +
            "}",
    EMBERINJECTOR = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"I I\",\n" +
            "    \"DCD\",\n" +
            "    \"BSB\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "    \"item\": \"minefantasyreforged:silver_ingot\"" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"silver\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"D\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"embers:wildfire_core\"\n" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"embers:block_caminite_brick\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ember_injector\"\n" +
            "  }\n" +
            "}",
    EMBERPULSER = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"P\",\n" +
            "    \"E\",\n" +
            "    \"I\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:ember_emitter\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ember_pulser\"\n" +
            "  }\n" +
            "}",
    EMBERRELAY = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \" C \",\n" +
            "    \"C C\",\n" +
            "    \" I \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ember_relay\"\n" +
            "  }\n" +
            "}",
    EMBERSIPHON = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"WIW\",\n" +
            "    \"PIP\",\n" +
            "    \"BBB\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"Nickel\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"embers:brick_caminite\"\n" +
            "    },\n" +
            "    \"W\": {\n" +
            "      \"item\": \"embers:wall_caminite_brick\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ember_siphon\"\n" +
            "  }\n" +
            "}",
    EMBERSTAFF = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"PEP\",\n" +
            "    \"DSD\",\n" +
            "    \" S \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"D\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"silver\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:shard_ember\"\n" +
            "    },\n" +
            "    \"S\": {\n" +
            "      \"item\": \"minecraft:stick\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:staff_ember\"\n" +
            "  }\n" +
            "}",
    FLUIDGAUGE = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"Gadgets\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"R\",\n" +
            "    \"P\",\n" +
            "    \"I\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"R\": {\n" +
            "      \"item\": \"minecraft:redstone\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"item\": \"minecraft:paper\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:fluid_gauge\"\n" +
            "  }\n" +
            "}",
    FLUIDPIPE = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"Piping\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"IPI\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:pipe\"\n" +
            "  }\n" +
            "}",
    FLUIDTRANSFER = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"Piping\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"PXP\",\n" +
            "    \"IXI\",\n" +
            "    \"I I\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"X\": {\n" +
            "      \"item\": \"embers:pipe\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:fluid_transfer\"\n" +
            "  }\n" +
            "}",
    GLIMMERLAMP = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \" P \",\n" +
            "    \"BCB\",\n" +
            "    \" P \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"minecraft:iron_bars\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"embers:glimmer_shard\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:glimmer_lamp\"\n" +
            "  }\n" +
            "}",
    HEARTHCOIL = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"PPP\",\n" +
            "    \"IBI\",\n" +
            "    \" M \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"copper\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"embers:block_copper\"\n" +
            "    },\n" +
            "    \"M\": {\n" +
            "      \"item\": \"embers:mech_core\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:heat_coil\"\n" +
            "  }\n" +
            "}",
    IGNITIONCANNON = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \" DP\",\n" +
            "    \"DPI\",\n" +
            "    \"ES \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"D\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:shard_ember\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"S\": {\n" +
            "      \"item\": \"minecraft:stick\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:ignition_cannon\"\n" +
            "  }\n" +
            "}",
    INFERNOFORGE = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"DPD\",\n" +
            "    \"ICI\",\n" +
            "    \"XWX\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"X\": {\n" +
            "      \"item\": \"embers:block_caminite_brick\"\n" +
            "    },\n" +
            "    \"W\": {\n" +
            "      \"item\": \"embers:wildfire_core\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"embers:block_copper\"\n" +
            "    },\n" +
            "    \"D\": {\n" +
            "      \"item\": \"embers:block_dawnstone\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:inferno_forge\"\n" +
            "  }\n" +
            "}",
    ITEMTRANSFER = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"Piping\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"PXP\",\n" +
            "    \"IXI\",\n" +
            "    \"I I\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotLead\"\n" +
            "    },\n" +
            "    \"X\": {\n" +
            "      \"item\": \"embers:item_pipe\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"lead\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:item_transfer\"\n" +
            "  }\n" +
            "}",
    JETAUGMENT = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"PP \",\n" +
            "    \"XEI\",\n" +
            "    \"PP \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:crystal_ember\"\n" +
            "    },\n" +
            "    \"X\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:jet_augment\"\n" +
            "  }\n" +
            "}",
    LANTERN = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"P\",\n" +
            "    \"E\",\n" +
            "    \"I\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:shard_ember\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:block_lantern\"\n" +
            "  }\n" +
            "}",
    MECHACCESSOR = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"SPI\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"S\": {\n" +
            "      \"item\": \"embers:stairs_caminite_brick\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:mech_accessor\"\n" +
            "  }\n" +
            "}",
    MECHANICALCORE = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"Mechanical Core\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"I I\",\n" +
            "    \" C \",\n" +
            "    \"I I\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"composite_alloy\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:mech_core\"\n" +
            "  }\n" +
            "}",
    MECHANICALPUMP = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"Piping\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"TPT\",\n" +
            "    \"PPP\",\n" +
            "    \"BEB\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"T\": {\n" +
            "      \"item\": \"embers:pipe\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:pump\"\n" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"embers:brick_caminite\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:mechanical_pump\"\n" +
            "  }\n" +
            "}",
    MINIBOILER = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"PPP\",\n" +
            "    \"I P\",\n" +
            "    \"PPP\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:mini_boiler\"\n" +
            "  }\n" +
            "}",
    MIXER = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"PPP\",\n" +
            "    \"PCP\",\n" +
            "    \"IMI\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    },\n" +
            "    \"M\": {\n" +
            "      \"item\": \"embers:mech_core\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:mixer\"\n" +
            "  }\n" +
            "}",
    REACTOR = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"III\",\n" +
            "    \"ICI\",\n" +
            "    \"PBP\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"silver\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"embers:wildfire_core\"\n" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"embers:block_caminite_brick\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:reactor\"\n" +
            "  }\n" +
            "}",
    RESONATINGBELL = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"IIX\",\n" +
            "    \" SI\",\n" +
            "    \"P I\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"silver\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"S\": {\n" +
            "    \"item\": \"minefantasyreforged:silver_ingot\"" +
            "    },\n" +
            "    \"X\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:resonating_bell\"\n" +
            "  }\n" +
            "}",
    SPARKPLUG = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"I I\",\n" +
            "    \" P \",\n" +
            "    \" A \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotAluminum\"\n" +
            "    },\n" +
            "    \"D\": {\n" +
            "      \"item\": \"embers:aspectus_silver\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:spark_plug\"\n" +
            "  }\n" +
            "}",
    STIRLING = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"P P\",\n" +
            "    \"IEI\",\n" +
            "    \"SBS\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:crystal_ember\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"item\": \"embers:wildfire_core\"\n" +
            "    },\n" +
            "    \"E\": {\n" +
            "      \"item\": \"embers:shard_ember\"\n" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"embers:block_copper\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:stirling\"\n" +
            "  }\n" +
            "}",
    SUPERHEATER = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \" IP\",\n" +
            "    \"CCI\",\n" +
            "    \"CC \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"dawnstone\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotDawnstone\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"item\": \"minefantasyreforged:copper_ingot\"" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:superheater\"\n" +
            "  }\n" +
            "}",
    TANK = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"B B\",\n" +
            "    \"P P\",\n" +
            "    \"BPB\"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"iron\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    },\n" +
            "    \"B\": {\n" +
            "      \"item\": \"embers:brick_caminite\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:block_tank\"\n" +
            "  }\n" +
            "}",
    TINKERHAMMER = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"tinker_hammer\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"ICI\",\n" +
            "    \"ISI\",\n" +
            "    \" S \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"S\": {\n" +
            "      \"item\": \"minecraft:stick\"\n" +
            "    },\n" +
            "    \"C\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"composite_alloy\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:bar\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:tinker_hammer\"\n" +
            "  }\n" +
            "}",
    TINKERLENS = "{\n" +
            "  \"type\": \"CustomToolOreDictAnvilRecipes\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 2,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": false,\n" +
            "  \"pattern\": [\n" +
            "    \"IN \",\n" +
            "    \"PGN\",\n" +
            "    \"IN \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"I\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"ingotIron\"\n" +
            "    },\n" +
            "    \"N\": {\n" +
            "      \"type\": \"oreDict\",\n" +
            "      \"ore\": \"nuggetGold\"\n" +
            "    },\n" +
            "    \"G\": {\n" +
            "      \"item\": \"minecraft:glass\"\n" +
            "    },\n" +
            "    \"P\": {\n" +
            "      \"nbt\": \"{mf_custom_materials:{main_material:\\\"lead\\\"}}\",\n" +
            "      \"item\": \"minefantasyreforged:plate\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"embers:tinker_lens\"\n" +
            "  }\n" +
            "}";

    public static void initTypes(FMLPreInitializationEvent event) {
        try {
            //String tempPath = "MineFantasyReforged/custom/registry/";

            //String tempPath = "MineFantasyReforged/custom/recipes/";
            String tempPath2 = "MineFantasyReforged/custom/registry/eomfr/";
            //if(!new File(tempPath2).mkdirs()) {
            //System.exit(-1);
            //}
            //Files.createDirectory(Paths.get(tempPath2));
            //tempPath += "/";
            new File(event.getModConfigurationDirectory(), tempPath2).mkdirs();
            File tempFile = new File(event.getModConfigurationDirectory(), tempPath2 + "metal_types" + ".json");
            //tempFile.mkdirs();
            PrintWriter tempWriter = new PrintWriter(tempFile);

            tempWriter.println("{\n" +
                    "    \"mod\": \"eomfr\",\n" +
                    "    \"metals\": [\n" +
                    "        {\n" +
                    "            \"name\": \"lead\",\n" +
                    "            \"oreDictList\": \"ingotLead\",\n" +
                    "            \"properties\": {\n" +
                    "                \"tier\": 1,\n" +
                    "                \"durability\": 1.6,\n" +
                    "                \"flexibility\": 0.9,\n" +
                    "                \"sharpness\": 1.3,\n" +
                    "                \"hardness\": 2.5,\n" +
                    "                \"resistance\": 20,\n" +
                    "                \"density\": 3.5,\n" +
                    "                \"melting_point\": 1400,\n" +
                    "                \"rarity\": 0,\n" +
                    "                \"craft_tier\": 1,\n" +
                    "                \"craft_time_modifier\": 5.0,\n" +
                    "                \"unbreakable\": false\n" +
                    "            },\n" +
                    "            \"armour_stats\": {\n" +
                    "                \"cutting\": 1.0,\n" +
                    "                \"blunt\": 1.0,\n" +
                    "                \"piercing\": 1.0\n" +
                    "            },\n" +
                    "            \"color\": {\n" +
                    "                \"red\": 140,\n" +
                    "                \"green\": 127,\n" +
                    "                \"blue\": 157\n" +
                    "            }\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"name\": \"dawnstone\",\n" +
                    "            \"oreDictList\": \"ingotDawnstone\",\n" +
                    "            \"properties\": {\n" +
                    "                \"tier\": 5,\n" +
                    "                \"durability\": 6.0,\n" +
                    "                \"flexibility\": 1.5,\n" +
                    "                \"sharpness\": 3.8,\n" +
                    "                \"hardness\": 3.3,\n" +
                    "                \"resistance\": 60,\n" +
                    "                \"density\": 3.2,\n" +
                    "                \"melting_point\": 2500,\n" +
                    "                \"rarity\": 0,\n" +
                    "                \"craft_tier\": 4,\n" +
                    "                \"craft_time_modifier\": 10.0,\n" +
                    "                \"unbreakable\": false\n" +
                    "            },\n" +
                    "            \"armour_stats\": {\n" +
                    "                \"cutting\": 1.0,\n" +
                    "                \"blunt\": 1.0,\n" +
                    "                \"piercing\": 1.0\n" +
                    "            },\n" +
                    "            \"color\": {\n" +
                    "                \"red\": 255,\n" +
                    "                \"green\": 182,\n" +
                    "                \"blue\": 72\n" +
                    "            }\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"name\": \"aluminum\",\n" +
                    "            \"oreDictList\": \"ingotAluminum\",\n" +
                    "            \"properties\": {\n" +
                    "                \"tier\": 0,\n" +
                    "                \"durability\": 1.2,\n" +
                    "                \"flexibility\": 0.7,\n" +
                    "                \"sharpness\": 0.0,\n" +
                    "                \"hardness\": 1.2,\n" +
                    "                \"resistance\": 10,\n" +
                    "                \"density\": 2.0,\n" +
                    "                \"melting_point\": 800,\n" +
                    "                \"rarity\": -1,\n" +
                    "                \"craft_tier\": -1,\n" +
                    "                \"craft_time_modifier\": 2.0,\n" +
                    "                \"unbreakable\": false\n" +
                    "            },\n" +
                    "            \"armour_stats\": {\n" +
                    "                \"cutting\": 1.0,\n" +
                    "                \"blunt\": 1.0,\n" +
                    "                \"piercing\": 1.0\n" +
                    "            },\n" +
                    "            \"color\": {\n" +
                    "                \"red\": 234,\n" +
                    "                \"green\": 152,\n" +
                    "                \"blue\": 134\n" +
                    "            }\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"name\": \"electrum\",\n" +
                    "            \"oreDictList\": \"ingotElectrum\",\n" +
                    "            \"properties\": {\n" +
                    "                \"tier\": 4,\n" +
                    "                \"durability\": 7.0,\n" +
                    "                \"flexibility\": 1.5,\n" +
                    "                \"sharpness\": 2.0,\n" +
                    "                \"hardness\": 3.0,\n" +
                    "                \"resistance\": 55,\n" +
                    "                \"density\": 3.0,\n" +
                    "                \"melting_point\": 2000,\n" +
                    "                \"rarity\": 0,\n" +
                    "                \"craft_tier\": 3,\n" +
                    "                \"craft_time_modifier\": 8.0,\n" +
                    "                \"unbreakable\": false\n" +
                    "            },\n" +
                    "            \"armour_stats\": {\n" +
                    "                \"cutting\": 1.0,\n" +
                    "                \"blunt\": 1.0,\n" +
                    "                \"piercing\": 1.0\n" +
                    "            },\n" +
                    "            \"color\": {\n" +
                    "                \"red\": 240,\n" +
                    "                \"green\": 216,\n" +
                    "                \"blue\": 113\n" +
                    "            }\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"name\": \"nickel\",\n" +
                    "            \"oreDictList\": \"ingotNickel\",\n" +
                    "            \"properties\": {\n" +
                    "                \"tier\": 0,\n" +
                    "                \"durability\": 1.2,\n" +
                    "                \"flexibility\": 0.8,\n" +
                    "                \"sharpness\": 0.5,\n" +
                    "                \"hardness\": 1.0,\n" +
                    "                \"resistance\": 50,\n" +
                    "                \"density\": 3.0,\n" +
                    "                \"melting_point\": 1200,\n" +
                    "                \"rarity\": 0,\n" +
                    "                \"craft_tier\": 0,\n" +
                    "                \"craft_time_modifier\": 2.0,\n" +
                    "                \"unbreakable\": false\n" +
                    "            },\n" +
                    "            \"armour_stats\": {\n" +
                    "                \"cutting\": 1.0,\n" +
                    "                \"blunt\": 1.0,\n" +
                    "                \"piercing\": 1.0\n" +
                    "            },\n" +
                    "            \"color\": {\n" +
                    "                \"red\": 171,\n" +
                    "                \"green\": 181,\n" +
                    "                \"blue\": 152\n" +
                    "            }\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}");
            tempWriter.flush();
            tempWriter.close();
        }
        catch(IOException e) {
        }
    }

    public static void initRecipes(FMLPreInitializationEvent event) {
        try {
            String path = "MineFantasyReforged/custom/recipes/anvil_recipes/";
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

            file = new File(event.getModConfigurationDirectory(), path +  "EmberBore" + ".json");
            file.deleteOnExit();
            writer = new PrintWriter(file);
            writer.println(IOInit.EMBERBORE);
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
            //writer = new PrintWriter(file);
            //writer.println(IOInit.SPARKPLUG);
            //writer.flush();

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
