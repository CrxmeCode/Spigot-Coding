package de.derkaottv.listeners;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String name = p.getName();

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
