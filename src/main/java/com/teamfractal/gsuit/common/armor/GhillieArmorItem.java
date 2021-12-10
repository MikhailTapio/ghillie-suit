package com.teamfractal.gsuit.common.armor;

import com.teamfractal.gsuit.common.config.GSCommonConfig;
import com.teamfractal.gsuit.common.tools.InvisibilityCheck;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.extensions.IForgeItem;


public class GhillieArmorItem extends ArmorItem implements IForgeItem {
    private final boolean isLeggings;
    public GhillieArmorItem(EquipmentSlot s, Properties p, Boolean isLeggings) {
        super(GSArmorMaterials.GHILLIE, s, p);
        this.isLeggings = isLeggings;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type)
    {
        return (!InvisibilityCheck.check(entity) && !GSCommonConfig.INVISIBILITY_ARMOR.get() && !entity.isInvisible())?
                (isLeggings?"gsuit:textures/models/armor/ghillie_layer_2.png":
                        "gsuit:textures/models/armor/ghillie_layer_1.png")
                : "gsuit:textures/models/armor/invisible_layer.png";
    }
}
