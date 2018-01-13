package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.*;
import Core.Fornitori.*;
//import Core.Magazzini.Magazzino;

public class FornitoriDAO {
	
		private static java.sql.Connection connection;

		public Fornitore ottieniFornitore(String username) {		
			connection = DBManager.OpenConnection( );
			
			/*if (connection != null) {
	            System.out.println("Connesso con successo al database");
	        }*/
			
			Fornitore fornitore = new Fornitore( );
			
			try
			{
				String tabella = "fornitori";
				String query_fornitori = "SELECT * FROM " + tabella + " WHERE username='" + username + "'";
				Statement st = connection.createStatement();
				ResultSet rs = st.executeQuery(query_fornitori);
				
				while (rs.next( ))
				{
					fornitore.setUsername(rs.getString("username"));
					fornitore.setPassword(rs.getString("password"));
					fornitore.setIndirizzo(rs.getString("indirizzo"));
					fornitore.setNominativo(rs.getString("nominativo"));
					fornitore.setNumero_telefono(rs.getInt("numero_telefono"));
				}
				
				st.close( );
			}
			catch (SQLException e)
			{
				e.printStackTrace( );
			}
			
			DBManager.CloseConnection( );
			
			return fornitore;
		}
}
