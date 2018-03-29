package de.derkaottv.listeners;

import de.derkaottv.utils.Scoreboard;
import de.derkaottv.utils.getItems;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerJoinListener implements Listener {

    private de.derkaottv.main plugin;

    public PlayerJoinListener(de.derkaottv.main main) {
        this.plugin = main;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String name = p.getName();

        getItems.getMainItems( p );

        new BukkitRunnable() {
            @Override
            public void run() {
                for( Player all : Bukkit.getOnlinePlayers() ) {
                    Scoreboard.setScoreboard( all );
                }
            }
        }.runTaskLater( plugin, 1 );

        if( p.isOp() ) {

            e.setJoinMessage( "§c" + name + " §ehas joined the Server." );

            p.setGameMode( GameMode.CREATIVE );
            p.setAllowFlight( true );
            p.setFlying( true );
        } else {
            e.setJoinMessage( "§a" + name + " §ehas joined the Server." );
        }
    }
}
