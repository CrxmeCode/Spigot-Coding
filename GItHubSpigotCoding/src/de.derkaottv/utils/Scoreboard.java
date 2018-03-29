package de.derkaottv.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.ScoreboardManager;

public class Scoreboard {

    public static void setScoreboard(Player p) {

        ScoreboardManager sm = Bukkit.getScoreboardManager();
        final org.bukkit.scoreboard.Scoreboard board = sm.getNewScoreboard();
        final Objective obj = board.registerNewObjective("test", "dummy");

        obj.setDisplaySlot( DisplaySlot.SIDEBAR);
        obj.setDisplayName("§4§l" + p.getName());
        obj.getScore("§c").setScore(2);
        obj.getScore("§fTwitter").setScore(1);
        obj.getScore("§b@TechnikNetzwerk").setScore(0);

        p.setScoreboard(board);
    }
}
