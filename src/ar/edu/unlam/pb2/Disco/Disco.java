package ar.edu.unlam.pb2.Disco;

public class Disco {
	protected double radioInterior, radioExterior, perimetroInterior, perimetroExterior, superficie;
	
	public Disco(double radioInterior, double radioExterior) {
		this.radioInterior= radioInterior;
		this.radioExterior= radioExterior;
	}
	public double getSuperficie() {
		superficie = (Math.PI*(Math.pow(radioExterior, 2)))- (Math.PI*(Math.pow(radioInterior, 2)));
		return superficie;
	}
	public double getRadioInterior() {
		return radioInterior;
	}
	public void setRadioInterior(double radioInterior) {
		this.radioInterior = radioInterior;
	}
	public double getRadioExterior() {
		return radioExterior;
	}
	public void setRadioExterior(double radioExterior) {
		this.radioExterior = radioExterior;
	}
	public double getPerimetroInterior() {
		perimetroInterior = 2 *Math.PI*radioInterior;
		return perimetroInterior;
	}
	public double getPerimetroExterior() {
		perimetroExterior= 2*Math.PI*radioExterior;
		return perimetroExterior;
	}
	
	
	
	
}
