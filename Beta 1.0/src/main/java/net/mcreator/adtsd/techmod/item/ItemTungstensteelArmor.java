
package net.mcreator.adtsd.techmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

@ElementsADtsdsTechMod.ModElement.Tag
public class ItemTungstensteelArmor extends ElementsADtsdsTechMod.ModElement {
	@GameRegistry.ObjectHolder("adtsdstechmod:tungstensteelarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("adtsdstechmod:tungstensteelarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("adtsdstechmod:tungstensteelarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("adtsdstechmod:tungstensteelarmorboots")
	public static final Item boots = null;
	public ItemTungstensteelArmor(ElementsADtsdsTechMod instance) {
		super(instance, 393);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TUNGSTENSTEELARMOR", "adtsdstechmod:tungstensteel", 15, new int[]{3, 5, 10, 7},
				45, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_chain")),
				5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("tungstensteelarmorhelmet")
				.setRegistryName("tungstensteelarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("tungstensteelarmorbody")
				.setRegistryName("tungstensteelarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("tungstensteelarmorlegs")
				.setRegistryName("tungstensteelarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("tungstensteelarmorboots")
				.setRegistryName("tungstensteelarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("adtsdstechmod:tungstensteelarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("adtsdstechmod:tungstensteelarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("adtsdstechmod:tungstensteelarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("adtsdstechmod:tungstensteelarmorboots", "inventory"));
	}
}
