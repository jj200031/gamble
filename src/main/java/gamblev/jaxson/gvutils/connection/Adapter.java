package gamblev.jaxson.gvutils.connection;

import codes.laivy.data.api.database.Database;
import org.jetbrains.annotations.NotNull;

public interface Adapter {

    @NotNull Database getDatabase();

}
