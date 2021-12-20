package fr.computerslave.noafabricmod.block;

import fr.computerslave.noafabricmod.NoaFabricMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(NoaFabricMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(NoaFabricMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

    public static void registerBlocks(){
        System.out.println("Registering blocks for " + NoaFabricMod.MOD_ID);
    }
}
