package io.github.xingkongqwq.xklibapi;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 *
 */
public interface InventoryManager {
    /**
     * 创建一个gui
     *
     * @param p gui所属玩家
     * @param size gui大小
     * @param com 组件（作用不详）
     * @return gui对象
     */
    Inventory createInventory(Player p, int size, Component com);

    /**
     * 创建一个gui
     *
     * @param p gui所属玩家
     * @param size gui大小
     * @param t 标题
     * @return gui对象
     * @deprecated
     */
    @Deprecated
    Inventory createInventory(Player p, int size, String t);

    /**
     * 放置物品
     *
     * @param t 位置
     * @param is 物品对象
     * @return this
     */
    InventoryManager setItem(int t, ItemStack is);

    /**
     *
     * 获取gui对象
     *
     * @return gui对象
     */
    Inventory getInventory();
}
