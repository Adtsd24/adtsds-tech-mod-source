package net.mcreator.adtsd.techmod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.adtsd.techmod.item.ItemEmptyCell;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class ProcedureDustAluminaItemIsCraftedsmelted extends ElementsADtsdsTechMod.ModElement {
	public ProcedureDustAluminaItemIsCraftedsmelted(ElementsADtsdsTechMod instance) {
		super(instance, 438);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DustAluminaItemIsCraftedsmelted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemEmptyCell.block, (int) (1));
			_setstack.setCount(3);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
