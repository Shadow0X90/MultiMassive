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
public static void createDisplay(Material material, Inventory inv, int Slot, String name, String lore) {
ItemStack item = new ItemStack(material);
ItemMeta meta = item.getItemMeta();
meta.setDisplayName(name);
ArrayList<String> Lore = new ArrayList<String>();
Lore.add(lore);
meta.setLore(Lore);
item.setItemMeta(meta);
 
inv.setItem(Slot, item);
 
}
static {
JobPickGui.createDisplay(Material.GOLD_SWORD, jobSelect, 1, "Paladin", "Healer tank.");
}
 
}
