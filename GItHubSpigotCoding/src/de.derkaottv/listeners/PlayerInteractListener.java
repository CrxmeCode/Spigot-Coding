package de.derkaottv.listeners;

import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class PlayerInteractListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();

        if( p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase( "§7>> §eStuff" ) ) {

            Vector v = p.getLocation().getDirection().multiply(3D).setY(1D);
            p.setVelocity(v);
            p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 3);
            p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 3, 2);
        }
    }
}
