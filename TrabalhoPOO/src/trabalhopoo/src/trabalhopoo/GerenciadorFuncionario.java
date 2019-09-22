package trabalhopoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorFuncionario {
    private static int qtdFuncionario;
    private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public static void criarNovoFuncionario(){
        // Criando o Aluno
        Scanner solicitaDado = new Scanner(System.in);
        System.out.print("Informe o nome do Funcionario: ");
        String nome = solicitaDado.next();
        solicitaDado = new Scanner(System.in);
        System.out.print("Informe o codigo do Funcionario: ");
        int codigoF = Integer.parseInt(solicitaDado.next());
        System.out.print("Informe o cpf do Funcionario: ");
        int cpf = Integer.parseInt(solicitaDado.next());;
        //solicitaDado = new Scanner(System.in);
        funcionarios.add(new Funcionario(nome, codigoF, cpf));
        qtdFuncionario++;
    }
    
    public static void mostrarFuncionario(){
        for(int i=0; i < Funcionario.size(); i++){
            System.out.println("Nome: " + Funcionario.get(i).getNome() + 
                    ", Codigo: " + Funcionario.get(i).getCodigoF()) +
                    ", CPF: " + Funcionario.get(i).getCpf();
        }
    }
}
