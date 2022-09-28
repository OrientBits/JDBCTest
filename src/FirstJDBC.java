// Program for jdbc 1 program:
import java.sql.*;
class FirstJDBC
{
	public static void main(String[] args)
	{
		try{
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//"com.mysql.jdbc.Driver   old one"

			//Creating a connection
			String url = "jdbc:mysql://localhost:3306/youtube";
			String userName = "root";
			String password = "@3Testing#";
			Connection con = DriverManager.getConnection(url,userName,password);

			if (con.isClosed()) {
				System.out.println("Connection is closed");
			}else{
				System.out.println("Connection Created...");
			}

		}catch(Exception e){
			System.out.println(e);
		}

		
	}
}