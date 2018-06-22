/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author campitos
 */
@SpringUI
public class MiUI extends UI{

    //Ponemos como atributo el repo
    @Autowired RepositorioMensaje repoMensa;
    
    @Override
    protected void init(VaadinRequest request) {
   
        VerticalLayout layout=new VerticalLayout();
        Label etiqueta=new Label("Bienvenido a mi aplicacion!!");
        etiqueta.addStyleName(ValoTheme.LABEL_H2); 
        
        TextField texto=new TextField();
        texto.setPlaceholder("cuerpo del mensaje");
        
        Button boton=new Button("guardar mensaje");
        boton.addStyleName(ValoTheme.BUTTON_DANGER);
        
        //Manejamos el evento de tipo boton
        boton.addClickListener(algo->{
          String cuerpo=  texto.getValue();
          //Guardamos
            repoMensa.save(new Mensaje(cuerpo));
           //Le comunicamos al usuario con un mensajito que se guardo
           Notification.show("Mensaje guardado ", Notification.Type.ERROR_MESSAGE);
             }
        );
        
        //Caso: Buscar todos
        Grid<Mensaje> grid = new Grid<>();
  
        grid.setItems(repoMensa.findAll()); 

       grid.addColumn(Mensaje::getId).setCaption("id");
       grid.addColumn(Mensaje::getCuerpo).setCaption("cuerpo");
       

        //Agregamos la etiqueta y el boton a el layout
        layout.addComponent(etiqueta);
        layout.addComponent(texto);
        layout.addComponent(boton);
          //Agregamos dicha compnente a nuestro layout
         layout.addComponent(grid);
          
        //Finalmente agregamos el layout al contenedor principal de init
         setContent(layout);
        
        
    }    
}
