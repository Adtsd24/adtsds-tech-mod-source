
package net.mcreator.adtsd.techmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.adtsd.techmod.item.ItemWroughtIronIngot;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class RecipeWroughtIronFurnace extends ElementsADtsdsTechMod.ModElement {
	public RecipeWroughtIronFurnace(ElementsADtsdsTechMod instance) {
		super(instance, 39);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.IRON_INGOT, (int) (1)), new ItemStack(ItemWroughtIronIngot.block, (int) (1)), 1.3F);
	}
}
