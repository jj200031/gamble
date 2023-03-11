package gamblev.jaxson.gvutils.main;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

/**
 * Thats the Bungee plugin instance.
 *
 * @author Laivy
 * @version 1.0
 */
public class GambleVerseCoreBungee extends Plugin {

    public static @NotNull GambleVerseCoreBungee coreBungee() {
        return (GambleVerseCoreBungee) ProxyServer.getInstance().getPluginManager().getPlugin("GambleVerseCoreBungee");
    }

}
