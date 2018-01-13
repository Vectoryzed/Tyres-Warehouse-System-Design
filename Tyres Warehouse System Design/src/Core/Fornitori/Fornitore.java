package Core.Fornitori;

/**
 * 
 */
public class Fornitore {

    /**
     * Default constructor
     */
    public Fornitore() {
    }

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String nominativo;

    /**
     * 
     */
    private String indirizzo;

    /**
     * 
     */
    private Integer numero_telefono;


    /**
     * @param user 
     * @param pass 
     * @param nom 
     * @param ind 
     * @param num
     */
    public Fornitore(String user, String pass, String nom, String ind, Integer num) {
        this.indirizzo = ind;
        this.username = user;
        this.nominativo = nom;
        this.password = pass;
        this.numero_telefono = num;
    }


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNominativo() {
		return nominativo;
	}


	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public Integer getNumero_telefono() {
		return numero_telefono;
	}


	public void setNumero_telefono(Integer numero_telefono) {
		this.numero_telefono = numero_telefono;
	}
	
	public boolean equals(Fornitore f) {
		return((this.username).equals(f.username) && (this.password).equals(f.password) && (this.numero_telefono).equals(f.numero_telefono) && (this.nominativo).equals(f.nominativo) && (this.indirizzo).equals(f.indirizzo));
	}

}