/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TechSpot.modelo;

import java.io.InputStream;

/**
 *
 * @author Claudio Duhart
 */
public class Producto {
    int id;
    String nombres;
    InputStream foto;
    String Descripcion;
    double Precio;
    int Stock;
    
    public Producto(){
        
    }
    
    public Producto (int id, String nombres, InputStream foto, String Descripcion, double Precio, int Stock ){
        this.id = id;
        this.foto = foto;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Stock = Stock;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public InputStream getFoto() {
        return foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    
    
    
}
