
package net.mcreator.adtsd.techmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.adtsd.techmod.item.ItemDustCopper;
import net.mcreator.adtsd.techmod.item.ItemCopperIngot;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class RecipeFurnaceCopperDust extends ElementsADtsdsTechMod.ModElement {
	public RecipeFurnaceCopperDust(ElementsADtsdsTechMod instance) {
		super(instance, 153);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemDustCopper.block, (int) (1)), new ItemStack(ItemCopperIngot.block, (int) (1)), 1F);
	}
}
