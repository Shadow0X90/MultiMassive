package com.ps2j.MultiMassive.jobs;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;



import com.ps2j.MultiMassive.MultiMassiveMain;
import com.ps2j.MultiMassive.jobs.JobPickGui;

public class JobPickListener implements Listener{
    public JobPickListener(MultiMassiveMain plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	@EventHandler
	public void onJobItemRun(PlayerInteractEvent event) {
		final Player player = event.getPlayer();
		if(player.getItemInHand().getType() == Material.DIRT) {
	    player.sendMessage(ChatColor.RED + "[MultiMassive] " + ChatColor.WHITE + "Please select a Job");
	    player.openInventory(JobPickGui.jobSelect);
		}
		}
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		ItemStack clicked = event.getCurrentItem();
		Inventory inventory = event.getInventory();
		if (inventory.getName().equals(JobPickGui.jobSelect.getName())) {
			if (clicked.getType() == Material.GOLD_SWORD) {
				player.closeInventory();
	            player.sendMessage("Test");
			}
		}
	}
}
