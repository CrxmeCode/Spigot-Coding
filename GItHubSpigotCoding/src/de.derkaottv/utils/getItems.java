package de.derkaottv.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class getItems {

    public static void getMainItems(Player p) {
        p.getInventory().clear();

        ItemStack stuff = new ItemStack( Material.BLAZE_ROD );
        ItemMeta stuffmeta = stuff.getItemMeta();
        stuffmeta.setDisplayName( "§7>> §eStuff" );
        stuff.setItemMeta( stuffmeta );

        p.getInventory().setItem( 4, stuff );
    }
}
