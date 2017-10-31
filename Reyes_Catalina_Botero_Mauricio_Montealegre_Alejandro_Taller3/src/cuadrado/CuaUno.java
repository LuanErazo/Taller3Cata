package cuadrado;

import processing.core.PApplet;

public class CuaUno extends Cuadrado{
	private PApplet app;
	private float angulo;
	private float x;
	private int z;
	private float vell;
	
	
	public CuaUno(PApplet app) {
		super(app);
		this.app=app;
		angulo = 15;
		x = pos.x + 30;
		vell = -2;
	}
	@Override
	public void pintar() {
		angulo += 0.05f;
		app.pushMatrix();
		app.translate(pos.x, pos.y, 100); 
		app.rotateY(angulo);
		app.rotateZ(angulo);
		app.stroke(h,80,80);
		app.strokeWeight(2);
		app.noFill();
		app.box(tam);
		app.popMatrix();
		
		app.pushMatrix();
		app.translate(x,  pos.y, z);
		app.pushStyle();
		app.stroke(h-150, 80, 80);
		app.strokeWeight(1);
		app.rect(0, 0, 10, 10);
		app.popStyle();
		app.popMatrix();
		
		x += vell;
		if (x > pos.x + 30) {
			x = pos.x + 30;
			z = 50;
			vell *= -1;
		}

		if (x < pos.x - 30) {
			x = pos.x - 30;
			z = 200;
			vell *= -1;
		}
		
	}

}
