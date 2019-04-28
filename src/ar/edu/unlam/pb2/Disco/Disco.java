package ar.edu.unlam.pb2.Disco;

public class Disco {
	protected double radioInterior, radioExterior, perimetroInterior, perimetroExterior, superficie;
	
	public Disco(double radioInterior, double radioExterior) {
		this.radioInterior= radioInterior;
		this.radioExterior= radioExterior;
	}
	
	
	public double calcularSuperficie() {
		superficie = (Math.PI*(Math.pow(radioExterior, 2)))- (Math.PI*(Math.pow(radioInterior, 2)));
		return superficie;
	}
	
	public double calcularPerimetroInterior() {
		perimetroInterior = 2 *Math.PI*radioInterior;
		return perimetroInterior;
		
	}
	
	public double calcularPerimetroExterior() {
		perimetroExterior= 2*Math.PI*radioExterior;
		return perimetroExterior;
		}
	
	
	public double getSuperficie() {
		return superficie;
	}
	
	public double getRadioInterior() {
		return radioInterior;
	}

	public double getRadioExterior() {
		return radioExterior;
	}
	
	public double getPerimetroInterior() {
		return perimetroInterior;
	}
	
	public double getPerimetroExterior() {
		return perimetroExterior;
	}
	
	public void setRadioInterior(double radioInterior) {
		this.radioInterior = radioInterior;
	}
	
	public void setRadioExterior(double radioExterior) {
		this.radioExterior = radioExterior;
	}

	
	
	
}