package trabalhopoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Funcionario {

    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    private String nome;
    private int codigoF;
    private int cpf;
    
    Funcionario(){
        nome = " ";
        codigoF = 0;
        cpf = 0;
    }
    
    Funcionario (String x,  int valorCodigo, int valorCPF){
        nome = x;
        codigoF = valorCodigo;
        cpf = valorCPF;
    }
    
    private static int qtdFuncionario;
    private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public static void criarNovoFuncionario(){
        
        Scanner solicitaDado = new Scanner(System.in);
        System.out.print("Informe o nome do Funcionario: ");
        String nome = solicitaDado.next();
        
        solicitaDado = new Scanner(System.in);
        System.out.print("Informe o codigo do Funcionario: ");
        int codigoF = solicitaDado.nextInt();
        
        solicitaDado = new Scanner(System.in);
        System.out.print("Informe o cpf do Funcionario: ");
        int cpf = solicitaDado.nextInt();
      
        funcionarios.add(new Funcionario(nome, codigoF, cpf));
        qtdFuncionario++;
    }
    
    
    public static void mostrarFuncionario(){
       for(int i=0; i < funcionarios.size(); i++){
           System.out.println("Nome: " + funcionarios.get(i).getNome() + 
                               ", Codigo: " + funcionarios.get(i).getCodigoF() +
                               ", CPF: " + funcionarios.get(i).getCpf());
       }
   }
       
       
       
       
       
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getCodigoF() {
        return codigoF;
    }

  
    public void setCodigoF(int codigoF) {
        this.codigoF = codigoF;
    }

   
    public int getCpf() {
        return cpf;
    }

    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}