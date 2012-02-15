package nl.hr.infswa02.command;

import java.util.ArrayList;
import java.util.List;

import nl.hr.infswa02.Persoon;

public class Tafel {
	private List<Persoon> personen;
	public Tafel(){
		personen = new ArrayList<Persoon>(6);
	}
	public List<Persoon> getPersonen() {
		return personen;
	}
	public void setPersonen(List<Persoon> personen) {
		this.personen = personen;
	}
}
