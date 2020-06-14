/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;

/**
 *
 * @author Ragnarok
 */
public class Mascota implements Serializable {
    private int id;
    private String nombre;
    private String raza;
    private Dueno elDueno;
    private double cantidad;

    public Mascota(int id, String nombre, String raza, Dueno elDueno, double cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.elDueno = elDueno;
        this.cantidad = cantidad;
    }

    public Mascota(int id, String nombre, String raza, Dueno elDueno) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.elDueno = elDueno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Dueno getElDueno() {
        return elDueno;
    }

    public void setElDueno(Dueno elDueno) {
        this.elDueno = elDueno;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", elDueno=" + elDueno + ", cantidad=" + cantidad + '}';
    }
    
    
}
