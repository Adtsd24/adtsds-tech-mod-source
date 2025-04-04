
package net.mcreator.adtsd.techmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.adtsd.techmod.item.ItemDustGold;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class RecipeGoldDustToIngotFurnace extends ElementsADtsdsTechMod.ModElement {
	public RecipeGoldDustToIngotFurnace(ElementsADtsdsTechMod instance) {
		super(instance, 315);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemDustGold.block, (int) (1)), new ItemStack(Items.GOLD_INGOT, (int) (1)), 1F);
	}
}
