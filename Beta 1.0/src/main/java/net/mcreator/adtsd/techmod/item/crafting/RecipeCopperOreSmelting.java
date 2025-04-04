
package net.mcreator.adtsd.techmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.adtsd.techmod.item.ItemCopperIngot;
import net.mcreator.adtsd.techmod.block.BlockCopperOre;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class RecipeCopperOreSmelting extends ElementsADtsdsTechMod.ModElement {
	public RecipeCopperOreSmelting(ElementsADtsdsTechMod instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCopperOre.block, (int) (1)), new ItemStack(ItemCopperIngot.block, (int) (1)), 1.2F);
	}
}
