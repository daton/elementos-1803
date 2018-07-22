/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import org.springframework.data.annotation.Id;

/**
 *
 * @author juan_
 */
public abstract class Trabajador{
    
    @Id String id;

    @Override
    public String toString() {
        return "Trabajador{" + "id=" + id + ", nombre=" + nombre + ", sueldo_base=" + sueldo_base + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    String nombre;
    float sueldo_base;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(float sueldo_base) {
        this.sueldo_base = sueldo_base;
    }
}
