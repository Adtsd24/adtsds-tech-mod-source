package net.mcreator.adtsd.techmod.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.mcreator.adtsd.techmod.item.ItemKeroseneCell;
import net.mcreator.adtsd.techmod.item.ItemHydrogenGenerator;
import net.mcreator.adtsd.techmod.item.ItemFuelCell;
import net.mcreator.adtsd.techmod.item.ItemDieselCell;
import net.mcreator.adtsd.techmod.item.ItemBenzeneCell;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

import java.util.function.Supplier;
import java.util.Map;

@ElementsADtsdsTechMod.ModElement.Tag
public class ProcedureFractioningRecipes extends ElementsADtsdsTechMod.ModElement {
	public ProcedureFractioningRecipes(ElementsADtsdsTechMod instance) {
		super(instance, 442);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FractioningRecipes!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((new ItemStack(ItemHydrogenGenerator.block, (int) (1)).getItem() == (new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (2))).getItem())) {
			if (((new ItemStack(ItemFuelCell.block, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem()) && ((new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (0))) >= 6))) {
				if (((new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof EntityPlayerMP) {
							Container _current = ((EntityPlayerMP) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (3))) < 60)) {
					if (((new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof EntityPlayerMP) {
								Container _current = ((EntityPlayerMP) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (4))) < 60)) {
						if (((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof EntityPlayerMP) {
									Container _current = ((EntityPlayerMP) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (5))) < 60)) {
							if (((new Object() {
								public int getAmount(int sltid) {
									if (entity instanceof EntityPlayerMP) {
										Container _current = ((EntityPlayerMP) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
												if (stack != null)
													return stack.getCount();
											}
										}
									}
									return 0;
								}
							}.getAmount((int) (6))) < 60)) {
								if (entity instanceof EntityPlayerMP) {
									Container _current = ((EntityPlayerMP) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (6));
											_current.detectAndSendChanges();
										}
									}
								}
								if (entity instanceof EntityPlayerMP) {
									Container _current = ((EntityPlayerMP) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(ItemBenzeneCell.block, (int) (1));
											_setstack.setCount(((new Object() {
												public int getAmount(int sltid) {
													if (entity instanceof EntityPlayerMP) {
														Container _current = ((EntityPlayerMP) entity).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
																if (stack != null)
																	return stack.getCount();
															}
														}
													}
													return 0;
												}
											}.getAmount((int) (3))) + 1));
											((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
								if (entity instanceof EntityPlayerMP) {
									Container _current = ((EntityPlayerMP) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(ItemKeroseneCell.block, (int) (1));
											_setstack.setCount(((new Object() {
												public int getAmount(int sltid) {
													if (entity instanceof EntityPlayerMP) {
														Container _current = ((EntityPlayerMP) entity).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
																if (stack != null)
																	return stack.getCount();
															}
														}
													}
													return 0;
												}
											}.getAmount((int) (4))) + 2));
											((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
								if (entity instanceof EntityPlayerMP) {
									Container _current = ((EntityPlayerMP) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(ItemDieselCell.block, (int) (1));
											_setstack.setCount(((new Object() {
												public int getAmount(int sltid) {
													if (entity instanceof EntityPlayerMP) {
														Container _current = ((EntityPlayerMP) entity).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
																if (stack != null)
																	return stack.getCount();
															}
														}
													}
													return 0;
												}
											}.getAmount((int) (5))) + 3));
											((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
