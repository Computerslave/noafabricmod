package fr.computerslave.noafabricmod.item;

import fr.computerslave.noafabricmod.NoaFabricMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup NOAFABRICMOD = FabricItemGroupBuilder.build(new Identifier(NoaFabricMod.MOD_ID, "ruby"), () -> new ItemStack(ModItem.RUBY));

}
