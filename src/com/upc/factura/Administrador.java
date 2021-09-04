package com.upc.factura;

import java.util.ArrayList;
import java.util.List;

public class Administrador {

    private List<Factura> facturas;



    public Administrador() { // recordar poner new array list!!!!!!!!
        this.facturas = new ArrayList<>();
    }

    public void registarFactura (Factura factura){
        this.facturas.add(factura);
    }

    public Factura buscarFactura(int numeroFactura) {
        for (Factura p: this.facturas) {
            if (p.getCabecera().getNroFactura() == numeroFactura){
                return p;
            }
        }
        return null;
    }

    public double calcularFacturacionTotal(){
        double suma=0;
        for (Factura p:this.facturas){
            suma+=p.calcularTotal();
        }
        return suma;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
}
