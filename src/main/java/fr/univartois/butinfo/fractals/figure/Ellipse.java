package fr.univartois.butinfo.fractals.figure;

/**
 * La figure Ellipse.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class Ellipse {
	
	/**
	 * rayon x.
	 */
	private int rx;

	/**
	 * rayon y.
	 */
	private int ry;

	/**
	 * position x corne gauche du rectangle.
	 */
	private int cx;

	/**
	 * position y corne gauche du rectangle.
	 */
	private int cy;

	/**
	 * Couleur du rectangle.
	 */
	private String stroke;

	/**
	 * le fond.
	 */
	private String fill;

	/**
	 * largeur de couleur.
	 */
	private int strokeWidth;
	
	private IFigure decorated;

	public Ellipse( int cx, int cy, String stroke, String fill, int strokeWidth) {
		this.cx = cx;
		this.cy = cy;
		this.stroke = stroke;
		this.fill = fill;
		this.strokeWidth = strokeWidth;
	}
	/**
	 * Methode de chaine de caractere svg.
	 */
	public String toString() {
		return "<svg width=\"200\" height=\"250\" version=\"1.1\"> < ellipse  cx=" + cx + ", cy=" + cy + ",rx=" + rx + ", ry=" + ry 
				+ ", stroke=" + stroke + ", fill=" + fill + ", strokeWidth=" + strokeWidth + decorated +"/> </svg>";
	}
}