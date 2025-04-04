package net.mcreator.adtsd.techmod.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.mcreator.adtsd.techmod.item.ItemHydrogenGenerator;
import net.mcreator.adtsd.techmod.item.ItemHotOilCell;
import net.mcreator.adtsd.techmod.item.ItemFuelCell;
import net.mcreator.adtsd.techmod.item.ItemEthyleneCell;
import net.mcreator.adtsd.techmod.item.ItemDustCarbon;
import net.mcreator.adtsd.techmod.item.ItemBenzeneCell;
import net.mcreator.adtsd.techmod.ElementsADtsdsTechMod;

import java.util.function.Supplier;
import java.util.Map;

@ElementsADtsdsTechMod.ModElement.Tag
public class ProcedureRefineryOil extends ElementsADtsdsTechMod.ModElement {
	public ProcedureRefineryOil(ElementsADtsdsTechMod instance) {
		super(instance, 440);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RefineryOil!");
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
		}.getItemStack((int) (6))).getItem())) {
			if ((new ItemStack(ItemHotOilCell.block, (int) (1)).getItem() == (new Object() {
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
			}.getItemStack((int) (5))).getItem())) {
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
					}.getAmount((int) (1))) < 60)) {
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
						}.getAmount((int) (2))) < 60)) {
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
								if (entity instanceof EntityPlayerMP) {
									Container _current = ((EntityPlayerMP) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (5))).decrStackSize((int) (1));
											_current.detectAndSendChanges();
										}
									}
								}
								if (entity instanceof EntityPlayerMP) {
									Container _current = ((EntityPlayerMP) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(ItemDustCarbon.block, (int) (1));
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
											}.getAmount((int) (1))) + 1));
											((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
								if (entity instanceof EntityPlayerMP) {
									Container _current = ((EntityPlayerMP) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(ItemEthyleneCell.block, (int) (1));
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
											}.getAmount((int) (2))) + 3));
											((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
								if (entity instanceof EntityPlayerMP) {
									Container _current = ((EntityPlayerMP) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(ItemFuelCell.block, (int) (1));
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
											}.getAmount((int) (3))) + 5));
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
											}.getAmount((int) (4))) + 1));
											((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
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
