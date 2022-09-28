// PreparedStatement:insert

import java.sql.*;
import java.io.*;

class Fun{
	public static void main(String[] args){
		try{

			//1.load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//2.create connection
			String url = "jdbc:mysql://localhost:3306/youtube";
			String userName = "root";
			String password = "@3Testing#";
			Connection con = DriverManager.getConnection(url,userName,password);

			// create a query
			String q = "insert into table1(tName,tCity) values (?,?)";

			//get the PreparedStatement object
			PreparedStatement pstmt = con.prepareStatement(q);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter name");
			String name = br.readLine();

			System.out.println("Enter City");
			String city = br.readLine();
			

			//set the value to the query
			pstmt.setString(1,name);
			pstmt.setString(2,city);

			pstmt.executeUpdate();

			System.out.println("Inserted...");
			con.close();

		}catch(Exception e){
			System.out.println("Exception "+e);
		}

	}
}