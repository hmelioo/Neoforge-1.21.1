package com.jayspers.jaysbuildadditions.item;

import com.jayspers.jaysbuildadditions.JayspersBuildAdditions;
import com.jayspers.jaysbuildadditions.item.custom.Switch2Item;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JayspersBuildAdditions.MOD_ID);

    public static final DeferredItem<Item> JOYCONS = ITEMS.register("joycons",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SWITCH_SYSTEM = ITEMS.register("switch_system",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLASTIC_WASTE = ITEMS.register("plastic_waste",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LAWSUIT = ITEMS.register("lawsuit",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SWITCH2 = ITEMS.register("switch2",
            () -> new Switch2Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
