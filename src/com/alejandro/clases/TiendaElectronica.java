package com.alejandro.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	
    private ArrayList<ProductoElectrodomestico> listaDeProductos;


    public TiendaElectronica() {
        listaDeProductos = new ArrayList<>();
    }

    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
    }


    public void mostrarProductos() {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            producto.mostrarInformacion();
            System.out.println();
        }
    }
    
    public ProductoElectrodomestico buscarProducto(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void ventaDeProducto(String nombreProducto, int cantidad) {
        ProductoElectrodomestico producto = buscarProducto(nombreProducto);
        if (producto != null) {
            int cantidadDisponible = producto.getCantidadDisponible();
            if (cantidadDisponible > cantidad) {
                producto.setCantidadDisponible(cantidadDisponible - cantidad);
                System.out.println("Venta realizada. Se vendieron " + cantidad + " unidades de " + nombreProducto);
            } 
            else if (cantidadDisponible == 0) {
                System.out.println("Producto agotado.");
            } 
            else {
                System.out.println("No hay stock. Solo hay " + cantidadDisponible + " unidades disponibles.");
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
