/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;

/**
 *
 * @author Ragnarok
 */
public class LocalMascotas {

    public int maxCapacity;
    private ArrayList<Contrato> contratos ;
    private ArrayList<Alimento> inventario ;
    private Hospedaje[] hospedaje;

    public LocalMascotas(){
        this.maxCapacity = 10;
        this.contratos = new ArrayList<Contrato>();
        this.inventario  = new ArrayList<Alimento>();
        
    }
    public void setHospedaje(Hospedaje[] hospedaje) {
        this.hospedaje = hospedaje;
    }

    public void agregarContrato(Contrato c){
        this.contratos.add(c);
        //validarHospedaje(c);
    }
    public boolean validarHospedaje(Contrato c) {
        boolean hospedar = false;
        
        for (int i = 0; i < hospedaje.length; i++) {
            if (hospedaje[i].getFecha().equals(c.getFechaInicio())) {
                if (hospedaje[i].insertar(c)) {
                    

                } else {

                }
            }

        }

        return hospedar;

    }

    public void generarHospedaje(Date fechaIni, Date fechaFin) {
        hospedaje = new Hospedaje[cantidadDias(fechaIni, fechaFin)];
        Date fecha = fechaIni;
        int i = 0;
        while (fecha.before(fechaFin) | fecha.equals(fechaFin)) {
            
            hospedaje[i] = new Hospedaje(fecha);
            fecha = siguienteDia(fecha);
            //System.out.println(fecha);
            i++;
        }
        
    }

    public Date siguienteDia(Date fecha) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }

    public int cantidadDias(Date fechaIni, Date fechaFin) {
        Calendar cal = Calendar.getInstance();
        int x = 0;
        cal.setTime(fechaIni);
        while (cal.getTime().before(fechaFin) | cal.getTime().equals(fechaFin)) {
            x++;
            cal.add(Calendar.DATE, 1);
        }
        //System.out.print(x);
        return x;
    }

    public Date HospedajeViejo() {
        Date fecha = contratos.get(0).getFechaInicio();
        for (int i = 0; i < contratos.size(); i++) {
            if (fecha.after(contratos.get(i).getFechaInicio())) {
                fecha = contratos.get(i).getFechaInicio();
            }
        }
        return fecha;
    }

    public Date HospedajeReciente() {
        Date fecha = contratos.get(0).getFechaFinal();
        for (int i = 0; i < contratos.size(); i++) {
            if (fecha.before(contratos.get(i).getFechaFinal())) {
                fecha = contratos.get(i).getFechaFinal();
            }
        }
        return fecha;
    }

    public Hospedaje[] getHospedaje() {
        return hospedaje;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<Contrato> contratos) {
        this.contratos = contratos;
    }

    public ArrayList<Alimento> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Alimento> inventario) {
        this.inventario = inventario;
    }
}
