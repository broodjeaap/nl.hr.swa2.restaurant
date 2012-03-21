package nl.hr.infswa02.eten;

public class HamburgerVleesVegetarisch implements AbstractHamburgerVlees {
	@Override
	public int getPrijs() {
		return 10;
	}
	
	@Override
	public String toString(){
		return "met Sla";
	}
}
