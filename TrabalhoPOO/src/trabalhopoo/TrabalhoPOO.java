/*
Trabalho de POO - 2019/2
                    Sistema de Vendas
                        Grupo 
                    Braian Luz Rocha
                    Diego Santos 
                    Gabrielle Cristina
                    Jean Marcos 
                    Nilo Sa Mayrink  
                    Ruan Pablo Gomes

                    
 */
package trabalhopoo;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import java.util.Scanner;

public class TrabalhoPOO {
    
    public static void main(String[] args) {
        
        String menu = "\n1 - Inserir novo produto\n"
                + "2 - Mostrar lista de produtos\n"
                + "3 - Remover produto\n";
        
        int opcao = 0;
        
        while(opcao != 7){
        System.out.println(menu);
        Scanner solicitaDado = new Scanner(System.in);
        opcao = solicitaDado.nextInt();     
         switch(opcao){
         case 1: Estoque.InsereNovoProduto();
         break;
         case 2: Estoque.mostrarListaProdutos();
         break;
//         case 3: GerenciadorProfessor.criarNovoProfessor();
//         break;
         
        
        
        
} 
        }
    }
}
