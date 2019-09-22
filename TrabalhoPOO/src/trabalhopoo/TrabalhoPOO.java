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
        
        String menu = "\n1 - Inserir Funcionario\n"
                + "2 - Mostrar Funcionario\n"
                + "3 - Inserir novo produto\n"
                + "4 - Mostrar lista de produtos\n"
                + "5 - Remover produto\n";
        
        int opcao = 0;
        
        while(opcao != 7){
        System.out.println(menu);
        Scanner solicitaDado = new Scanner(System.in);
        opcao = solicitaDado.nextInt();     
         switch(opcao){
         case 1: Funcionario.criarNovoFuncionario(); 
         break;
         case 2: Funcionario.mostrarFuncionario();
         break;
         case 3: Estoque.InsereNovoProduto();
         break;
         case 4: Estoque.mostrarListaProdutos();
         break;
         case 5: Estoque.removerProduto();
         break;
       
        
        
        
} 
        }
    }
}
