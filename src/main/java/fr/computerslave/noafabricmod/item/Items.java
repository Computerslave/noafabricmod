package fr.computerslave.noafabricmod.item;

import fr.computerslave.noafabricmod.NoaFabricMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Items {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().fireproof().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(NoaFabricMod.MOD_ID, name), item);
    }

    public static void registerItems(){
        System.out.println("Registering items for " + NoaFabricMod.MOD_ID);
    }
}
