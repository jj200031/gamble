package gamblev.jaxson.gvutils.commands;

import org.jetbrains.annotations.NotNull;

public interface Command {

    @NotNull String getName();

    @NotNull String[] getAliases();

}
