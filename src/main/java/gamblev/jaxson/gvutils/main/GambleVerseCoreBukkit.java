package gamblev.jaxson.gvutils.main;

import gamblev.jaxson.gvutils.commands.bukkit.impl.LobbyBukkitCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class GambleVerseCoreBukkit extends JavaPlugin {

    public static @NotNull GambleVerseCoreBukkit coreBukkit() {
        return getPlugin(GambleVerseCoreBukkit.class);
    }

    @Override
    public void onEnable() {
        //change to whatever you want
        getLogger().info("Sup Bro");

        new LobbyBukkitCommand();
    }

    @Override
    public void onDisable() {
        //change to whatever you want
        getLogger().info("By Bro");
    }


}
