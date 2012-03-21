package nl.hr.infswa02;


import java.util.Random;
import nl.hr.infswa02.command.Bestelling;

public class Persoon {
	private static Random r = new Random();
	private static String[] mogelijkheden = new String[] {"Pizza","Pasta","Hamburger"};
	
	public void getBestelling() {
		//return new Bestelling(mogelijkheden[r.nextInt(3)], this, new Keuken);
	}

}
