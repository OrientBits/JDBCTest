import java.sql.*;

class InsertJDBC{

	public static void main(String[] args){

		try{

			//1.load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//2.create connection
			String url = "jdbc:mysql://localhost:3306/youtube";
			String userName = "root";
			String password = "@3Testing#";
			Connection con = DriverManager.getConnection(url,userName,password);

			//3.create query
			String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

			//create a statement
			Statement stmt = con.createStatement();

			stmt.executeUpdate(q);

			System.out.println("Table created in database");

			con.close();
		}catch(Exception e){
			System.out.println("Exception "+e);
		}

	}
}