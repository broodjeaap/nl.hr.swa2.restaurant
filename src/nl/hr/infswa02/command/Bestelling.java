package nl.hr.infswa02.command;

import nl.hr.infswa02.Persoon;

public class Bestelling implements KeukenBestelling {
	private String order;
	private Persoon klant;
	private Keuken keuken;

	public Bestelling(String order, Persoon klant, Keuken keuken) {
		this.order = order;
		this.klant = klant;
		this.keuken = keuken;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Persoon getKlant() {
		return klant;
	}

	public void setKlant(Persoon klant) {
		this.klant = klant;
	}
	
	public Keuken getKeuken() {
		return keuken;
	}

	public void setKeuken(Keuken keuken) {
		this.keuken = keuken;
		
	}

	public void maakBestelling() {
		//keuken.verwerkOrder();
	}
}
