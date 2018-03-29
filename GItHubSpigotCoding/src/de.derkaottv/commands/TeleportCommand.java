package de.derkaottv.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if( sender.isOp() ) {
            if( args.length == 1 ) {
                Player target = Bukkit.getPlayer( args[0] );

                if( target != null ) {

                    ((Player)sender).teleport( target );
                    sender.sendMessage( "§fTeleport to §6" + target.getName() + "§f!" );
                } else {
                    sender.sendMessage( "§cThe player §e" + target.getName() + " §cisn't online or doesn't exist." );
                }
            } else {
                sender.sendMessage( "§cPlease use: /tp <player>" );
            }
        } else {
            sender.sendMessage( "§cYou're not allowed to do that!" );
        }
        return false;
    }
}
