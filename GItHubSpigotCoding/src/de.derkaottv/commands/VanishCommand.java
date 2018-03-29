package de.derkaottv.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class VanishCommand implements CommandExecutor {

    public ArrayList<String> command_arraylist = new ArrayList<String>();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        if( p.isOp() ) {

            if( command_arraylist.contains( p.getName() ) ) {
                for( Player all : Bukkit.getOnlinePlayers() ) {
                    all.showPlayer( p );
                }

                p.sendMessage( "§aYou're not longer in the vanish now." );
                command_arraylist.remove( p.getName() );
            } else {

                for( Player all : Bukkit.getOnlinePlayers() ) {
                    all.hidePlayer( p );
                }

                p.sendMessage( "§aYou're in the vanish now." );
                command_arraylist.add( p.getName() );
            }
        } else {
            p.sendMessage( "§cYou're not allowed to do that!" );
        }
        return false;
    }
}
