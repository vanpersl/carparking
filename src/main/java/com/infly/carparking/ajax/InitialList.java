package com.infly.carparking.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Backstage
 */
public class InitialList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "text/html; charset=UTF-8";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitialList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType(CONTENT_TYPE);
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String tmp = request.getParameter("name");
        tmp = new String(tmp.getBytes("ISO8859-1"));
        System.out.println(tmp);
        
        StringBuffer sb = new StringBuffer("");
        LinkedList ls = new LinkedList();
        ls = query("33",tmp);
        for (int i = 0;i < ls.size(); i++){
            sb.append(ls.get(i));
        }
        //sb.append("</select>");
        out.println(sb);
        System.out.println(sb.toString());
        out.print(sb.toString());
        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
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
            pr = con.prepareStatement("select distinct varch from car_no_division where head = ?; ");
            pr.setString(1, str);
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

}
