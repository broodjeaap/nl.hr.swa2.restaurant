package nl.hr.infswa02.command;

import nl.hr.infswa02.abstractFactory.Chef;
//import nl.hr.infswa02.abstractFactory.HamburgerChef;

public class Keuken {
	
	public Order verwerkOrder(Bestelling bestelling){
		
		String[] s = bestelling.getOrder().split(" ");
		Chef chef = null;
		if(chef == null){
			return null;
		}
		return null;
		//return new Order(chef.maakVoedsel(),bestelling.getKlant());
	}
}
