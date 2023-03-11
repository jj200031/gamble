package gamblev.jaxson.gvutils.commands.bukkit;

import gamblev.jaxson.gvutils.commands.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;
import org.jetbrains.annotations.NotNull;

public abstract class BukkitCommand implements Command, CommandExecutor {

    private final @NotNull PluginCommand command;

    public BukkitCommand(@NotNull PluginCommand command) {
        this.command = command;

        command.setExecutor(this);
    }

    public @NotNull PluginCommand getCommand() {
        return command;
    }

    @Override
    public @NotNull String getName() {
        return command.getName();
    }

    @Override
    public @NotNull String[] getAliases() {
        return command.getAliases().toArray(new String[0]);
    }
}
