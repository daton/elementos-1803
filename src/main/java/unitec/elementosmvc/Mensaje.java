/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import org.springframework.data.annotation.Id;

/**
 *
 * @author campitos
 */

public class Mensaje {
    
    @Id
    private String id;
    
   
    private LocalDate fecha;
    
        private String cuerpo;

    public Mensaje(String id, LocalDate fecha, String cuerpo) {
        this.id = id;
        this.fecha = fecha;
        this.cuerpo = cuerpo;
    }
    

    public Mensaje(LocalDate fecha, String cuerpo) {
        this.fecha = fecha;
        this.cuerpo = cuerpo;
    }


    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", fecha=" + fecha + ", cuerpo=" + cuerpo + '}';
    }

    public Mensaje(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Mensaje() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
