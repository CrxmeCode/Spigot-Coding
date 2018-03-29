package de.derkaottv.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameModeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if( args.length == 1 ) {
            if( args[0].equalsIgnoreCase( "0" ) || args[0].equalsIgnoreCase( "survival" ) ) {
                if( ! ((Player) sender).getGameMode().equals( GameMode.SURVIVAL ) ) {
                    ((Player) sender).setGameMode( GameMode.SURVIVAL );
                    sender.sendMessage( "§fYou're now in the §6" + ((Player) sender).getGameMode() + " §fmode." );
                } else {
                    sender.sendMessage( "§cYou're already in the " + ((Player) sender).getGameMode() + " mode!" );
                }
            }
            if( args[0].equalsIgnoreCase( "1" ) || args[0].equalsIgnoreCase( "creative" ) ) {
                if( ! ((Player) sender).getGameMode().equals( GameMode.CREATIVE ) ) {
                    ((Player) sender).setGameMode( GameMode.CREATIVE );
                    sender.sendMessage( "§fYou're now in the §6" + ((Player) sender).getGameMode() + " §fmode." );
                } else {
                    sender.sendMessage( "§cYou're already in the " + ((Player) sender).getGameMode() + " mode!" );
                }
            }
            if( args[0].equalsIgnoreCase( "2" ) || args[0].equalsIgnoreCase( "adventure" ) ) {
                if( ! ((Player) sender).getGameMode().equals( GameMode.ADVENTURE ) ) {
                    ((Player) sender).setGameMode( GameMode.ADVENTURE );
                    sender.sendMessage( "§fYou're now in the §6" + ((Player) sender).getGameMode() + " §fmode." );
                } else {
                    sender.sendMessage( "§cYou're already in the " + ((Player) sender).getGameMode() + " mode!" );
                }
            }
            if( args[0].equalsIgnoreCase( "3" ) || args[0].equalsIgnoreCase( "spectator" ) ) {
                if( ! ((Player) sender).getGameMode().equals( GameMode.SPECTATOR ) ) {
                    ((Player) sender).setGameMode( GameMode.SPECTATOR );
                    sender.sendMessage( "§fYou're now in the §6" + ((Player) sender).getGameMode() + " §fmode." );
                } else {
                    sender.sendMessage( "§cYou're already in the " + ((Player) sender).getGameMode() + " mode!" );
                }
            }
        } else if( args.length == 3 ) {
            Player target = Bukkit.getPlayer( args[1] );

            if( target != null ) {
                if( args[0].equalsIgnoreCase( "0" ) || args[0].equalsIgnoreCase( "survival" ) ) {
                    if( ! target.getGameMode().equals( GameMode.SURVIVAL ) ) {
                        target.setGameMode( GameMode.SURVIVAL );
                        target.sendMessage( "§fYour Gamemode was updated!" );
                        sender.sendMessage( "§fThe player §6" + target.getName() + " §fis now in the §6" + target.getName() + " §fmode." );
                    } else {
                        sender.sendMessage( "§cThe player §e" + target.getName() + " §cis already in the" + target.getGameMode() + " §cmode!" );
                    }
                }
                if( args[0].equalsIgnoreCase( "1" ) || args[0].equalsIgnoreCase( "creative" ) ) {
                    if( ! target.getGameMode().equals( GameMode.CREATIVE ) ) {
                        target.setGameMode( GameMode.CREATIVE );
                        target.sendMessage( "§fYour Gamemode was updated!" );
                        sender.sendMessage( "§fThe player §6" + target.getName() + " §fis now in the §6" + target.getName() + " §fmode." );
                    } else {
                        sender.sendMessage( "§cThe player §e" + target.getName() + " §cis already in the" + target.getGameMode() + " §cmode!" );
                    }
                }
                if( args[0].equalsIgnoreCase( "2" ) || args[0].equalsIgnoreCase( "adventure" ) ) {
                    if( ! target.getGameMode().equals( GameMode.ADVENTURE ) ) {
                        target.setGameMode( GameMode.ADVENTURE );
                        target.sendMessage( "§fYour Gamemode was updated!" );
                        sender.sendMessage( "§fThe player §6" + target.getName() + " §fis now in the §6" + target.getName() + " §fmode." );
                    } else {
                        sender.sendMessage( "§cThe player §e" + target.getName() + " §cis already in the" + target.getGameMode() + " §cmode!" );
                    }
                }
                if( args[0].equalsIgnoreCase( "3" ) || args[0].equalsIgnoreCase( "spectator" ) ) {
                    if( ! target.getGameMode().equals( GameMode.SPECTATOR ) ) {
                        target.setGameMode( GameMode.SPECTATOR );
                        target.sendMessage( "§fYour Gamemode was updated!" );
                        sender.sendMessage( "§fThe player §6" + target.getName() + " §fis now in the §6" + target.getName() + " §fmode." );
                    } else {
                        sender.sendMessage( "§cThe player §e" + target.getName() + " §cis already in the" + target.getGameMode() + " §cmode!" );
                    }
                }
            } else {
                sender.sendMessage( "§cThe player §e" + target.getName() + " §cisn't online or doesn't exist!" );
            }
        } else {
            sender.sendMessage( "§c/gm <gamemode> or /gm <gamemode> <player>" );
        }
        return false;
    }
}
