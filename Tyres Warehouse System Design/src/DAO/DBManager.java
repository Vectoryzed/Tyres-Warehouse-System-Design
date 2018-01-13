package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager
{
	private static java.sql.Connection connection;
	
	public static Connection OpenConnection( )
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance( );
			connection = DriverManager.getConnection("jdbc:mysql://localhost/pneumaticiDB?user=root&password=root");
			return connection;
		}
		
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static void CloseConnection( )
	{
		try
		{
			connection.close( );
		}
		
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


