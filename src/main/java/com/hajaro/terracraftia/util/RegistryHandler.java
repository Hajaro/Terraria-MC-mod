package com.hajaro.terracraftia.util;

import com.hajaro.terracraftia.Terracraftia;
import com.hajaro.terracraftia.blocks.BlockItemBase;
import com.hajaro.terracraftia.blocks.RubyBlock;
import com.hajaro.terracraftia.blocks.RubyOre;
import com.hajaro.terracraftia.items.ItemBase;
import com.hajaro.terracraftia.tools.TerracraftiaItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Terracraftia.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Terracraftia.MOD_ID);


    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> COPPER = ITEMS.register("copper", ItemBase::new);

    //Items
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", ()->
            new SwordItem(TerracraftiaItemTier.RUBY, 2, -2.4F, new Item.Properties().group(Terracraftia.TAB)));
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", ()->
            new SwordItem(TerracraftiaItemTier.COPPER, 2, -2.4F, new Item.Properties().group(Terracraftia.TAB)));
    public static final RegistryObject<SwordItem> TIN_SWORD = ITEMS.register("tin_sword", ()->
            new SwordItem(TerracraftiaItemTier.TIN, 2, -2.4F, new Item.Properties().group(Terracraftia.TAB)));
    public static final RegistryObject<SwordItem> LEAD_SWORD = ITEMS.register("copper_sword", ()->
            new SwordItem(TerracraftiaItemTier.LEAD, 2, -2.4F, new Item.Properties().group(Terracraftia.TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", ()->
            new PickaxeItem(TerracraftiaItemTier.RUBY,0, -2.8F,new Item.Properties().group(Terracraftia.TAB)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", ()->
            new ShovelItem(TerracraftiaItemTier.RUBY,0.5F, -3.0F,new Item.Properties().group(Terracraftia.TAB)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", ()->
            new AxeItem(TerracraftiaItemTier.RUBY,5, -3.1F,new Item.Properties().group(Terracraftia.TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", ()->
            new HoeItem(TerracraftiaItemTier.RUBY, -1.0F,new Item.Properties().group(Terracraftia.TAB)));

    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);


    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));


}
