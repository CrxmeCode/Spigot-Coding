package de.derkaottv;

import de.derkaottv.commands.VanishCommand;
import de.derkaottv.listeners.PlayerJoinListener;
import de.derkaottv.listeners.PlayerMoveListener;
import de.derkaottv.listeners.PlayerQuitListener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    private final String enabled = "The Plugin " + getName() + " was enabled.";
    private final String disabled = "The Plugin " + getName() + " was disabled.";

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents( new PlayerJoinListener(), this );
        getServer().getPluginManager().registerEvents( new PlayerQuitListener(), this );
        getServer().getPluginManager().registerEvents( new PlayerMoveListener(), this );

        getCommand( "vanish" ).setExecutor( new VanishCommand() );

        getLogger().info( enabled );
    }

    @Override
    public void onDisable() {

        getLogger().info( disabled );
    }
}
