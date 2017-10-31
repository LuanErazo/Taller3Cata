package cuadrado;

import processing.core.PApplet;

public class CuaTres extends Cuadrado{
	private PApplet app;
	private float x;
	private int z, alpha;
	private float vell;
	private float num,angulo, col, amp, i, ci, numCir,r,rx;

	public CuaTres(PApplet app) {
		super(app);
		this.app = app;
		x = pos.x + 30;
		vell = -2;
		alpha = 80;
		num = 8;
		numCir = 8;
		angulo = 360 / num;
	}

	public void pintar() {
		i += 0.1;
		ci += 0.1;
		r += 3;
		rx++;
		amp = PApplet.sin(i) * 1;
		tam = PApplet.sin(i) * 8;
		tam = PApplet.constrain(tam, -8, 2);
		col = PApplet.sin(ci) * 50;
		app.lights();
		app.stroke(h, 80, 80);
		app.strokeWeight(0.3f);
		app.noFill();
		app.pushMatrix();
		app.translate(pos.x, pos.y, 100);
		app.box(tam);
		app.rotateX(PApplet.radians(r));
		app.rotateZ(PApplet.radians(r));
		app.rotateY(PApplet.radians(r));
		
		for (int i = 0; i < num; i++) {
			app.rotateX(PApplet.radians(i * angulo));
			for (int j = 0; j < num; j++) {
				app.rotateZ(PApplet.radians(i * angulo));
				app.pushMatrix();
				app.translate(amp, 0, 0);
				app.noStroke();
				app.fill(100 + col, 50 - tam, 100 + tam, 100 - col);
				app.rect(0, 20 + tam, 10, 10);
				app.popMatrix();

			}
		}

		app.popMatrix();
	}

}
