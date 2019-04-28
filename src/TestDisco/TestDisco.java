package TestDisco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.Disco.Disco;

class TestDisco {

	@Test
	void test() {
		Disco disco1 = new Disco (5, 20);
		System.out.println(disco1.getRadioInterior());
		System.out.println(disco1.getRadioExterior());
		System.out.println(disco1.getPerimetroInterior());
		System.out.println(disco1.getPerimetroExterior());
		System.out.println(disco1.getSuperficie());
		disco1.setRadioInterior(2);
		disco1.setRadioInterior(10);
		System.out.println(disco1.getRadioInterior());
		System.out.println(disco1.getRadioExterior());
		System.out.println(disco1.getPerimetroInterior());
		System.out.println(disco1.getPerimetroExterior());
		System.out.println(disco1.getSuperficie());
		
	}

}
