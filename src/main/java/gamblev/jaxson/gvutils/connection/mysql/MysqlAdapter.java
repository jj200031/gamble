package gamblev.jaxson.gvutils.connection.mysql;

import codes.laivy.data.sql.mysql.MysqlDatabase;
import gamblev.jaxson.gvutils.connection.Adapter;
import org.jetbrains.annotations.NotNull;

public interface MysqlAdapter extends Adapter {
    @Override
    @NotNull MysqlDatabase getDatabase();
}
