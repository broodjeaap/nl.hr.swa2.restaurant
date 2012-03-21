package nl.hr.infswa02.eten;

public class HamburgerSesamBroodje implements AbstractHamburgerBroodje {
	@Override
	public int getPrijs() {
		return 30;
	}
	
	@Override
	public String toString(){
		return "met Sla";
	}
}
