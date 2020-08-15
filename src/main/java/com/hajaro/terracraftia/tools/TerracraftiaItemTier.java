package com.hajaro.terracraftia.tools;


import com.hajaro.terracraftia.Terracraftia;
import com.hajaro.terracraftia.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum TerracraftiaItemTier implements IItemTier {

    RUBY(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.RUBY_SWORD.get());
    }),

    COPPER(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER_SWORD.get());
    }),

    TIN(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.TIN_SWORD.get());
    }),

    LEAD(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.LEAD_SWORD.get());
    }),

    SILVER(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.SILVER_SWORD.get());
    }),

    TUNGSTEN(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.TUNGSTEN_SWORD.get());
    }),

    PLATINIUM(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.PLATINIUM_SWORD.get());
    }),

    METEORITE(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.METEORITE_SWORD.get());
    }),

    DEMONITE(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.DEMONITE_SWORD.get());
    }),

    CRIMTANE(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.CRIMTANE_SWORD.get());
    }),

    HELLSTONE(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.HELLSTONE_SWORD.get());
    }),

    COBALT(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.COBALT_SWORD.get());
    }),

    PALLADIUM(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.PALLADIUM_SWORD.get());
    }),

    MYTHRIL(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.MYTHRIL_SWORD.get());
    }),

    ORICHALCUM(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.ORICHALCUM_SWORD.get());
    }),

    ADAMANTITE(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.ADAMANTITE_SWORD.get());
    }),

    TITANIUM(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.TITANIUM_SWORD.get());
    }),

    CHLOROPHYTE(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.CHLOROPHYTE_SWORD.get());
    }),

    LUMINITE(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.LUMINITE_SWORD.get());
    });



    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    TerracraftiaItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability =enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
