package gamblev.jaxson.gvutils.commands.bukkit.impl;

import gamblev.jaxson.gvutils.commands.bukkit.BukkitCommand;
import gamblev.jaxson.gvutils.main.GambleVerseCoreBukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public class LobbyBukkitCommand extends BukkitCommand {

    public LobbyBukkitCommand() {
        super(GambleVerseCoreBukkit.coreBukkit().getCommand("lobby"));
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("lobby")){
            if(!(sender instanceof Player)){
                sender.sendMessage("§cOnly Players can Execute this command");
                return true;
            }
            Player player = (Player) sender;
            connect(player, "lobby");
            return true;
        }
        return false;
    }

    /**
     * Connects the player to the lobby.
     */
    public final void connect(@NotNull Player player, @NotNull String server) {
        try{
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            DataOutputStream out = new DataOutputStream(b);
            out.writeUTF("Connect");
            out.writeUTF(server); //set to name of bungee server
            player.sendPluginMessage(GambleVerseCoreBukkit.coreBukkit(),  "BungeeCord", b.toByteArray());

            b.close();
            out.close();
        } catch (Throwable e) {
            throw new RuntimeException("Connection issue", e);
        }
    }
}