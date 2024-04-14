package com.gw.mod.demo.registry;

import com.gw.mod.demo.GWDemoMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CITRINE = FabricItemGroup.builder(new Identifier(GWDemoMod.MOD_ID, "citrine"))
            .displayName(Text.translatable("itemgroup.gwdemo-mod.citrine"))
            .icon(() -> new ItemStack(ModItems.CITRINE))
            .build();

    public static void registerModItemGroup() {
        GWDemoMod.LOGGER.debug("Registering mod item group for " + GWDemoMod.MOD_ID);
    }
}
