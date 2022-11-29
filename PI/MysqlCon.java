import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


class MysqlCon {
    private static String user="root";
    private static String url="jdbc:mysql://localhost:3306/pi";
    private static String password="dev1";
    private static Connection conexao;
    private MysqlCon(){};

    public static Connection getConexao() throws SQLException {
        if (conexao == null) {
            conexao = DriverManager.getConnection(url, user, password);
        }
        return conexao;
    }
    


}