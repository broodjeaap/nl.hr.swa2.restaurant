package nl.hr.infswa02.eten;

public class HamburgerMetSaus implements AbstractHamburgerSaus {

	@Override
	public int getPrijs() {
		return 20;
	}
	
	@Override
	public String toString(){
		return "met Saus";
	}
}
