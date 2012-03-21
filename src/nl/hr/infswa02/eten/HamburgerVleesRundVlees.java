package nl.hr.infswa02.eten;

public class HamburgerVleesRundVlees implements AbstractHamburgerVlees {
	@Override
	public int getPrijs() {
		return 10;
	}
	
	@Override
	public String toString(){
		return "met Sla";
	}
}
