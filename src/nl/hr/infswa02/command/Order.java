package nl.hr.infswa02.command;

import nl.hr.infswa02.Persoon;
import nl.hr.infswa02.eten.AbstractVoedsel;

public class Order {
	private AbstractVoedsel voedsel;
	private Persoon klant;
	
	public Order(AbstractVoedsel voedsel, Persoon klant){
		this.voedsel = voedsel;
		this.klant = klant;
	}
	public AbstractVoedsel getVoedsel() {
		return voedsel;
	}
	public void setVoedsel(AbstractVoedsel voedsel) {
		this.voedsel = voedsel;
	}
	public Persoon getKlant() {
		return klant;
	}
	public void setKlant(Persoon klant) {
		this.klant = klant;
	}
	
}
