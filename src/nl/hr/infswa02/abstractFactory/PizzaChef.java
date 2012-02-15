package nl.hr.infswa02.abstractFactory;

import nl.hr.infswa02.eten.AbstractVoedsel;
import nl.hr.infswa02.eten.Pizza;

public class PizzaChef implements Chef {

	@Override
	public AbstractVoedsel maakVoedsel() {
		return new Pizza();
	}

}
