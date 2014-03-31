package com.ps2j.MultiMassive;


import org.bukkit.plugin.java.JavaPlugin;
import com.ps2j.MultiMassive.jobs.JobPickListener;

public class MultiMassiveMain extends JavaPlugin{

public void onEnable(){
	getServer().getPluginManager().registerEvents(new JobPickListener(), this);
}
	
}
