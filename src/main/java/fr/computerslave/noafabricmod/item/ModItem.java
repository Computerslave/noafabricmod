package fr.computerslave.noafabricmod.item;

import fr.computerslave.noafabricmod.NoaFabricMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItem {

    public static final net.minecraft.item.Item RUBY = registerItem("ruby", new net.minecraft.item.Item(new FabricItemSettings().fireproof().group(ModItemGroup.NOAFABRICMOD)));

    private static net.minecraft.item.Item registerItem(String name, net.minecraft.item.Item item){
        return Registry.register(Registry.ITEM, new Identifier(NoaFabricMod.MOD_ID, name), item);
    }

    public static void registerItems(){
        System.out.println("Registering items for " + NoaFabricMod.MOD_ID);
    }
}
