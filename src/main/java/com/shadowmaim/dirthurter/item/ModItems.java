package com.shadowmaim.dirthurter.item;

import com.shadowmaim.dirthurter.Dirthurter;
import com.shadowmaim.dirthurter.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Dirthurter.MODID);

    public static final DeferredItem<Item> DIRTHURTER = ITEMS.register("dirthurter",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
