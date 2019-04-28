package TestDisco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.Disco.Disco;

class TestDisco {

	@Test
	void testParaSaberSiLaSuperficieEstaBienCalculada() {
		Disco disco1 = new Disco (50.0, 100.0);
		
		disco1.calcularSuperficie();
		
		assertEquals(23561.9449, disco1.getSuperficie(), 0.01);
	}
	
	@Test
	void testParaSaberSiElPerimetroExteriorEstaBienCalculado() {
		Disco disco1 = new Disco (50.0, 100.0);
		
		disco1.calcularPerimetroExterior();
		
		assertEquals(628.3185307, disco1.getPerimetroExterior(), 0.01);
	}
	
	@Test
	void testParaSaberSiElPerimetroInteriorEstaBienCalculado() {
		Disco disco1 = new Disco (50.0, 100.0);
		
		disco1.calcularPerimetroInterior();
		
		assertEquals(314.1592654, disco1.getPerimetroInterior(), 0.01);
	}
}