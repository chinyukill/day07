package com.chenxue.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chenxue.bean.Dept;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class DeptSelectServlet
 */
public class DeptSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sql="select * from dept";
		Connection connection =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/chenxue","root","root");
			ps=connection.prepareStatement(sql);
			rs=ps.executeQuery();
			
			response.setContentType("application/json;charset=utf-8");
//			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			ArrayList<Object> arrayList = new ArrayList<>();
			while(rs.next()) {
				int deptNo=rs.getInt(1);
				String dName=rs.getString(2);
				String loc=rs.getString(3);
				Dept dept = new Dept(dName, deptNo, loc);
				arrayList.add(dept);
			}
			request.setAttribute("dept", arrayList);
			request.getRequestDispatcher("/dept_show.jsp").forward(request , response);;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
