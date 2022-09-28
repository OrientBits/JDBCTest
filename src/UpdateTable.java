import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateTable {
    public static void main(String[] args) {
        try {
            Connection connection = ConnectionProvider.getConnection();
            String q = "update table1 set tName=?, tCity=? where tId=?";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter new name");
            String name = br.readLine();

            System.out.println("Enter new City");
            String city = br.readLine();

            System.out.println("Enter the student id");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement ps = connection.prepareStatement(q);
            ps.setString(1,name);
            ps.setString(2,city);
            ps.setInt(3,id);

            ps.executeUpdate();

            System.out.println("Done.....");
            connection.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
