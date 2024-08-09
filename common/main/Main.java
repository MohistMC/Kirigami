package org.mohistmc.Kirigami;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Kirigami plugin has been enabled!");
        initForge();
    }

    private void initForge() {
        getLogger().info("Initializing Forge Mod support...");
    }

    @Override
    public void onDisable() {
        getLogger().info("Kirigami plugin has been disabled!");
    }
}
