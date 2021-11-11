
package exemplo.switch2;

import java.util.Scanner;


public class ExemploSwitch2 {

 
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int time;
        
        System.out.println("1- Grêmio");
        System.out.println("2- Inter");
        System.out.println("3- Santos");
        System.out.println("Digite uma opçâo de um time do seu Idolo: ");
        time = entrada.nextInt();
        
        switch (time){
            case 1:
                System.out.println("Renato gaúcho");
                break;
            case 2:
                System.out.println("Fernandão");
                break;
            case 3:
                System.out.println("Pelé");
                break;
                
            default:
                System.out.println("número inválido");
                
                  
                
                       
        }
       
        
        
            
             
      
    }
    
}
