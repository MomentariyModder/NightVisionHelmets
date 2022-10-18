
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nightvisionhelmets.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class NightVisionHelmetsModTabs {
	public static CreativeModeTab TAB_NIGHTVISIONHELMETS;

	public static void load() {
		TAB_NIGHTVISIONHELMETS = new CreativeModeTab("tabnightvisionhelmets") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(NightVisionHelmetsModItems.NIGHTVISIONGLASSES.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
