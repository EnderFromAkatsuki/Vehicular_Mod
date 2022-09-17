package net.enderfromakatsuki.vehicular.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab VEHICULAR_TAB = new CreativeModeTab("vehiculartab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLASTIC_SHEET.get());
        }
    };

}
