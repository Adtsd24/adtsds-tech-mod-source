package net.mcreator.adtsd.techmod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.adtsd.techmod.item.ItemOxygenCell;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class ProcedureHydrogenCellItemIsCrafted extends ElementsADtsdsTechMod.ModElement {
	public ProcedureHydrogenCellItemIsCrafted(ElementsADtsdsTechMod instance) {
		super(instance, 436);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HydrogenCellItemIsCrafted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemOxygenCell.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
