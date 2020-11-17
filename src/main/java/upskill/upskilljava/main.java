/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.upskilljava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prp
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String Grupos[][] = {
            {  
                "Aníbal Rafael Monteiro Farraia",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            }, 
            {  
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            },
            {  
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            },            
            {  
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            }
        };
        
        for (int x = 0; x < Grupos.length; x ++) {
            String Grupo[] = Grupos[x]; 
            System.out.println( "Grupo " + (x+1));
            for (int y = 0; y < Grupo.length; y ++) {
                String formando = Grupo[y];
                System.out.println( "\t" + formando );
            }
            System.out.println("-------");
        }    
    }
}
