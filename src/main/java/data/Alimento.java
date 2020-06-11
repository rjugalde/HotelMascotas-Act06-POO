/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Ragnarok
 */
public class Alimento {
    private int Codigo;
    private String Nombre;
    private String Marca;
    private double CantidadKilos;

    public Alimento(int Codigo, String Nombre, String Marca) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Marca = Marca;
        CantidadKilos = 0;
    }

    public Alimento(int Codigo, String Nombre, String Marca, double CantidadKilos) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.CantidadKilos = CantidadKilos;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getCantidadKilos() {
        return CantidadKilos;
    }

    public void setCantidadKilos(double CantidadKilos) {
        this.CantidadKilos = CantidadKilos;
    }
    
    
    
    
}
