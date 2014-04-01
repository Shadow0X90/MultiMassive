package com.ps2j.MultiMassive;


import org.bukkit.plugin.java.JavaPlugin;
import com.ps2j.MultiMassive.jobs.JobPickListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class MultiMassiveMain extends JavaPlugin{

File configFile;
FileConfiguration config;


public void onEnable(){
	configFile = new File(getDataFolder(), "config.yml");
	getServer().getPluginManager().registerEvents(new JobPickListener(), this);
try {
	firstRun();
} catch (Exception e) {
	e.printStackTrace();
}
	config = new YamlConfiguration();
	loadYamls();
}
private void firstRun() throws Exception {
	if(!configFile.exists()) {
		configFile.getParentFile().mkdirs();
		copy(getResource("config.yml"), configFile);
	}
}
private void copy(InputStream in, File file) {
	try {
		OutputStream out = new FileOutputStream(file);
		byte[] buf = new byte[1024];
		int len;
		while((len=in.read(buf))>0 {
			out.write(buf,0,len);
		}
		out.close();
		in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
}
public void saveYamls() {
	try {
		config.save(configFile);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
public void loadYamls() {
	try {
		config.load(configFile);
	} catch (Exception e) {
		e.printStackTrace()
	}
}
}
}
	
}
