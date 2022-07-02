package io.github.xingkongqwq.xklib.impl;

import io.github.xingkongqwq.xklibapi.InventoryManager;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * @author xingkongqwq
 */
public class InventoryManagerImpl implements InventoryManager {
    private Inventory inv = null;

    @Override
    public Inventory createInventory(Player p, int size, Component com) {
        if(inv != null){
            return inv;
        }
        inv = Bukkit.createInventory(p, size, com);
        return inv;
    }

    @Override
    public Inventory createInventory(Player p, int size, String t) {
        inv = Bukkit.createInventory(p,size,t);
        return inv;
    }

    @Override
    public InventoryManager setItem(int t, ItemStack is) {
        setItem(t,is);
        return this;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
