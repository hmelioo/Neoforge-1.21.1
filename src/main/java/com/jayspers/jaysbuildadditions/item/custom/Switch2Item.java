package com.jayspers.jaysbuildadditions.item.custom;

import com.jayspers.jaysbuildadditions.procedures.Switch2ItemInHandTickProcedure;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

public class Switch2Item extends Item {
    public Switch2Item(Properties properties) {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected)
            Switch2ItemInHandTickProcedure.execute(entity);
    }
}

