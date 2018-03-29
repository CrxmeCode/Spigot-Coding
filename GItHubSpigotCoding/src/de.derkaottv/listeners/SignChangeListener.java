package de.derkaottv.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class SignChangeListener implements Listener {

    @EventHandler
    public void onSignChange(SignChangeEvent e) {
        Player p = e.getPlayer();

        if( e.getLine( 0 ).equalsIgnoreCase( "hello world" ) ) {
            e.setLine( 0, "§bHello World." );
        }
        if( e.getLine( 1 ).equalsIgnoreCase( "players" ) ) {
            e.setLine( 1, "§0" + p.getServer().getOnlinePlayers().size() + "/" + p.getServer().getMaxPlayers() );
        } else {
            p.sendMessage( "§cIn line 2 players must stand!" );
        }
    }
}
