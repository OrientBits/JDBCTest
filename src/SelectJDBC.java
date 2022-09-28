import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJDBC {
    public static void main(String[] args) {
        try{
            Connection connection = ConnectionProvider.getConnection();
            String q = "select * from table1";

            Statement statement = connection.createStatement();

            ResultSet set = statement.executeQuery(q);

            while (set.next()){
                System.out.print(set.getInt(1) +" : ");
                System.out.print(set.getString(2) +" : ");
                System.out.print(set.getString(3));
                System.out.println();
            }

            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
