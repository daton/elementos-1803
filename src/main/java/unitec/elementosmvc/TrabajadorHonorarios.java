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
public class TrabajadorHonorarios extends Trabajador implements Nomina{

    @Override
    public void pagar() {
       float pago=getSueldo_base()-getSueldo_base()*0.16f;
        System.out.println("Pago de nomina por honorarios para "+getNombre()
        +" es de "+pago);
    }
    
}
