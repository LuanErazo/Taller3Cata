package taller3;

import processing.core.PApplet;

public class Main extends PApplet {
	
	Logica log;

	public static void main(String[] args) {
		main("taller3.Main");
	}
	
	@Override
	public void settings() {
		size(1200, 700, P3D);
	}
	
	@Override
	public void setup() {
		colorMode(HSB,360,80,80);
		log= new Logica(this);
		ortho();
	}
	
	
	@Override
	public void draw() {
		fill(0,0,0,55);
		noStroke();
		rect(0,0,1200,700);
		
		log.pintar();
	}
	
	
	@Override
	public void mousePressed() {
		// TODO Auto-generated method stub
		super.mousePressed();
	}

}
