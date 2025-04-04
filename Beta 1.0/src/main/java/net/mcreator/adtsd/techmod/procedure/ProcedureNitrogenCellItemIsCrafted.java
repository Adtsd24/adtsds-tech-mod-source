package net.mcreator.adtsd.techmod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.adtsd.techmod.item.ItemOxygenCell;
import net.mcreator.adtsd.techmod.item.ItemHydrogenCell;
import net.mcreator.adtsd.techmod.item.ItemDustCarbon;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class ProcedureNitrogenCellItemIsCrafted extends ElementsADtsdsTechMod.ModElement {
	public ProcedureNitrogenCellItemIsCrafted(ElementsADtsdsTechMod instance) {
		super(instance, 435);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NitrogenCellItemIsCrafted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemHydrogenCell.block, (int) (1));
			_setstack.setCount(4);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemOxygenCell.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemDustCarbon.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
