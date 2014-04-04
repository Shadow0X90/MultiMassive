package com.ps2j.MultiMassive;


import org.bukkit.plugin.java.JavaPlugin;
import com.ps2j.MultiMassive.jobs.JobPickListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.Statement;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MultiMassiveMain extends JavaPlugin{
public static Properties prop = new Properties();
File configFile;
FileConfiguration config;
public void onEnable(){
	configFile = new File(getDataFolder(), "config.yml");
	getServer().getPluginManager().registerEvents(new JobPickListener(), this);
	loadprop();
try {
	firstRun();
} catch (Exception e) {
	e.printStackTrace();
}
	config = new YamlConfiguration();
	loadYamls();
}
public void loadprop(){
	try{
		prop.load(new FileInputStream("PlayerInfo.properties"));
	}catch(FileNotFroundException e){
		System.out.println("PlayerInfo does not exist!");
	}catch(Exception e1) {
		e1.printStackTrace();
	}
	}
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
