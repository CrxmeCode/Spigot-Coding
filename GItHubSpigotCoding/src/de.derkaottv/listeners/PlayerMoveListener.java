package de.derkaottv.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMoveListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        String name = p.getName();

        // Lol just for fun

        p.getServer().getLogger().info( "§e[INFO] The player " + name + " has moved." );
    }
}
