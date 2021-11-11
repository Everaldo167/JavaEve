
package exemplowhile3;

import java.util.Scanner;


public class ExemploWHILE3 {

    
    public static void main(String[] args) {
   boolean continuar=true;
   int opcao;
   Scanner entrada = new Scanner (System.in);
   do
   {
       System.out.println("\t\tMenu de opções do curso Técnico em Informatica:");
       System.out.println("\t1. ver o Menu");
       System.out.println("\t2. Ler o Menu");
       System.out.println("\t3. Repetir o menu");
       System.out.println("\t4. Tudo de novo");
       System.out.println("\t5. Não li pode repetir");
       System.out.println("\t6. sair");
       
       System.out.println("\n insira as opções");
       opcao = entrada.nextInt();
       
      if (opcao == 0) {
          continuar = false;
          System.out.println("Programa finalizado");
          
      }
      else {
          System.out.println("\n\n\n\n\n\n");
      }
   } while (continuar);
    }
}
   
   
           
    
    

