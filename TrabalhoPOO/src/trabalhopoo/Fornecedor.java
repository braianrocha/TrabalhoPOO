package trabalhopoo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Fornecedor {
    private int id;
    private String nome;
    private String cpfCnpj;
    private String tipoProduto;
    private String contato;
    private String produto;
    private String endereco;
    private boolean ativo;

    public Fornecedor(int id,String nome, String cpfCnpj, String tipoProduto, String contato, String produto, String endereco, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.tipoProduto = tipoProduto;
        this.contato = contato;
        this.produto = produto;
        this.endereco = endereco;
        this.ativo = ativo;
    }
    private static List<Fornecedor> fornecedor = new ArrayList<>();
    private static int qtdFornecedor;

    public static void novoFornecedor() {

        Scanner solicitaDado = new Scanner(System.in);

        System.out.println("Informe o nome para Identificar seu Fornecedor: ");
        int id = solicitaDado.nextInt();
        
        System.out.println("Informe o Nome do Fornecedor: ");
        String nome = solicitaDado.next();

        System.out.println("Informe o CPF ou o CNPJ: ");
        String cpfCnpj = solicitaDado.next();

        System.out.println("Informe o Endereco: ");
        String endereco = solicitaDado.next();

        System.out.println("Informe os dados para contato: ");
        String contato = solicitaDado.next();

        System.out.println("Informe o nome do Produto: ");
        String produto = solicitaDado.next();

        System.out.println("Informe o tipo do Produto: ");
        String tipoProduto = solicitaDado.next();

        System.out.println("O Forncedor encontra-se ativo? ");
        boolean ativo = solicitaDado.nextBoolean();

        getFornecedor().add(new Fornecedor(id,nome, cpfCnpj, tipoProduto, contato, produto, endereco, ativo));
        qtdFornecedor++;

    }

    public static void mostrarFornecedor() {
        for (int i = 0; i < fornecedor.size(); i++) {
            System.out.println("Identificador do Fornecedor: " + fornecedor.get(i).getId()
                    +"\nNome: " + fornecedor.get(i).getNome()
                    + "\nCPF / CNPJ: " + fornecedor.get(i).getCpfCnpj()
                    + "\nTipo do Produto: " + fornecedor.get(i).getTipoProduto()
                    + "\nContato: " + fornecedor.get(i).getContato()
                    + "\nEndereco: " + fornecedor.get(i).getEndereco());
        }
    }
    //public buscaFornecedor buscar(String cpfCnpj)
    
    
    
    
    
    
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public static List<Fornecedor> getFornecedor() {
        return fornecedor;
    }

    public static void setFornecedor(List<Fornecedor> aFornecedor) {
        fornecedor = aFornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
