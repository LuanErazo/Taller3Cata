package poligono;

import processing.core.PApplet;

public class PolUno extends Poligono {
	private PApplet app;
	private float angulo;
	private float x;
	private int z;
	private float vell;

	public PolUno(PApplet app) {
		super(app);
		this.app = app;
		angulo = 15;
		x = pos.x + 30;
		vell = -2;
	}

	@Override
	public void pintar() {
		angulo += 0.3f;
		app.pushMatrix();
		app.pushStyle();
		app.translate(pos.x, pos.y, 0);
		app.rotateX(angulo);
		app.rotateY(angulo);
		app.stroke(h, 80, 80);
		app.strokeWeight(1);
		app.noFill();
		app.sphereDetail(4, 3);
		app.sphere(tam);
		app.popStyle();
		app.popMatrix();

	}

}