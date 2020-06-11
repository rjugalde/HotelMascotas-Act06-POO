/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Ragnarok
 */
public class Contrato {
    private int numero;
    private LocalDateTime FechaInicio;
    private LocalDateTime FechaFinal;
    private Mascota LaMascota;
    private double CostoXdia;
    private ArrayList<BitacoraAlimentacion> registros = new ArrayList<BitacoraAlimentacion>();

    public Contrato(int numero, LocalDateTime FechaInicio, LocalDateTime FechaFinal, Mascota LaMascota, double CostoXdia) {
        this.numero = numero;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.LaMascota = LaMascota;
        this.CostoXdia = CostoXdia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDateTime FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public LocalDateTime getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(LocalDateTime FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public Mascota getLaMascota() {
        return LaMascota;
    }

    public void setLaMascota(Mascota LaMascota) {
        this.LaMascota = LaMascota;
    }

    public double getCostoXdia() {
        return CostoXdia;
    }

    public void setCostoXdia(double CostoXdia) {
        this.CostoXdia = CostoXdia;
    }

    public ArrayList<BitacoraAlimentacion> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<BitacoraAlimentacion> registros) {
        this.registros = registros;
    }
       
}
