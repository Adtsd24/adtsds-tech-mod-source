
package net.mcreator.adtsd.techmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.adtsd.techmod.item.ItemCoalCoke;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class FuelCoalCokeBurn extends ElementsADtsdsTechMod.ModElement {
	public FuelCoalCokeBurn(ElementsADtsdsTechMod instance) {
		super(instance, 102);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemCoalCoke.block, (int) (1)).getItem())
			return 3200;
		return 0;
	}
}
