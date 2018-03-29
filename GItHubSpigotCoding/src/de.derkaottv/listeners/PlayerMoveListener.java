package de.derkaottv.listeners;

import org.bukkit.Bukkit;
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

        Bukkit.getConsoleSender().sendMessage( "§e[INFO] The player " + name + " has moved." );
    }
}
