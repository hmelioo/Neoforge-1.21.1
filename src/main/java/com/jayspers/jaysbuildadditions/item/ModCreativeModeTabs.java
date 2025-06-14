package com.jayspers.jaysbuildadditions.item;

import com.jayspers.jaysbuildadditions.JayspersBuildAdditions;
import com.jayspers.jaysbuildadditions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JayspersBuildAdditions.MOD_ID);

    public static final Supplier<CreativeModeTab> JAYSPERS_BLOCKS = CREATIVE_MODE_TAB.register("jayspers_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.JOYCONS.get()))
                    .title(Component.translatable("creativetab.jays_build_additions.jayspers_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.JOYCONS);
                        output.accept(ModItems.SWITCH_SYSTEM);
                        output.accept(ModItems.PLASTIC_WASTE);
                        output.accept(ModBlocks.JOYCON_BLOCK);
                        output.accept(ModItems.LAWSUIT);
                        output.accept(ModItems.SWITCH2);
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
