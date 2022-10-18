
package net.mcreator.nightvisionhelmets.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.nightvisionhelmets.init.NightVisionHelmetsModTabs;

public class NightvisionglassesItem extends Item {
	public NightvisionglassesItem() {
		super(new Item.Properties().tab(NightVisionHelmetsModTabs.TAB_NIGHTVISIONHELMETS).stacksTo(1).rarity(Rarity.COMMON));
	}
}
