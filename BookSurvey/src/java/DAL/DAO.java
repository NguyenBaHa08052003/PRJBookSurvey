/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author admin
 */
public class DAO extends DBContext{
    
//    private PreparedStatement ps;
//    private ResultSet rs;
    public Account login(String userName, String password){
        String sql = "select * from Account\n" +
                   "where [user] = ? and [password] = ?";
        try {
             PreparedStatement ps = connect.prepareStatement(sql);
             ps.setString(1, userName);
             ps.setString(2, password);
             
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 return new Account(rs.getInt(1),
                         rs.getString(2),
                         rs.getString(3),
                         rs.getInt(4),
                         rs.getInt(5));
             }
            
        } catch (Exception e) {
        }       
        return null;
    }
    
   
}
