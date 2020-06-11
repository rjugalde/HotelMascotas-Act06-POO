/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ragnarok
 */
class BitacoraAlimentacion {
    private LocalDateTime fecha;
    private LocalDateTime hora;
    private EstadoAlimentacion estado;

    public BitacoraAlimentacion(LocalDateTime fecha, LocalDateTime hora, EstadoAlimentacion estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public EstadoAlimentacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoAlimentacion estado) {
        this.estado = estado;
    }
    
    
    
}
