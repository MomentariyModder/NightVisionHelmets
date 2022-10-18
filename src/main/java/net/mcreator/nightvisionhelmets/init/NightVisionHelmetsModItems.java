
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nightvisionhelmets.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.nightvisionhelmets.item.NightvisionglassesItem;
import net.mcreator.nightvisionhelmets.item.NetheriteNightItem;
import net.mcreator.nightvisionhelmets.item.IronNightItem;
import net.mcreator.nightvisionhelmets.item.GoldNightItem;
import net.mcreator.nightvisionhelmets.item.DiamondNighRecItem;
import net.mcreator.nightvisionhelmets.NightVisionHelmetsMod;

public class NightVisionHelmetsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NightVisionHelmetsMod.MODID);
	public static final RegistryObject<Item> NIGHTVISIONGLASSES = REGISTRY.register("nightvisionglasses", () -> new NightvisionglassesItem());
	public static final RegistryObject<Item> IRON_NIGHT_HELMET = REGISTRY.register("iron_night_helmet", () -> new IronNightItem.Helmet());
	public static final RegistryObject<Item> GOLD_NIGHT_HELMET = REGISTRY.register("gold_night_helmet", () -> new GoldNightItem.Helmet());
	public static final RegistryObject<Item> DIAMOND_NIGH_REC_HELMET = REGISTRY.register("diamond_nigh_rec_helmet",
			() -> new DiamondNighRecItem.Helmet());
	public static final RegistryObject<Item> NETHERITE_NIGHT_HELMET = REGISTRY.register("netherite_night_helmet",
			() -> new NetheriteNightItem.Helmet());
}
