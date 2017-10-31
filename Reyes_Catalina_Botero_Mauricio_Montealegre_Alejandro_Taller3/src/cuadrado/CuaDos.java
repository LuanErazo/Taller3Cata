package cuadrado;

import processing.core.PApplet;

public class CuaDos extends Cuadrado{
	private PApplet app;
	private float angulo;
	
	
	public CuaDos(PApplet app) {
		super(app);
		this.app=app;
		angulo = 15;
	}
	
	@Override
	public void pintar() {
		angulo += 0.1f;
		app.noStroke();
		app.fill(0);
		app.pushMatrix();
		app.translate(pos.x, pos.y, 100); 
		app.rotateY(angulo);
		app.rotateZ(angulo);
		app.rotateX(angulo);
		app.box(tam);
		app.pushStyle();
		app.stroke(h,80,80);
		app.strokeWeight(1);
		app.noFill();
		int a =50;
		app.box((tam- (tam/2))/2, (tam- (tam/2))/2, a-10);
		app.rotateY(PApplet.radians(45));
		app.box((tam- (tam/2))/2, (tam- (tam/2))/2, a);
		app.rotateY(PApplet.radians(90));
		app.box((tam- (tam/2))/2, (tam- (tam/2))/2, a-10);
		app.rotateY(PApplet.radians(135));
		app.box((tam- (tam/2))/2, (tam- (tam/2))/2, a);
		
		app.rotateX(PApplet.radians(45));
		app.box((tam- (tam/2))/2, (tam- (tam/2))/2, a);
		app.rotateX(PApplet.radians(90));
		app.box((tam- (tam/2))/2, (tam- (tam/2))/2, a-10);
		app.rotateX(PApplet.radians(135));
		app.box((tam- (tam/2))/2, (tam- (tam/2))/2, a);



		app.popStyle();
		app.popMatrix();
		
		
	}

}
