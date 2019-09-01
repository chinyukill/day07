package com.chenxue.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeptUpdateServlet
 */
public class DeptUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//deptNo=10&dName=ACCOUNTING&loc=NEW+YORK
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptNo,dName,loc=null;
		String sql="update dept set dname=?,loc=?where deptno=?";
		Connection connection=null;
		PreparedStatement ps=null;
		deptNo=request.getParameter("deptNo");
		dName=request.getParameter("dName");
		loc=request.getParameter("loc");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/chenxue","root","root");
			ps=connection.prepareStatement(sql);
			ps.setString(1, dName);
			ps.setString(2, loc);
			ps.setInt(3, Integer.valueOf(deptNo));
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/day07/dept/query.do");
	}

}
