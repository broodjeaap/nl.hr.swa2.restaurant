package nl.hr.infswa02.eten;

public class HamburgerVolkorenBroodje implements AbstractHamburgerBroodje {
	@Override
	public int getPrijs() {
		return 10;
	}
	
	@Override
	public String toString(){
		return "met Sla";
	}
}
