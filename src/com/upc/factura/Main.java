package com.upc.factura;

import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto("003","Helado Mixto",2.5);
        Producto producto1 = new Producto("002","Helado de Vainilla",2.0);
        Producto producto2 = new Producto("001","Helado de Chocolate",3.0);
        Producto producto3 = new Producto("004","Helado en Vaso",5.0);
        Producto producto4 = new Producto("005","Super Cono de Vainilla",2.5);
        Producto producto5 = new Producto("006","Super Cono de Chocolate",3.0);
        Producto producto6 = new Producto("007","SuperCono Mixto", 4.0);


        Item item1 = new Item(2,producto1);
        Item item2 = new Item(1,producto2);
        Item item3 = new Item(3,producto3);
        Item item = new Item(1,producto);
        Item item4 = new Item(4,producto4);
        Item item5 = new Item(2,producto5);
        Item item6 = new Item(3,producto6);

        Cabecera cabecera = new Cabecera(001,1046879444,"Surco","03/09/2021");
        Cabecera cabecera1 = new Cabecera(002,1047437265,"Villa el Salvador","03/09/2021");
        Cabecera cabecera2 = new Cabecera(003,10086318,"San Borja","04/09/2021");

        Factura factura1 = new Factura(cabecera);
        factura1.registrarItem(item1);
        factura1.registrarItem(item2);
        factura1.registrarItem(item3);

        Factura factura4= new Factura(cabecera1);
        factura4.registrarItem(item);
        factura4.registrarItem(item3);
        factura4.registrarItem(item4);

        Factura factura2 = new Factura(cabecera2);
        factura2.registrarItem(item5);
        factura2.registrarItem(item6);

        System.out.println("Factura "+ factura1.getCabecera().getNroFactura());
        System.out.println("Total: "+factura1.calcularTotal());
        System.out.println("Igv: "+factura1.calcularIGV());

        Administrador administrador = new Administrador();
        administrador.registarFactura(factura4);
        administrador.registarFactura(factura1);
        administrador.registarFactura(factura2);

        Factura fac = administrador.buscarFactura(001);
        if (fac!= null) {
            System.out.println("Factura encontrada, nro: " + fac.getCabecera().getNroFactura() + "el total es de: " + fac.calcularTotal());
        }else System.out.println("Factura no encontrada");

        System.out.println("El total de toda la facturación es: "+ administrador.calcularFacturacionTotal());
    }
}
