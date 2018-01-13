package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import java.util.*;
import Core.Magazzini.*;


public class MagazziniDAO {
	private static java.sql.Connection connection;

	public Magazzino ottieniMagazzino(int cod) {
		connection = DBManager.OpenConnection( );
		
		/*if (connection != null) {
            System.out.println("Connesso con successo al database");
        }*/
		
		Magazzino magazzino = new Magazzino( );
		
		try
		{
			String tabella = "magazzini";
			Integer.toString(cod);
			String query_magazzini = "SELECT * FROM " + tabella + " WHERE codice='" + cod + "'";
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(query_magazzini);
			
			while (rs.next( ))
			{
				magazzino.setCodice(rs.getInt("codice"));
				magazzino.setIndirizzo(rs.getString("indirizzo"));
				magazzino.setNome_responsabile((rs.getString("nome_responsabile")));
				magazzino.setRegione(rs.getString("regione"));
			}
			
			st.close( );
		}
		catch (SQLException e)
		{
			e.printStackTrace( );
		}
		
		DBManager.CloseConnection( );
		
		return magazzino;
	}
}
