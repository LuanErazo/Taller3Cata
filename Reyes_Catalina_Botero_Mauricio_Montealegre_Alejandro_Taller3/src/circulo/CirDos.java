package circulo;

import processing.core.PApplet;

public class CirDos extends Circulo {
	private PApplet app;
	private int z = 100;
	private float angle, angles, anglee;

	public CirDos(PApplet app) {
		super(app);
		this.app = app;
		angle = 15;
		angle = 90;
		anglee = 45;

	}

	public void pintar() {
		app.lights();
		app.noStroke();
		app.fill(0);
		app.pushMatrix();
		app.translate(pos.x, pos.y, z);
		app.sphere(tam-8);
		app.pushMatrix();
		app.pushStyle();
		app.noFill();
		app.stroke(h - 30, 80, 80);
		app.strokeWeight(1);
		app.rotateX(PApplet.radians(angle));
		app.ellipse(0, 0, 60, 25);
		app.rotateX(PApplet.radians(angles));
		app.ellipse(0, 0, 60, 25);
		app.rotateX(PApplet.radians(angle+45));
		app.ellipse(0, 0, 60, 25);
		app.rotateX(PApplet.radians(anglee+45));
		app.ellipse(0, 0, 60, 25);
		app.rotateY(PApplet.radians(anglee));
		app.ellipse(0, 0, 60, 25);
		app.rotateY(PApplet.radians(angles));
		app.ellipse(0, 0, 60, 25);
		app.rotateY(PApplet.radians(anglee+40));
		app.ellipse(0, 0, 60, 25);
		app.rotateZ(PApplet.radians(angles));
		app.ellipse(0, 0, 60, 25);
		app.rotateZ(PApplet.radians(angles+50));
		app.ellipse(0, 0, 60, 25);
		app.rotateY(PApplet.radians(angle+90));
		app.ellipse(0, 0, 60, 25);
		app.rotateZ(PApplet.radians(anglee+90));
		app.ellipse(0, 0, 60, 25);
		app.popStyle();
		app.popMatrix();
		app.popMatrix();
		angle += 2;
		angles -=2;
		anglee += 0.5f;
	}

}
