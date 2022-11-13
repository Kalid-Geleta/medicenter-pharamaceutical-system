/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kalid Geleta
 */
public class db {
  static  ResultSet n;
  
    public static String database(String query1,String stat){
      
          String pass="";
            
            try{
                                    String  query=query1;
                                Class.forName("com.mysql.jdbc.Driver");
                                  //  System.out.println("connected");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmasystem","root","");
                               Statement g=con.createStatement();
                             ResultSet rs;
                             
                               
                               int count;
                               
                               if(stat=="s"){
                             
                                rs=g.executeQuery(query);
                                 rs.next();
                                pass=rs.getString(2);
                                
                                
                               }
                               else if (stat=="iu"){
                                   count =g.executeUpdate(query);
                                   System.out.println("inserted/updated");
                            
                                     
                                 }
                                
                                 else if (stat=="u"){
                                     g.executeUpdate(query);
                                     System.out.println("updated");
                                 }
                                 else if (stat=="m"){
                                      n=g.executeQuery(query);
                                  
                                     
                                     
                                     
                                 }
                                 else if (stat=="c")
                                 {
                                    
                                rs=g.executeQuery(query);
                               
                                
                               if( rs.next()){
                                   pass="success";
                               }
                               else
                                   pass="fail";
                                     
                                 }
                               
                                }
            
                                catch(ClassNotFoundException e){
                                    
                                    e.printStackTrace();
                                  
                                }
                                 catch(SQLException e){
                                    
                                    e.printStackTrace();
                                  
                                }
                                    
                            return pass;
                              }
           
          public static  String status=null; 
        }

          


    

