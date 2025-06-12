package com.jayspers.jaysbuildadditions.item.custom;

import com.jayspers.jaysbuildadditions.item.ModItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.items.ItemHandlerHelper;

public class Switch2Item extends Item {
    public Switch2Item(Properties properties) {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        Player _player = (Player) entity;
        ItemStack _setstack = new ItemStack(ModItems.LAWSUIT.get()).copy();
        _setstack.setCount(1);
        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
    }
}

