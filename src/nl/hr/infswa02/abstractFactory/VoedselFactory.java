package nl.hr.infswa02.abstractFactory;

public class VoedselFactory {
	public static Chef getVoedsel(String s){
		if("Pizza".equals(s)){
			return new PizzaChef();
		} else if ("Pasta".equals(s)){
			return new PastaChef();
		} else if ("Hamburger".equals(s)){
			return new HamburgerChef();
		}
		return null;
	}
}
