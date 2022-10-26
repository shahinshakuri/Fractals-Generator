package fr.univartois.butinfo.fractals.complex;

/*L'adaptateur permettant de calculer des suites de points du plan réel */

public class AdaptateurComplex implements IPlanPoint {

	private IComplex complex;

	public AdaptateurComplex(IComplex complex) {

		this.complex = complex;
	}

	@Override
	public double X() {

		return this.complex.getRealPart();
	}

	@Override
	public double Y() {

		return this.complex.getImaginaryPart();
	}

	@Override
	public double distance(IPlanPoint point) {
		return Math.sqrt(Math.pow(point.X() - X(), 2) + Math.pow(point.Y() - Y(), 2));
	}

	@Override
	public IComplex convertirEnIComplex() {
		return complex;
	}

}