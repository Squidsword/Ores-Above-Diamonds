package oresAboveDiamonds.init;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import oresAboveDiamonds.OresAboveDiamonds;
import oresAboveDiamonds.items.AmethystBlock;
import oresAboveDiamonds.items.AmethystOre;
import oresAboveDiamonds.items.BlackOpalBlock;
import oresAboveDiamonds.items.BlackOpalOre;

public final class ModBlocks {

	//Thanks to Cadiboo for the tutorial
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OresAboveDiamonds.MODID);

	public static final RegistryObject<AmethystOre> AMETHYST_ORE = BLOCKS.register("amethyst_ore", () -> new AmethystOre());
	public static final RegistryObject<BlackOpalOre> BLACK_OPAL_ORE = BLOCKS.register("black_opal_ore", () -> new BlackOpalOre());
	
	public static final RegistryObject<AmethystBlock> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", () -> new AmethystBlock());
	public static final RegistryObject<BlackOpalBlock> BLACK_OPAL_BLOCK = BLOCKS.register("black_opal_block", () -> new BlackOpalBlock());
	
	public static final RegistryObject<AmethystOre> NETHER_AMETHYST_ORE = BLOCKS.register("nether_amethyst_ore", () -> new AmethystOre());
	public static final RegistryObject<AmethystOre> END_AMETHYST_ORE = BLOCKS.register("end_amethyst_ore", () -> new AmethystOre());
	
	public static final RegistryObject<BlackOpalOre> NETHER_BLACK_OPAL_ORE = BLOCKS.register("nether_black_opal_ore", () -> new BlackOpalOre());
	public static final RegistryObject<BlackOpalOre> END_BLACK_OPAL_ORE = BLOCKS.register("end_black_opal_ore", () -> new BlackOpalOre());
}