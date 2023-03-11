package gamblev.jaxson.gvutils.connection.redis;

import codes.laivy.data.redis.RedisDatabase;
import org.jetbrains.annotations.NotNull;

public class RedisAdapterImpl implements RedisAdapter {

    private final @NotNull RedisDatabase database;

    public RedisAdapterImpl(@NotNull RedisDatabase database) {
        this.database = database;
    }

    @Override
    public @NotNull RedisDatabase getDatabase() {
        return database;
    }

}