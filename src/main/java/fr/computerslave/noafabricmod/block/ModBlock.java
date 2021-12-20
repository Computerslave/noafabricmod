package fr.computerslave.noafabricmod.block;

import fr.computerslave.noafabricmod.NoaFabricMod;
import fr.computerslave.noafabricmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock {

    public static final net.minecraft.block.Block RUBY_ORE = registerBlock("ruby_ore", new net.minecraft.block.Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));

    private static net.minecraft.block.Block registerBlock(String name, net.minecraft.block.Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(NoaFabricMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, net.minecraft.block.Block block){
        return Registry.register(Registry.ITEM, new Identifier(NoaFabricMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(ModItemGroup.NOAFABRICMOD)));
    }

    public static void registerBlocks(){
        System.out.println("Registering blocks for " + NoaFabricMod.MOD_ID);
    }
}
