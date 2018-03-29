package de.derkaottv.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class VanishCommand implements CommandExecutor {

    public ArrayList<String> command_arraylist = new ArrayList<String>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if( sender.isOp() ) {
            if( sender instanceof Player ) {

                if( command_arraylist.contains( sender.getName() ) ) {
                    for( Player all : Bukkit.getOnlinePlayers() ) {
                        all.showPlayer( (Player) sender );
                    }

                    sender.sendMessage( "§cYou're not longer in the vanish now." );
                    command_arraylist.remove( sender.getName() );
                } else {

                    for( Player all : Bukkit.getOnlinePlayers() ) {
                        all.hidePlayer( (Player) sender );
                    }

                    sender.sendMessage( "§aYou're in the vanish now." );
                    command_arraylist.add( sender.getName() );
                }
            } else {
                sender.sendMessage( "§cYou're must be a player!" );
            }
            } else {
                sender.sendMessage( "§cYou're not allowed to do that!" );
            }
        return false;
    }
}
