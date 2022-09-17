package net.enderfromakatsuki.vehicular.item;

import net.enderfromakatsuki.vehicular.Vehicular;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Vehicular.MOD_ID);

    public static final RegistryObject<Item> PLASTIC_SHEET = ITEMS.register("plastic_sheet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VEHICULAR_TAB)));

    public static final RegistryObject<Item> PLASTIC_CLUMP = ITEMS.register("plastic_clump",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VEHICULAR_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
