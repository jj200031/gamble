import codes.laivy.data.sql.mysql.MysqlDatabase;
import codes.laivy.data.sql.mysql.MysqlReceptor;
import codes.laivy.data.sql.mysql.MysqlTable;
import codes.laivy.data.sql.mysql.natives.MysqlDatabaseNative;
import codes.laivy.data.sql.mysql.natives.MysqlReceptorNative;
import codes.laivy.data.sql.mysql.natives.MysqlTableNative;
import codes.laivy.data.sql.mysql.natives.MysqlVariableNative;
import codes.laivy.data.sql.mysql.natives.manager.MysqlManagerNative;
import codes.laivy.data.sql.mysql.variable.type.MysqlTextVariableType;

import java.sql.SQLException;
import java.util.UUID;

public class Test {

    public static void main(String[] args) {
        try {
            MysqlDatabase mysql = new MysqlDatabaseNative(new MysqlManagerNative("213.170.135.195", "u6_Plo9uZqek5", "v3N^S3jy6p8odhfRQ!X@LjKk", 3306), "s6_test");
            MysqlTable table = new MysqlTableNative(mysql, "test_table");
            new MysqlVariableNative(table, "variable_test", new MysqlTextVariableType(MysqlTextVariableType.Size.TINYTEXT), null);

            MysqlReceptor receptor = new MysqlReceptorNative(table, "test");
            receptor.load();  //login

            System.out.println("Value: '" + receptor.get("variable_test") + "'");
            receptor.set("variable_test", 100L);

            receptor.unload(true);  //logout
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

