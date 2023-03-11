package gamblev.jaxson.gvutils.connection;

import gamblev.jaxson.gvutils.connection.mysql.MysqlAdapter;
import gamblev.jaxson.gvutils.connection.redis.RedisAdapter;
import org.jetbrains.annotations.NotNull;

public interface Connection {

    /**
     * We will use Sqlite for now.
     * @return the MySQL adapter
     */
    @NotNull MysqlAdapter getMysql();

    /**
     * The redis connection adapter.
     * @return the redis adapter
     */
    @NotNull RedisAdapter getRedis();

}
