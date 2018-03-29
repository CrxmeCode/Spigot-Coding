package de.derkaottv.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        String name = p.getName();

        if( p.isOp() ) {

            e.setQuitMessage( "§c" + name + "§ehas leaved the Server." );
        } else {
            e.setQuitMessage( "§a" + name + "§ehas leaved the Server." );
        }
    }
}
