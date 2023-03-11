package gamblev.jaxson.gvutils.connection;

import gamblev.jaxson.gvutils.connection.mysql.MysqlAdapter;
import gamblev.jaxson.gvutils.connection.redis.RedisAdapter;
import org.jetbrains.annotations.NotNull;

public class ConnectionImpl implements Connection {

    private final @NotNull MysqlAdapter mysqlAdapter;
    private final @NotNull RedisAdapter redisAdapter;

    public ConnectionImpl(@NotNull MysqlAdapter mysqlAdapter, @NotNull RedisAdapter redisAdapter) {
        this.mysqlAdapter = mysqlAdapter;
        this.redisAdapter = redisAdapter;
    }

    @Override
    public @NotNull MysqlAdapter getMysql() {
        return mysqlAdapter;
    }

    @Override
    public @NotNull RedisAdapter getRedis() {
        return redisAdapter;
    }
}

// he is good with commands and configuration
//