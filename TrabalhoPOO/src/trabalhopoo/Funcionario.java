package trabalhopoo;


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
