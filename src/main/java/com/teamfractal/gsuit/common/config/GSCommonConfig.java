package com.teamfractal.gsuit.common.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class GSCommonConfig {
    //Main
    public static ForgeConfigSpec COMMON_CONFIG;

    //Machine Configuration
    public static ForgeConfigSpec.BooleanValue INVISIBILITY_GENERAL;
    public static ForgeConfigSpec.BooleanValue INVISIBILITY_ARMOR;
    public static ForgeConfigSpec.BooleanValue INVISIBILITY_TYPE;

    public static ForgeConfigSpec.BooleanValue GRASS_BLOCK;

    public static ForgeConfigSpec.BooleanValue SHORT_GRASS;
    public static ForgeConfigSpec.BooleanValue TALL_GRASS;
    public static ForgeConfigSpec.BooleanValue SUGAR_CANE;
    public static ForgeConfigSpec.BooleanValue BAMBOO;
    public static ForgeConfigSpec.BooleanValue UNDERWATER;


    static{
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        COMMON_BUILDER.comment("Invisibility Effect Configuration").push("Enable Invisibility");
        INVISIBILITY_GENERAL = COMMON_BUILDER.comment("Would the player be invisible in some circumstances when wearing the ghillie suit?")
                .define("invisibility_general",true);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push("Enable Armor Invisibility");
        INVISIBILITY_ARMOR = COMMON_BUILDER.comment("Would the player's ghillie suit be invisible when conditions permit?")
                .define("invisibility_armor",true);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push("Invisibility Type");
        INVISIBILITY_TYPE = COMMON_BUILDER.comment("Would potion effect particles display when the player has invisibility provided by ghillie suit?")
                .define("invisibility_type",false);
        COMMON_BUILDER.comment("Would the player be invisible when wearing ghillie suit and crouching on a grass block?");
        GRASS_BLOCK = COMMON_BUILDER.define("grass block", true);
        COMMON_BUILDER.comment("Would the player be invisible when wearing ghillie suit and hiding in these blocks?");
        SHORT_GRASS = COMMON_BUILDER.define("(short)grass",true);
        TALL_GRASS = COMMON_BUILDER.define("tall grass",true);
        SUGAR_CANE = COMMON_BUILDER.define("sugar cane",true);
        BAMBOO = COMMON_BUILDER.define("bamboo",true);
        COMMON_BUILDER.comment("Would the player be invisible when wearing ghillie suit underwater?");
        UNDERWATER = COMMON_BUILDER.define("underwater", true);

        COMMON_CONFIG = COMMON_BUILDER.build();


    }
}
