
package net.mcreator.adtsd.techmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.adtsd.techmod.item.ItemDustIron;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class RecipeDustIronSmelting extends ElementsADtsdsTechMod.ModElement {
	public RecipeDustIronSmelting(ElementsADtsdsTechMod instance) {
		super(instance, 127);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemDustIron.block, (int) (1)), new ItemStack(Items.IRON_INGOT, (int) (1)), 1F);
	}
}
