package com.shadowmaim.dirthurter.item;

import com.shadowmaim.dirthurter.Dirthurter;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Dirthurter.MODID);

    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
