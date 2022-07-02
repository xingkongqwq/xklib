package io.github.xingkongqwq.xklib;

import io.github.xingkongqwq.xklib.impl.InventoryManagerImpl;
import io.github.xingkongqwq.xklibapi.InventoryManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

public class XKLibPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getServicesManager().register(InventoryManager.class, new InventoryManagerImpl(), this, ServicePriority.Normal);
        getLogger().info("XKLib插件已加载");
        getLogger().info("单独使用此插件将不会有任何效果！");
    }

}
