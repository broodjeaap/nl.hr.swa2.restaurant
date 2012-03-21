package nl.hr.infswa02.abstractFactory;

import nl.hr.infswa02.eten.AbstractVoedsel;
import nl.hr.infswa02.eten.Hamburger;

public class HamburgerChef implements Chef {

	@Override
	public AbstractVoedsel maakVoedsel() {
		return new Hamburger();
	}
}