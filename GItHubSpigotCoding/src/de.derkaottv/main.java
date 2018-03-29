package de.derkaottv;

import de.derkaottv.commands.GameModeCommand;
import de.derkaottv.commands.VanishCommand;
import de.derkaottv.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    private final String enabled = "The Plugin " + getName() + " was enabled.";
    private final String disabled = "The Plugin " + getName() + " was disabled.";

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents( new PlayerJoinListener( this ), this );
        getServer().getPluginManager().registerEvents( new PlayerQuitListener( this ), this );
        getServer().getPluginManager().registerEvents( new PlayerMoveListener(), this );
        getServer().getPluginManager().registerEvents( new SignChangeListener(), this );
        getServer().getPluginManager().registerEvents( new PlayerInteractListener(), this );

        getCommand( "vanish" ).setExecutor( new VanishCommand() );
        getCommand( "gamemode" ).setExecutor( new GameModeCommand() );

        Bukkit.getConsoleSender().sendMessage( enabled );
    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage( disabled );
    }
}
