/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Ragnarok
 */
public class LocalMascotas {
    public int maxCapacity;
    private ArrayList<Contrato> contratos = new ArrayList<Contrato>();
    private ArrayList<Alimento> inventario = new ArrayList<Alimento>();

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
