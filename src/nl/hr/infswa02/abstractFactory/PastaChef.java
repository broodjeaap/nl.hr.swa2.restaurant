package nl.hr.infswa02.abstractFactory;

import nl.hr.infswa02.eten.AbstractVoedsel;
import nl.hr.infswa02.eten.Pasta;

public class PastaChef implements Chef {

	@Override
	public AbstractVoedsel maakVoedsel() {
		return new Pasta();
	}

}
