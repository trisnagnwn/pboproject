package application;  
  
  
import java.sql.*;  
import javax.swing.JOptionPane;  
  
  
public class koneksi {  
    Connection conn;  
    Statement st;  
    ResultSet rs;  
   public Connection setKoneksi(){  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        conn=DriverManager.getConnection("jdbc:mysql://localhost/aplikasi_db","root","");  
        st=conn.createStatement();  
        }catch(ClassNotFoundException | SQLException e){  
                  
                JOptionPane.showMessageDialog(null,"Koneksi Gagal : " +e);  
        }  
    return conn;  
      
   }  
}   