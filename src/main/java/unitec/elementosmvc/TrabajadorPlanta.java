/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

/**
 *
 * @author juan_
 */
public class TrabajadorPlanta extends Trabajador implements Nomina{
    int antiguedad;

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    @Override
    public void pagar() {
         float pago=getSueldo_base()+getSueldo_base()*getAntiguedad()*0.02f;
        System.out.println("Pago de nomina por planta para "+getNombre()
        +" es de "+pago);
    }  
}
