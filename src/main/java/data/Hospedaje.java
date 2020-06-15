/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Hospedaje {

    private Date fecha;
    private Contrato[] contratos = new Contrato[10];

    ;
    
    public Hospedaje() {
        fecha = new Date();
    }

    public void imprimir() {
        System.out.println(this.fecha);
            
        for (int i = 0; i < 10; i++) {
            if(this.contratos[i] == null){
            System.out.println("Disponible");
            ;   
            }
            else{
            System.out.println(this.contratos[i].getLaMascota().getNombre());
            System.out.println(this.fecha);
            ;
        }
        }}

    public boolean insertar(Contrato c) {
        boolean h = false;
        
        while (!h) {
            for (int i = 0; i < 10; i++) {
                //System.out.println(contratos[i]);
                if (contratos[i] == null) {
                    //System.out.print("Entro a contrato vacio");
                    contratos[i] = c;
                    h = true;
                    

                } else{
                    contratos[i] = c;
                    h = true;
                }
            
        }}
        return h;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Contrato[] getContratos() {
        return contratos;
    }

    public void setContratos(Contrato[] c) {
        this.contratos = c;
    }

    public Hospedaje(Date fecha) {
        this.fecha = fecha;
    }

}
