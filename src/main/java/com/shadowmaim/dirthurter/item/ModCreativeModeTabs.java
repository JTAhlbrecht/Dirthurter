package com.shadowmaim.dirthurter.item;

import com.shadowmaim.dirthurter.Dirthurter;
import com.shadowmaim.dirthurter.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Dirthurter.MODID);

    public static final Supplier<CreativeModeTab> DIRTHURTER_ITEMS_TAB = CREATIVE_MODE_TAB.register("dirthurter_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIRTHURTER.get()))
            .title(Component.translatable("creativetab.dirthurter.dirthurter_items"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.DIRTHURTER);
                output.accept(ModItems.CHISEL);
            }).build());

    public static final Supplier<CreativeModeTab> DIRTHURTER_BLOCKS_TAB = CREATIVE_MODE_TAB.register("dirthurter_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DIRTHURTER))
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Dirthurter.MODID, "dirthurter_items_tab"))
            .title(Component.translatable("creativetab.dirthurter.dirthurter_blocks"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModBlocks.DIRTHURTER);
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
