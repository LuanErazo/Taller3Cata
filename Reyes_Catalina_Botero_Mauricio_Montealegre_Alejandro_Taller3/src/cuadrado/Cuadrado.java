package cuadrado;

import java.util.ArrayList;

import circulo.Circulo;
import processing.core.PApplet;
import processing.core.PVector;

public abstract class Cuadrado extends Thread{

	protected float h;
	protected PVector pos;
	protected PVector vel;
	protected PVector ace;
	protected float velMax, fuerzaMax;
	protected PApplet app;
	protected boolean vida;
	protected float tam, tamp;

	public Cuadrado(PApplet app) {
		this.app = app;
		vel = new PVector(app.random(app.random(-3,-1f), app.random(1,3)), app.random(app.random(-3,-1), app.random(1,3)));
		ace = new PVector(0, 0);
		h= app.random(100,200);
		pos = new PVector(app.random(50,1150),app.random(50,650));
		velMax = 4;
		fuerzaMax = 0.2f;
		tam = 25;
		tamp = tam;
		vida = true;
		start();
	}	
	
	
	public void run() {

		while (vida) {
			mover();
			rebotar();
			try {
				sleep(20);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
	
	
	
	public abstract void  pintar();

	public void rebotar() {
		
		if (pos.x > app.width-30) {
			pos.x = app.width-30;
			vel.x *= -1;
		}

		if (pos.x < 250) {
			pos.x = 250;
			vel.x *= -1;
		}
		
		if (pos.y > app.height-30) {
			pos.y = app.height-30;
			vel.y *= -1;
		}

		if (pos.y < 30) {
			pos.y = 30;
			vel.y *= -1;
		}

	}
	
	 //________________________________________________________________________________________________
	  void aplicar(PVector fuerza) {
	    //agrega fuerza a la aceleracion
	    ace.add(fuerza);
	  }

	  //________________________________________________________________________________________________
	  // Separation
	  // metodo tiene en cuenta particulas cercanas y se alejan entre ellas
	  //metodo de referencia en ejemplos de processing
	  public void col (ArrayList<Cuadrado> cua) {
	    float desiredseparation = (tam)*2;
	    PVector sum = new PVector();
	    int count = 0;
	    // cercania
	    for (int i=0; i<cua.size(); i++) {
	      Cuadrado otro = cua.get(i);
	      float d = PVector.dist(pos, otro.pos);
	      if ((d > 0) && (d < desiredseparation)) {
	        // calcula vectores cercanos
	        PVector diff = PVector.sub(pos, otro.pos);
	        diff.normalize();
	        diff.div(d);        // ancho por distancia
	        sum.add(diff);
	        count++;
	      }
	    }
	    // redireccionar
	    if (count > 0) {
	      sum.setMag(velMax);
	      // vector de separacion
	      PVector steer = PVector.sub(sum, vel);
	      steer.limit(fuerzaMax);
	      aplicar(steer);
	    }
	  }

	  //________________________________________________________________________________________________
	
	public void mover() {
		vel.add(ace);
		vel.limit(velMax);
		pos.add(vel);
		ace.mult(0);

	}
	



}
