package com.teamfractal.gsuit.common.armor;

import com.teamfractal.gsuit.common.config.GSCommonConfig;
import com.teamfractal.gsuit.common.tools.InvisibilityCheck;
import com.teamfractal.gsuit.common.util.GSRegistryHandler;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;

public class GSArmorItems {
    public static RegistryObject<Item> armorPGHelmet;
    public static RegistryObject<Item> armorPGChestplate;
    public static RegistryObject<Item> armorPGLeggings;
    public static RegistryObject<Item> armorPGBoots;

    public static void register(){
        armorPGHelmet = GSRegistryHandler.Items.register("ghillie_helmet"
                ,() -> new GhillieArmorItem(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT),false){
                    @Override
                    public void onArmorTick(ItemStack stack, Level world, Player player){
                        if(GSCommonConfig.INVISIBILITY_GENERAL.get())
                        {
                            boolean conditionMet = player.getItemBySlot(EquipmentSlot.CHEST).is(armorPGChestplate.get())
                                    && player.getItemBySlot(EquipmentSlot.LEGS).is(armorPGLeggings.get())
                                    && player.getItemBySlot(EquipmentSlot.FEET).is(armorPGBoots.get())
                                    && InvisibilityCheck.check(player);
                            if (!GSCommonConfig.INVISIBILITY_TYPE.get())
                            {
                                if(conditionMet)
                                {
                                    player.setInvisible(true);
                                }else if(!player.hasEffect(MobEffects.INVISIBILITY)){
                                    player.setInvisible(false);
                                }
                            }
                            else if(conditionMet){
                                player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY,2,1));
                            }
                        }
                    }
                });
        armorPGChestplate = GSRegistryHandler.Items.register("ghillie_chestplate"
                ,() -> new GhillieArmorItem(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT),false));
        armorPGLeggings = GSRegistryHandler.Items.register("ghillie_leggings"
                ,() -> new GhillieArmorItem(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT),true));
        armorPGBoots = GSRegistryHandler.Items.register("ghillie_boots"
                ,() -> new GhillieArmorItem(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT),false));
    }
}
