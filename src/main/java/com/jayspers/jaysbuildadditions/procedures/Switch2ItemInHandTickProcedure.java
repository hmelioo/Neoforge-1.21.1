package com.jayspers.jaysbuildadditions.procedures;

import com.jayspers.jaysbuildadditions.item.ModItems;
import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;


public class Switch2ItemInHandTickProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof Player _player) {
            ItemStack _setstack = new ItemStack(ModItems.LAWSUIT.get()).copy();
            _setstack.setCount(1);
            ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
        }
    }
}

