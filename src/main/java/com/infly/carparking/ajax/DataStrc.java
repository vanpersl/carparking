package com.infly.carparking.ajax;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class DataStrc {

    public Connection mysqlConnection(String username, String password) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/carparking?useUnicode=true&characterEncoding=gbk";
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("******************��δ���ҵ�!*****************");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("******************��������ʧ��******************");
            e.printStackTrace();
        }
        return con;
    }
    public LinkedList query(String column, String str){
        LinkedList ld = new LinkedList();
        Connection con = mysqlConnection("root","root");
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            pr = con.prepareStatement("select distinct head from car_no_division ; ");
           // pr.setString(1, str);
            rs = pr.executeQuery();
            while(rs.next()){
                ld.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("*****************SQL����쳣*****************");
        }
        return ld;
    }
    public static void main(String args[]){
    	if (new DataStrc().mysqlConnection("root", "root") == null){
    		System.out.print("***********��������ʧ��");
    	}
    }
}
