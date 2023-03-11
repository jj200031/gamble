package gamblev.jaxson.gvutils.connection.redis;

import codes.laivy.data.redis.RedisDatabase;
import gamblev.jaxson.gvutils.connection.Adapter;
import org.jetbrains.annotations.NotNull;

public interface RedisAdapter extends Adapter {
    @Override
    @NotNull RedisDatabase getDatabase();
}
