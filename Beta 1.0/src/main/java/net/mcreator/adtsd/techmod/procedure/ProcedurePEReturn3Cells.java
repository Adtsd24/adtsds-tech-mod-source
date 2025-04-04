package net.mcreator.adtsd.techmod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.adtsd.techmod.item.ItemEmptyCell;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class ProcedurePEReturn3Cells extends ElementsADtsdsTechMod.ModElement {
	public ProcedurePEReturn3Cells(ElementsADtsdsTechMod instance) {
		super(instance, 429);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PEReturn3Cells!");
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
