/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ControladorMensaje {
    
   @Autowired RepositorioMensaje repoMensa; 
    
//Caso a) Buscar Todos
    
 @GetMapping("/mensaje")
 public List<Mensaje> buscarTodos(){
     
    return repoMensa.findAll();
 }
 
 //Caso b) Buscar por id
 
 @GetMapping("/mensaje/{id}")
 public Mensaje buscarPorId(@PathVariable String id){
     Mensaje mensa=new Mensaje();
     
    return  repoMensa.findById(id).get();
 }
 //Caso c) Guardar
 @PostMapping("/mensaje")
 public Estatus guardar(@RequestBody String json)throws Exception{
     
     //Primero convertimos este string json a un obejto java
     ObjectMapper maper=new ObjectMapper();
    Mensaje mensa=  maper.readValue(json, Mensaje.class);
    repoMensa.save(mensa);
     System.out.println("este objeto se convirtio:"+mensa);
     Estatus estatus=new Estatus();
     estatus.setSuccess(true);
     estatus.setMensaje("Mensaje guardado con exito!!!");
     return estatus;
 }
 
 //Caso d: Actulizar
  @PutMapping("/mensaje")
 public Estatus actualizar(@RequestBody String json)throws Exception{
     
     //Primero convertimos este string json a un obejto java
     ObjectMapper maper=new ObjectMapper();
    Mensaje mensa=  maper.readValue(json, Mensaje.class);
    repoMensa.save(mensa);
     System.out.println("este objeto se convirtio:"+mensa);
     Estatus estatus=new Estatus();
     estatus.setSuccess(true);
     estatus.setMensaje("Mensaje guardado con exito!!!");
     return estatus;
 }
 
 //Caso e) Borrar
 @DeleteMapping("/mensaje/{id}")
 public Estatus borrarPoRId(@PathVariable String id){
     Mensaje mensa=new Mensaje();
     
     repoMensa.deleteById(id);
     Estatus e=new Estatus();
     e.setSuccess(true);
     e.setMensaje("Mensaje borrado con exito!");
     return e;
 }
    
}
