
package net.mcreator.adtsd.techmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.adtsd.techmod.item.ItemTinIngot;
import net.mcreator.adtsd.techmod.block.BlockTinOre;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class RecipeTinOreSmelting extends ElementsADtsdsTechMod.ModElement {
	public RecipeTinOreSmelting(ElementsADtsdsTechMod instance) {
		super(instance, 9);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTinOre.block, (int) (1)), new ItemStack(ItemTinIngot.block, (int) (1)), 1.2F);
	}
}
