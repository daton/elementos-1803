package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosMvcApplication implements CommandLineRunner {

    @Autowired
    ServicioTarjeta servicio;
    @Autowired
    RepositorioTrabajador repotra;

    public static void main(String[] args) {
        SpringApplication.run(ElementosMvcApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

       // LocalDate fecha = LocalDate.now();
        // repoMensaje.save(new Mensaje("hola",fecha,"cerdito"));

        //buscar todos los mensajes ya
      //   for( Mensaje mensa:   repoMensaje.findAll()){
      //    System.out.println(mensa);
   // }
         
        //Buscar por id 
          
       //  System.out.println(repoMensaje.findByCuerpo("cerdito"));
       
       //Sigue borrar
     //  Mensaje m=new Mensaje();
     //  m.setId("hola"); 
     //  repoMensaje.delete(m);
       
        TrabajadorPlanta tp=new TrabajadorPlanta();
        tp.setAntiguedad(2);
        tp.setId("primero");
        tp.setNombre("Juan");
        tp.setSueldo_base(4500);
        
        TrabajadorHonorarios t=new TrabajadorHonorarios();
        t.setNombre("Ana");
        t.setSueldo_base(44500);
      // repotra.save(t);
        System.out.println("Antiguedad "+ repotra.findAll());
        
       for(Trabajador tt:repotra.findAll()){
           if(tt instanceof TrabajadorPlanta){
               System.out.println("antiuedd "+((TrabajadorPlanta) tt).getAntiguedad());  
           }
           System.out.println("sueldo "+tt.getSueldo_base()); 
       }
        
    }
}
