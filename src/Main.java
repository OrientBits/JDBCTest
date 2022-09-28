import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {


        try {

            Connection c = ConnectionProvider.getConnection();

            String s = "insert into images(pic) values(?)";

            PreparedStatement ps = c.prepareStatement(s);

            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();

            FileInputStream fis = new FileInputStream(file);

            ps.setBinaryStream(1,fis,fis.available());

            ps.executeUpdate();

            System.out.println("Done......");
            JOptionPane.showMessageDialog(null,"Success");

        } catch (Exception e) {
            System.out.println(e);
        }


    }


}
