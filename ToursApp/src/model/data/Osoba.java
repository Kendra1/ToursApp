package model.data;

public class Osoba extends Korisnik{

	public enum Pol {�enski, Mu�ki}
	
	private String prezime;
	private String ime;
	private Pol pol;
	
	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public Pol getPol() {
		return pol;
	}

	public void setPol(Pol pol) {
		this.pol = pol;
	}

	public Osoba(String prezime, String ime, Pol pol) {
		super();
		this.prezime = prezime;
		this.ime = ime;
		this.pol = pol;
	}

	@Override
	public String toString() {
		return korisnickoIme + "|" + lozinka + "|" + ime + "|" + prezime + "|" + pol;
	}
	
	
}