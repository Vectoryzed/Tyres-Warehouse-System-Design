package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import Core.Ordini.*;

/**
 * 
 */
public class OrdiniDAO {
	
	private static java.sql.Connection connection;

    /**
     * Default constructor
     */
    public OrdiniDAO() {
    }

    /**
     * @param ord
     */
    public void inserisciOrdineDB(Ordine ord) {
        // TODO implement here
    }

    /**
     * @param ord
     */
    public void aggiornaOrdineDB(Ordine ord) {
        // TODO implement here
    }

    /**
     * @param ord
     */
    public void cancellaOrdineDB(Ordine ord) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ArrayList<Ordine> leggiOrdiniStato() {
		ArrayList<Ordine> listaOrdiniNonEvasi = new ArrayList<Ordine>();
		MagazziniDAO magdao = new MagazziniDAO();
		FornitoriDAO forndao = new FornitoriDAO();
		
		String userforn;
		int codmag;
		
		connection = DBManager.OpenConnection( );
		
		/*if (connection != null) {
            System.out.println("Connesso con successo al database");
        }*/
		
		try
		{
			String tabella = "ordini";
			String stato = "Non evaso";
			String query_ordini_non_evasi = "SELECT * FROM " + tabella + " WHERE stato='" + stato + "'";
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(query_ordini_non_evasi);
			
			while (rs.next( ))
			{
				Ordine ordine = new Ordine( );
				ordine.setID(rs.getInt("ID"));
				ordine.setStato(rs.getString("stato"));
				ordine.setData_emissione(rs.getDate("data_emissione"));
				ordine.setGiorno_consegna(rs.getDate("giorno_consegna"));
				
				userforn = rs.getString("fornitura");
				ordine.setFornitura(forndao.ottieniFornitore(userforn));

				codmag = rs.getInt("consegna");
				ordine.setConsegna(magdao.ottieniMagazzino(codmag));
				
				listaOrdiniNonEvasi.add(ordine);
			}
			
			st.close( );
		}
		catch (SQLException e)
		{
			e.printStackTrace( );
		}
		
		DBManager.CloseConnection( );
		
		if (listaOrdiniNonEvasi.isEmpty()) {
			System.out.println("Nessun ordine trovato!");
			return null;
		}
		else return listaOrdiniNonEvasi;
    }

}