package com.alejandro;

import com.alejandro.clases.Televisor;
import com.alejandro.clases.ComputadoraPortatil;
import com.alejandro.clases.ProductoElectrodomestico;
import com.alejandro.clases.TiendaElectronica;

public class Aplicacion {

	public static void main(String[] args) {
		
		Televisor tele = new Televisor("LG Smart TV", 1000.0, 3, 32, "Full HD" );
		ComputadoraPortatil compu = new ComputadoraPortatil("Acer Nitro 5", 1500.0, 5, "Acer", 16, 12345);
		ProductoElectrodomestico microondas = new ProductoElectrodomestico("Microondas Midea", 500.0, 1);
		TiendaElectronica tienda = new TiendaElectronica();
		
		tienda.agregarProducto(microondas);
		tienda.agregarProducto(compu);
		tienda.agregarProducto(tele);
		
		System.out.println("Productos en la tienda:");
		System.out.println();
        tienda.mostrarProductos();
        
        tienda.ventaDeProducto("LG Smart TV", 2);
        tienda.ventaDeProducto("Acer Nitro 5", 4);
        tienda.ventaDeProducto("Microondas Midea", 2);
        System.out.println();
        
        System.out.println("Actualización de Inventario:");
        tienda.mostrarProductos();
	}
}