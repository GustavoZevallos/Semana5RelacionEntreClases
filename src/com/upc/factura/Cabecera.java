package com.upc.factura;

public class Cabecera {

    private int nroFactura;
    private int ruc;
    private String direccion;
    private String fecha;

    public Cabecera() {
    }

    public Cabecera(int nroFactura, int ruc, String direccion, String fecha) {
        this.nroFactura = nroFactura;
        this.ruc = ruc;
        this.direccion = direccion;
        this.fecha = fecha;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
