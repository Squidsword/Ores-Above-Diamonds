package oresAboveDiamonds.OresMod.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import oresAboveDiamonds.OresMod.config.ConfigValues;

public enum ToolMaterialList implements IItemTier 
{
	amethyst(ConfigValues.amethyst_attack_damage.get(), ConfigValues.amethyst_efficiency.get(), ConfigValues.amethyst_durability.get(), 4, ConfigValues.amethyst_enchantability.get(), ItemList.amethyst),
	black_opal(ConfigValues.black_opal_attack_damage.get(), ConfigValues.black_opal_efficiency.get(), ConfigValues.black_opal_durability.get(), 5, ConfigValues.black_opal_enchantability.get(), ItemList.black_opal);
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private ToolMaterialList(int attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) 
	{
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public int getMaxUses() 
	{
		return this.durability;
	}

	@Override
	public float getEfficiency() 
	{
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() 
	{
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() 
	{
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairMaterial);
	}
}
