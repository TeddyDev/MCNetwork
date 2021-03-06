package me.lukebingham.build;

import me.lukebingham.build.command.*;
import me.lukebingham.build.util.WorldUtil;
import me.lukebingham.database.Database;
import me.lukebingham.database.DatabaseModule;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

/**
 * Created by LukeBingham on 05/04/2017.
 */
public class Build extends JavaPlugin {

    private Database database;
    private BuildManager buildManager;

    @Override
    public void onEnable() {
        super.onEnable();

        database = new DatabaseModule("localhost", 27017);
        buildManager = new BuildManager(this);
        StartCommand startCommand = new StartCommand(this);
        FinishCommand finishCommand = new FinishCommand(this, buildManager);
        SpawnCommand spawnCommand = new SpawnCommand();
        CompressCommand compressCommand = new CompressCommand(this, database);
        MapsCommand mapsCommand = new MapsCommand(this);

        getCommand("start").setExecutor(startCommand);
        getCommand("finish").setExecutor(finishCommand);
        getCommand("spawn").setExecutor(spawnCommand);
        getCommand("compress").setExecutor(compressCommand);
        getCommand("maps").setExecutor(mapsCommand);
    }

    @Override
    public void onDisable() {
        super.onDisable();

        database.close();

        File container = getServer().getWorldContainer();
        for(File file : container.listFiles()) {
            if(!file.isDirectory()) continue;
            if(!WorldUtil.isWorldFile(file)) continue;
            buildManager.unloadAndDelete(Bukkit.getWorld(file.getName()), false, (b) -> {});
        }
    }
}
