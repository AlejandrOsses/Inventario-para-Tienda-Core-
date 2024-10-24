package com.alejandro.clases;

public class Televisor extends ProductoElectrodomestico {
	
	private int tamañoPantalla;
	private String resolucion;
	
	public Televisor(String nombre, double precio, int cantidadDisponible, 
			int tamañoPantalla, String resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucion = resolucion;
	}

	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Pulgadas: " + this.tamañoPantalla + "");
		System.out.println("Resolucion: " + this.resolucion);
	}
}
