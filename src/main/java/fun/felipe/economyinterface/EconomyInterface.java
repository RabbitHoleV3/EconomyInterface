package fun.felipe.economyinterface;

import org.bukkit.plugin.java.JavaPlugin;

public class EconomyInterface extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("Economy Interface Enabled");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Economy Interface Disabled");
    }
}
