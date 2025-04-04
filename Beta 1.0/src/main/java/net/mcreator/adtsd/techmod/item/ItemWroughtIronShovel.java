
package net.mcreator.adtsd.techmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

import java.util.Set;
import java.util.HashMap;

@ElementsADtsdsTechMod.ModElement.Tag
public class ItemWroughtIronShovel extends ElementsADtsdsTechMod.ModElement {
	@GameRegistry.ObjectHolder("adtsdstechmod:wroughtironshovel")
	public static final Item block = null;
	public ItemWroughtIronShovel(ElementsADtsdsTechMod instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("WROUGHTIRONSHOVEL", 2, 876, 7f, -2f, 17)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("wroughtironshovel").setRegistryName("wroughtironshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("adtsdstechmod:wroughtironshovel", "inventory"));
	}
}
