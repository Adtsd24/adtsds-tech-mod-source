
package net.mcreator.adtsd.techmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.adtsd.techmod.item.ItemDustBronze;
import net.mcreator.adtsd.techmod.item.ItemBronzeIngot;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class RecipeBronzeIngotSmelting extends ElementsADtsdsTechMod.ModElement {
	public RecipeBronzeIngotSmelting(ElementsADtsdsTechMod instance) {
		super(instance, 24);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemDustBronze.block, (int) (1)), new ItemStack(ItemBronzeIngot.block, (int) (1)), 0.7F);
	}
}
