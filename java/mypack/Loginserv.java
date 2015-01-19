package mypack;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginserv
 */
@WebServlet(
		urlPatterns = { "/Loginserv" }, 
		initParams = { 
				@WebInitParam(name = "driver", value = "com.mysql.jdbc.Driver"), 
				@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/mydb"), 
				@WebInitParam(name = "uid", value = "root"), 
				@WebInitParam(name = "pass", value = "root")
		})
public class Loginserv extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	 PreparedStatement pst;
     String driver,url,uid,pass;
     Connection con;
    public Loginserv()
    {
        super();
        System.out.println("in const  of servlet");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException
	{
		// TODO Auto-generated method stub
	   try
	   {
			super.init(config);
			
			driver=config.getInitParameter("driver");
			url = config.getInitParameter("url");
			uid = config.getInitParameter("uid");
			pass = config.getInitParameter("pass");
			Class.forName(driver);
			try
			{
				con=DriverManager.getConnection(url, uid, pass);
				//System.out.println("init of servlet");
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	   catch (ClassNotFoundException e5)
	{
		// TODO Auto-generated catch block
		e5.printStackTrace();
	}
			
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//System.out.println("service");
		  String username=request.getParameter("formname");
		  String email=request.getParameter("formemailid");
		  String password=request.getParameter("formpassword");
		  try 
		  {
			pst=con.prepareStatement("select * from admin where password=?");
		} 
		  catch (SQLException e2) 
		  {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		  }

try
	{
		pst.setString(1,password);
		System.out.println(password);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
			{
				System.out.println("success");
			}
		
		
	} 
catch (SQLException e1) 
{
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
