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
    
    public Hospedaje(){
        
    }

    public boolean insertar(Contrato c){
        boolean h = false;
        while(!h){
            for(int i = 0; i <10; i++ ){
            if(contratos[i].getLaMascota().equals("")){
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
