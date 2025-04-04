
package net.mcreator.adtsd.techmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.adtsd.techmod.item.ItemCopperIngot;
import net.mcreator.adtsd.techmod.block.BlockTetrahedriteOre;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class RecipeTetrahedriteOreSmelting extends ElementsADtsdsTechMod.ModElement {
	public RecipeTetrahedriteOreSmelting(ElementsADtsdsTechMod instance) {
		super(instance, 68);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTetrahedriteOre.block, (int) (1)), new ItemStack(ItemCopperIngot.block, (int) (2)), 3F);
	}
}
