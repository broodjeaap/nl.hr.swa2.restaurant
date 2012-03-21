package nl.hr.infswa02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import nl.hr.infswa02.command.Bediening;
import nl.hr.infswa02.command.Keuken;
import nl.hr.infswa02.command.Tafel;
import nl.hr.infswa02.eten.AbstractVoedsel;

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
	
	public synchronized void start(){
		Tafel[] t = new Tafel[2];
		t[0] = new Tafel();
		t[1] = new Tafel();
		List<Persoon> p = new ArrayList<Persoon>();
		for(int a = 0;a < 5;++a){
			p.add(new Persoon());
		}
		t[0].setPersonen(p);
		t[1].setPersonen(p);
		List<Tafel> tafels = new ArrayList<Tafel>();
		tafels.add(t[0]);
		tafels.add(t[1]);
		Bediening b = new Bediening(this);
		b.tafelRonde(tafels);
		System.out.println(b);
		b.plaatsenOrderKeuken();
		System.out.println(b);
		//while(true){
						
		//}
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

	public Keuken getKeuken() {
		return keuken;
	}

	public void setKeuken(Keuken keuken) {
		this.keuken = keuken;
	}
	
}
