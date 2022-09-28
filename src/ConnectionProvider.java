import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    private static Connection con;

    public static Connection getConnection(){

        try {
            if (con == null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/youtube",
                        "root",
                        "@3Testing#"
                );
                System.out.println("Connection granted...");
            }

        }catch (Exception e){
            System.out.println("Exception: "+ e);
        }

        return con;
    }
}
