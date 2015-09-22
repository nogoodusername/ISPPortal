package javaapplication19;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DBConnect {
    /*public static void main(String[] arg)   {
        try{
            Scanner sc = new Scanner(System.in);
            String host = "jdbc:derby://localhost:1527/customer";
            Connection con = DriverManager.getConnection(host, "qq", "qq");
            JOptionPane.showMessageDialog(null, "lllllll");
            Statement st = con.createStatement();
            //String stm = sc.nextLine();//SQL Query
            String stm = "SELECT * FROM QQ.ACCOUNT";
            ResultSet rs = st.executeQuery(stm);//Execute
            
            
            while(rs.next())    {//Goto next record
                String username = rs.getString("USERNAME");
                String pass = rs.getString("PSWD");
                String acid = rs.getString("ACID");
                String usr = sc.nextLine();
                String psw = sc.nextLine();
                if(usr.equals(username))  {
                    if(psw.equals(pass)) {
                        System.out.println("XXXXX");
                        System.out.println("UName"+username+"\nPass"+pass+acid);
                    }
                }
                else    System.out.println("1111");
            }
        }   catch(SQLException e)   {
            System.out.println(e.getMessage());
        }  
    }*/
    
    
    public static Connection ConnectDB() {
       
        try{
            
            Scanner sc = new Scanner(System.in);
            String host = "jdbc:derby://localhost:1527/customer";
            Connection con = DriverManager.getConnection(host, "qq", "qq");
            return con;
            }   catch(SQLException e)   {
            System.out.println(e.getMessage());
        }
        Connection c = null;
        return c;
    }
}
