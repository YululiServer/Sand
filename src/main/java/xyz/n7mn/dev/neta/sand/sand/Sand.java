package xyz.n7mn.dev.neta.sand.sand;

import org.bukkit.plugin.java.JavaPlugin;

public final class Sand extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("sand").setExecutor(new SandCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
