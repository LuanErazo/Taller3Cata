package circulo;

import processing.core.PApplet;
import processing.core.PConstants;

public class CirUno extends Circulo {
	private PApplet app;
	private float x;
	private int z, alpha;
	private float vell, angle;

	public CirUno(PApplet app) {
		super(app);
		this.app = app;
		x = pos.x + 30;
		vell = -2;
		alpha = 80;
	}

	public void pintar() {
		angle +=1;
		app.lights();
		app.stroke(h, 80, 80);
		app.strokeWeight(0.1f);
		app.noFill();
		app.pushMatrix();
		app.sphereDetail(30);
		app.translate(pos.x, pos.y, 100);
		app.rotateY(PApplet.radians(angle));
		app.rotateX(PApplet.radians(angle));
		app.rotateZ(PApplet.radians(angle));
		app.sphere(tam);
		app.popMatrix();

		app.pushMatrix();
		app.translate(x,  pos.y, z);
		app.rotateY(PApplet.radians(angle));
		app.rotateX(PApplet.radians(angle));
		app.rotateZ(PApplet.radians(angle));

		app.pushStyle();
		app.fill(h-150, 80, 80,alpha);
		app.ellipse(0, 0, 10, 10);
		app.popStyle();
		app.popMatrix();
		
		x += vell;
		if (x > pos.x + 30) {
			x = pos.x + 30;
			alpha -=50;
			z = 50;
			vell *= -1;
		}

		if (x < pos.x - 30) {
			x = pos.x - 30;
			z = 200;
			alpha+=50;
			vell *= -1;
		}
		
	}


}
