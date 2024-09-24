package net.parucraft.parurp;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * <h1>ParuRP</h1>
 * The main class for the ParuRP plugin.
 * @author ParuPatch
 */
public final class ParuRP extends JavaPlugin {
    /**
     *<h1>onEnable</h1>
     * Actions that will be performed when the plugin is enabled
     */
    @Override
    public void onEnable() {
        System.out.println("===========================");
        System.out.println("ParuRP Successfully Enabled");
        System.out.println("===========================");
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
    }

    /**
     * <h1>onDisable</h1>
     * Actions that will be performed when the plugin is disabled
     */
    @Override
    public void onDisable() {
        System.out.println("============================");
        System.out.println("ParuRP Successfully Disabled");
        System.out.println("============================");
    }
}
