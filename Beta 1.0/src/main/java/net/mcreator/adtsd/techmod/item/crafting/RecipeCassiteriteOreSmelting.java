
package net.mcreator.adtsd.techmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.adtsd.techmod.item.ItemTinIngot;
import net.mcreator.adtsd.techmod.block.BlockCassiteriteOre;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class RecipeCassiteriteOreSmelting extends ElementsADtsdsTechMod.ModElement {
	public RecipeCassiteriteOreSmelting(ElementsADtsdsTechMod instance) {
		super(instance, 67);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCassiteriteOre.block, (int) (1)), new ItemStack(ItemTinIngot.block, (int) (2)), 3F);
	}
}
