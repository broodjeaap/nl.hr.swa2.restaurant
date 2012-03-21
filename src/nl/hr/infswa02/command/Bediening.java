package nl.hr.infswa02.command;

import java.util.ArrayList;
import java.util.List;

import nl.hr.infswa02.Persoon;
import nl.hr.infswa02.Restaurant;

public class Bediening {
	List<Bestelling> bestellingen = new ArrayList<Bestelling>();
	List<Order> orders = new ArrayList<Order>();
	Restaurant restaurant;
	
	public Bediening(Restaurant restaurant){
		this.restaurant = restaurant;
	}
	
	public void tafelRonde(List<Tafel> tafels){
		for(Tafel t : tafels){
			for(Persoon p : t.getPersonen()){
				//bestellingen.add(p.getBestelling());
			}
		}
	}
	
	public void plaatsenOrderKeuken(){
		for(Bestelling b : bestellingen){
			orders.add(restaurant.getKeuken().verwerkOrder(b));
		}
		bestellingen = new ArrayList<Bestelling>();
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Bestellingen:\n");
		for(Bestelling b : bestellingen){
			sb.append("\t"+b.getOrder()+"\n");
		}
		sb.append("Orders:\n");
		for(Order o : orders){
			sb.append("\t"+o.getVoedsel().toString()+"\n");
		}
		return sb.toString();
	}
}
