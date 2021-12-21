package fr.computerslave.noafabricmod.block;

import fr.computerslave.noafabricmod.NoaFabricMod;
import fr.computerslave.noafabricmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlock {

    public static final Block RUBY_ORE = registerBlock("ruby_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(5, 10)), null);
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), new FabricItemSettings().fireproof());

    private ModBlock(){}

    private static Block registerBlock(String name, Block block, FabricItemSettings settings){
        registerBlockItem(name, block, (settings == null ? new FabricItemSettings() : settings).group(ModItemGroup.NOAFABRICMOD).maxCount(64));
        return Registry.register(Registry.BLOCK, new Identifier(NoaFabricMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, FabricItemSettings settings){
        Registry.register(Registry.ITEM, new Identifier(NoaFabricMod.MOD_ID, name), new BlockItem(block, settings));
    }

    public static void registerBlocks(){
        System.out.println("Registering blocks for " + NoaFabricMod.MOD_ID);
    }
}
