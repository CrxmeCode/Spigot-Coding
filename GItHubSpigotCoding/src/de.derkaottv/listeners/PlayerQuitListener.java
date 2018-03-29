package de.derkaottv.listeners;

import de.derkaottv.utils.Scoreboard;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerQuitListener implements Listener {

    private de.derkaottv.main plugin;

    public PlayerQuitListener(de.derkaottv.main main) {
        this.plugin = main;
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        String name = p.getName();

        new BukkitRunnable() {
            @Override
            public void run() {

                for (Player all : Bukkit.getOnlinePlayers()) {
                    Scoreboard.setScoreboard(all);
                }

            }
        }.runTaskLater(plugin, 1);

        if( p.isOp() ) {

            e.setQuitMessage( "§c" + name + "§ehas leaved the Server." );
        } else {
            e.setQuitMessage( "§a" + name + "§ehas leaved the Server." );
        }
    }
}
