/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import DAL.DAO;
import DAL.DBContext;
import Models.Account;

/**
 *
 * @author admin
 */
public class testDAO {
    public static void main(String[] args) {
        DAO dao = new DAO();
        String userName = "havuive";
        String password = "ngaimaiemyeuai";
        Account acc = dao.login(userName, password);
        
        System.out.println("Acc: " + acc);
    }
}
