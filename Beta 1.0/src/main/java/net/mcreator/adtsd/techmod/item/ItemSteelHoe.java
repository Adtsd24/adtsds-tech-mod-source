
package net.mcreator.adtsd.techmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

import java.util.Set;
import java.util.HashMap;

@ElementsADtsdsTechMod.ModElement.Tag
public class ItemSteelHoe extends ElementsADtsdsTechMod.ModElement {
	@GameRegistry.ObjectHolder("adtsdstechmod:steelhoe")
	public static final Item block = null;
	public ItemSteelHoe(ElementsADtsdsTechMod instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("STEELHOE", 4, 1200, 9f, 0f, 28)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("steelhoe").setRegistryName("steelhoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("adtsdstechmod:steelhoe", "inventory"));
	}
}
