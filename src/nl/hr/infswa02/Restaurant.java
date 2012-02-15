package nl.hr.infswa02;

import java.util.LinkedList;
import java.util.Queue;

import nl.hr.infswa02.command.Keuken;
import nl.hr.infswa02.command.Tafel;

public class Restaurant {
	private Tafel[] tafels;
	private Queue<Persoon> wachtlijst = new LinkedList<Persoon>();
	private Keuken keuken;
	
	public Restaurant(){
		tafels = new Tafel[40];
		for(Tafel t : tafels){
			t = new Tafel();
		}
		keuken = new Keuken();
	}
	
	
	
	public Tafel[] getTafels() {
		return tafels;
	}
	public void setTafels(Tafel[] tafels) {
		this.tafels = tafels;
	}
	public Queue<Persoon> getWachtlijst() {
		return wachtlijst;
	}
	public void setWachtlijst(Queue<Persoon> wachtlijst) {
		this.wachtlijst = wachtlijst;
	}
}
