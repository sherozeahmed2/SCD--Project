/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scd_project;
import java.sql.*;  

class databaseconnectivity{  

    
    public static void main(String args[]){
        
    
try{   
Class.forName("com.mysql.cj.jdbc.Driver");  
//here sonoo is database name, root is username and password
    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/scd","root","")) {
        //here sonoo is database name, root is username and password
        Statement stmt=con.createStatement();
        stmt.executeUpdate("INSERT into login VALUES ('sheroze123', '123@scdSCD')");
        ResultSet rs=stmt.executeQuery("select * from login");
        while(rs.next())
            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  ");  
    }
}catch(Exception e){ System.out.println(e);}  
  
}
}  
