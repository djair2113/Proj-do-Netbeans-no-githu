/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacao;

/**
 *
 * @author Admin
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("meu projeto main rodou:");
        
            Naruto H1  = new Naruto("nivel 1");
            Naruto H2 =  new Naruto("nivel 2");
            Naruto H3 =  new Naruto("nivel 3");
            Naruto H4 =  new Naruto("nivel 4");
            
            H1.Herarquia = "Genin";
            H2.Herarquia = "Shunin";
            H3.Herarquia = "Jounin";
            H4.Herarquia = "Houkage";
            
            System.out.println(H1.Herarquia);
            System.out.println(H2.Herarquia);
            System.out.println(H3.Herarquia);
            System.out.println(H4.Herarquia);
            
            System.out.println(Naruto.Shinobi);
            //  adicionei um atributo statico para classe naruto que representa um aniem
            
            System.out.println(H1.Herarquia  + "Missao"  + H1.Missao);
            System.out.println(H2.Herarquia  + "Missao"  + H2.Missao);
            System.out.println(H3.Herarquia  + "Missao"  + H3.Missao);
            System.out.println(H4.Herarquia  + "Missao"  + H4.Missao);
            
            // trata se de uma Hirarquia de um ninja onde tem 4 niveis cada nivel
            // tem sua propro nivel de  missao.
            
           
            
            
            
            
            
            
            
            
        
                
    }
    
}
