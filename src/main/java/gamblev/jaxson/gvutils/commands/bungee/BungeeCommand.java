package gamblev.jaxson.gvutils.commands.bungee;

import gamblev.jaxson.gvutils.commands.Command;
import org.jetbrains.annotations.NotNull;

public abstract class BungeeCommand extends net.md_5.bungee.api.plugin.Command implements Command {
    public BungeeCommand(@NotNull String name) {
        super(name);
    }

    @Override
    public @NotNull String getName() {
        return super.getName();
    }
}

