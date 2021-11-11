/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplowhile4;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EXEMPLOWHILE4 {

   
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int opcao = 0;
    
    do{
        System.out.println("Escolha uma opção:");
        System.out.println("1- Iniciar jogo");
        System.out.println("2- Ajuda");
        System.out.println("3- Sair");
        System.out.println("OPÇÃO:");
        opcao = entrada.nextInt();
    }while (opcao != 3);
        System.out.println("JOGO FINALIZADO!!!");
    }
    
}
