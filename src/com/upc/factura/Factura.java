package com.upc.factura;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    private Cabecera cabecera;
    private List <Item> arregloItems;

    public Factura() {
    }

    public Factura(Cabecera cabecera) {
        this.cabecera = cabecera;
        this.arregloItems = new ArrayList<>();
    }

    public void registrarItem (Item item){
        this.arregloItems.add(item);
    }

    public double calcularTotal(){
        double suma=0;
        for (Item p:this.arregloItems){
            suma+= p.calcularSubtotal();
        }
        return suma;
    }

    public double calcularIGV (){
        return calcularTotal()*0.18;
    }

    public Cabecera getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecera cabecera) {
        this.cabecera = cabecera;
    }

    public List<Item> getArregloItems() {
        return arregloItems;
    }

    public void setArregloItems(List<Item> arregloItems) {
        this.arregloItems = arregloItems;
    }
}
