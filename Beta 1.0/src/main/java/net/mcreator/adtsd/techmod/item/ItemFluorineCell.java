
package net.mcreator.adtsd.techmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.adtsd.techmod.creativetab.TabTechMod;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

import java.util.List;

@ElementsADtsdsTechMod.ModElement.Tag
public class ItemFluorineCell extends ElementsADtsdsTechMod.ModElement {
	@GameRegistry.ObjectHolder("adtsdstechmod:fluorinecell")
	public static final Item block = null;
	public ItemFluorineCell(ElementsADtsdsTechMod instance) {
		super(instance, 269);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("adtsdstechmod:fluorinecell", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("fluorinecell");
			setRegistryName("fluorinecell");
			setCreativeTab(TabTechMod.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("A cell of gasious fluorine in a double bond.");
		}
	}
}
