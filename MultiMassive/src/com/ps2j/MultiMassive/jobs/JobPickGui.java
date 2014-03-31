package com.ps2j.MultiMassive.jobs;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class JobPickGui{
public static Inventory jobSelect = Bukkit.createInventory(null, 1, Color.BLUE + "Select Job");
static {
jobSelect.setItem(0, new ItemStack(Material.GOLD_SWORD, 1));
}
public void onInventoryClick(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked();
	ItemStack clicked = event.getCurrentItem();
	Inventory inventory = event.getInventory();
	if (inventory.getName().equals(jobSelect.getName())) {
		if (clicked.getType() == Material.GOLD_SWORD) {
			event.setCancelled(true);
            player.sendMessage("Test");
		}
	}
}
}
