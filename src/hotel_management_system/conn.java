/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management_system;




import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            //Class.forName("com.mysql.jdbc.Driver");  
            //Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. 
            //The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
            c =DriverManager.getConnection("jdbc:mysql:///hms","root","cSR@1247485"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

