package com.chenxue.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chenxue.bean.Dept;

/**
 * Servlet implementation class DeptFindByIdServlet
 */
public class DeptFindByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptNo,dName,loc=null;
		deptNo=request.getParameter("deptno");
		String sql="select * from dept where deptno=?";
		Connection connection=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Dept dept=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/chenxue","root","root");
			ps=connection.prepareStatement(sql);
			ps.setInt(1, Integer.valueOf(deptNo));
			rs=ps.executeQuery();
			rs.next();
			dName=rs.getString("dname");
			loc=rs.getString("loc");
			dept=new Dept(dName, Integer.valueOf(deptNo), loc);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("deptItem", dept);
		request.getRequestDispatcher("/dept_update.jsp").forward(request, response);
		
	}

}
