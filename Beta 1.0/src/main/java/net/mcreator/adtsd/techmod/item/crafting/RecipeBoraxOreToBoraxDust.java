
package net.mcreator.adtsd.techmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.adtsd.techmod.item.ItemBoraxDust;
import net.mcreator.adtsd.techmod.block.BlockBoraxOre;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class RecipeBoraxOreToBoraxDust extends ElementsADtsdsTechMod.ModElement {
	public RecipeBoraxOreToBoraxDust(ElementsADtsdsTechMod instance) {
		super(instance, 83);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBoraxOre.block, (int) (1)), new ItemStack(ItemBoraxDust.block, (int) (7)), 3F);
	}
}
