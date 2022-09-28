import java.sql.*;
import java.io.*;

class ImageSave{
	public static void main(String[] args){

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","@3Testing#");
			
			String q = "insert into images(pic) values(?)";

			PreparedStatement pstmt = con.prepareStatement(q);

			FileInputStream fis = new FileInputStream("Jio.png");

			pstmt.setBinaryStream(1,fis,fis.available());

			pstmt.executeUpdate();

			System.out.println("Done...");

		}catch(Exception e){
			System.out.println(e);
		}

	}
}
