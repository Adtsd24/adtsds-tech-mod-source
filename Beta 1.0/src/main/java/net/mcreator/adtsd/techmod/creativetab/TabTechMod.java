
package net.mcreator.adtsd.techmod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.adtsd.techmod.item.ItemToolHammer;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class TabTechMod extends ElementsADtsdsTechMod.ModElement {
	public TabTechMod(ElementsADtsdsTechMod instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtechmod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemToolHammer.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
