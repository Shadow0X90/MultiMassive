package com.ps2j.MultiMassive.jobs;

import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JobPickListener implements Listener{
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent event) {
	  if(event.getPlayer().hasPlayedBefore()) {	 
		Player player = event.getPlayer();
	    player.sendMessage(Color.RED + "[MultiMassive] " + Color.WHITE + "Please select a Job");
	    player.openInventory(JobPickGui.jobSelect);
	  }
	}
}
