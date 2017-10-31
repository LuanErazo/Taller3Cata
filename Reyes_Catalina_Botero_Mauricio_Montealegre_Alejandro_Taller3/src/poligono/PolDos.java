package poligono;

import processing.core.PApplet;

public class PolDos extends Poligono {
	private PApplet app;
	private float angulo;
	private float x;
	private int z;
	private float vell;

	public PolDos(PApplet app) {
		super(app);
		this.app = app;
		angulo = 15;
		x = pos.x + 30;
		vell = 1;
	}

	@Override
	public void pintar() {
		angulo += 0.1f;
		app.pushMatrix();
		app.pushStyle();
		app.translate(pos.x, pos.y, 0);
		app.rotateX(angulo);
		app.rotateY(angulo);
		app.stroke(h, 80, 80);
		app.strokeWeight(1);
		app.noFill();
		app.sphereDetail(2, 3);
		app.sphere(tam);
		app.popStyle();
		
		tam += vell;
		if (tam > 25) {
			vell *= -1;
		}
		
		if (tam < 10) {
			vell *= -1;
		}
		
		app.popMatrix();

	}

}
