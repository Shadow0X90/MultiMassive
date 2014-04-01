package com.ps2j.MultiMassive.jobs;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JobPickGui implements Listener{
public static Inventory jobSelect = Bukkit.createInventory(null, 9, ChatColor.BLUE + "Select Job");
public static void createDisplay(Material material, Inventory inv, int Slot, String name, String lore1, String lore2) {
ItemStack item = new ItemStack(material);
ItemMeta meta = item.getItemMeta();
meta.setDisplayName(name);
ArrayList<String> Lore = new ArrayList<String>();
Lore.add(lore1, lore2);
meta.setLore(Lore);
item.setItemMeta(meta);
 
inv.setItem(Slot, item);
 
}
//No more editing till class system is functional.
static {
JobPickGui.createDisplay(Material.ENDER_PEARL, jobSelect, 8, ChatColor.DARK_GRAY + "Dark Knight", ChatColor.DARK_GRAY + "A heavy offensive job that uses health to attack.", ChatColor.GOLD + "Wields Axes and Swords.");
JobPickGui.createDisplay(Material.IRON_SWORD, jobSelect, 0, ChatColor.YELLOW + "Warrior", ChatColor.YELLOW + "A heavy offensive job with a low defence.", ChatColor.GOLD + "Wields Axes and Swords.");
}
 
}
