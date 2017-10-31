package taller3;

import java.util.ArrayList;

import circulo.CirDos;
import circulo.CirTres;
import circulo.CirUno;
import circulo.Circulo;
import cuadrado.CuaDos;
import cuadrado.CuaTres;
import cuadrado.CuaUno;
import cuadrado.Cuadrado;
import poligono.PolDos;
import poligono.PolUno;
import poligono.Poligono;
import processing.core.PApplet;

public class Logica {
	private PApplet app;

	private ArrayList<Circulo> cir1;
	private ArrayList<Circulo> cir2;
	private ArrayList<Circulo> cir3;
	
	private ArrayList<Cuadrado> cua1;
	private ArrayList<Cuadrado> cua2;
	private ArrayList<Cuadrado> cua3;
	
	private ArrayList<Poligono> pol1;
	private ArrayList<Poligono> pol2;

	public Logica(PApplet app) {
		this.app = app;
		cir1 = new ArrayList<>();
		cir2 = new ArrayList<>();
		cir3 = new ArrayList<>();
		
		cua1 = new ArrayList<>();
		cua2 = new ArrayList<>();
		cua3 = new ArrayList<>();
		
		pol1 = new ArrayList<>();
		pol2 = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			cir1.add(new CirUno(app));
			cir2.add(new CirDos(app));
			cir3.add(new CirTres(app));
			cua1.add(new CuaUno(app));
			cua2.add(new CuaDos(app));
			cua3.add(new CuaTres(app));
			pol1.add(new PolUno(app));
			pol2.add(new PolDos(app));
		}

	}

	public void pintar() {
		
		app.fill(0);
		app.stroke(255);
		app.strokeWeight(2);
		app.rect(0, 0, 230, 700,50);
		
		for (int i = 0; i < cir1.size(); i++) {
			cir1.get(i).pintar();
			cir1.get(i).col(cir1);
			cir1.get(i).col(cir2);
			cir1.get(i).col(cir3);
		}
		
		for (int i = 0; i < cir2.size(); i++) {
			cir2.get(i).pintar();
			cir2.get(i).col(cir2);
			cir2.get(i).col(cir1);
			cir2.get(i).col(cir3);
		}
		
		for (int i = 0; i < cir3.size(); i++) {
			cir3.get(i).pintar();
			cir3.get(i).col(cir3);
			cir3.get(i).col(cir1);
			cir3.get(i).col(cir2);
		}

		for (int i = 0; i < cua1.size(); i++) {
			cua1.get(i).pintar();
			cua1.get(i).col(cua1);
			cua1.get(i).col(cua2);
			cua1.get(i).col(cua3);
		}
		for (int i = 0; i < cua2.size(); i++) {
			cua2.get(i).pintar();
			cua2.get(i).col(cua1);
			cua2.get(i).col(cua2);
			cua2.get(i).col(cua3);
		}
		
		for (int i = 0; i < cua3.size(); i++) {
			cua3.get(i).pintar();
			cua3.get(i).col(cua1);
			cua3.get(i).col(cua2);
			cua3.get(i).col(cua3);
		}
		
		for (int i = 0; i < pol1.size(); i++) {
			pol1.get(i).pintar();
			pol1.get(i).col(pol1);
			pol1.get(i).col(pol2);
		}
		
		for (int i = 0; i < pol2.size(); i++) {
			pol2.get(i).pintar();
			pol2.get(i).col(pol2);
			pol2.get(i).col(pol1);
			
		}
	}

}
