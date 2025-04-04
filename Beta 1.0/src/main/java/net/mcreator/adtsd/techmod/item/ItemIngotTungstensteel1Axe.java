
package net.mcreator.adtsd.techmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemTool;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

import java.util.Set;

@ElementsADtsdsTechMod.ModElement.Tag
public class ItemIngotTungstensteel1Axe extends ElementsADtsdsTechMod.ModElement {
	@GameRegistry.ObjectHolder("adtsdstechmod:ingottungstensteel1axe")
	public static final Item block = null;
	public ItemIngotTungstensteel1Axe(ElementsADtsdsTechMod instance) {
		super(instance, 384);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
		}.setUnlocalizedName("ingottungstensteel1axe").setRegistryName("ingottungstensteel1axe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("adtsdstechmod:ingottungstensteel1axe", "inventory"));
	}
	private static class ItemToolCustom extends ItemTool {
		private static final Set<Block> effective_items_set = com.google.common.collect.Sets
				.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN,
						Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
		protected ItemToolCustom() {
			super(EnumHelper.addToolMaterial("INGOTTUNGSTENSTEEL1AXE", 3, 5680, 12f, 2f, 70), effective_items_set);
			this.attackDamage = 2f;
			this.attackSpeed = -3f;
		}

		@Override
		public float getDestroySpeed(ItemStack stack, IBlockState state) {
			Material material = state.getMaterial();
			return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
					? super.getDestroySpeed(stack, state)
					: this.efficiency;
		}
	}
}
