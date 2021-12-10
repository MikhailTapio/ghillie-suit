package com.teamfractal.gsuit.common.tools;

import com.teamfractal.gsuit.common.config.GSCommonConfig;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Blocks;

public class InvisibilityCheck {
    public static boolean check(Entity entity){
        return
                ((entity.isCrouching()
                        && ((entity.getLevel().getBlockState(entity.getOnPos()).is(Blocks.GRASS_BLOCK) && GSCommonConfig.GRASS_BLOCK.get())
                        ||(entity.getFeetBlockState().is(Blocks.GRASS) && GSCommonConfig.SHORT_GRASS.get())))
                        ||
                        ((entity.getFeetBlockState().is(Blocks.TALL_GRASS) && GSCommonConfig.TALL_GRASS.get())
                                || (entity.getFeetBlockState().is(Blocks.SUGAR_CANE) && GSCommonConfig.SUGAR_CANE.get())
                                || (entity.getFeetBlockState().is(Blocks.BAMBOO)) && GSCommonConfig.BAMBOO.get())
                        || entity.isUnderWater());
    }
}
