package gamblev.jaxson.gvutils.connection.mysql;

import codes.laivy.data.sql.mysql.MysqlDatabase;
import org.jetbrains.annotations.NotNull;

public class MysqlAdapterImpl implements MysqlAdapter {

    private final @NotNull MysqlDatabase database;

    public MysqlAdapterImpl(@NotNull MysqlDatabase database) {
        this.database = database;
    }

    @Override
    public @NotNull MysqlDatabase getDatabase() {
        return database;
    }
}
