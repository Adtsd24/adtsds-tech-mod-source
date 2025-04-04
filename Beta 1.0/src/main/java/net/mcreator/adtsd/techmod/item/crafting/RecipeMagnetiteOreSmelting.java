
package net.mcreator.adtsd.techmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.adtsd.techmod.block.BlockMagnetiteOre;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class RecipeMagnetiteOreSmelting extends ElementsADtsdsTechMod.ModElement {
	public RecipeMagnetiteOreSmelting(ElementsADtsdsTechMod instance) {
		super(instance, 70);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMagnetiteOre.block, (int) (1)), new ItemStack(Items.IRON_INGOT, (int) (2)), 3F);
	}
}
