package trabalhopoo;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

    public class Estoque extends Produto{

        private String fabricante;
        private int quantidade;
        private String validade;
        private String dataEntrada;
        private String dataCompra;
        private double valorUnitarioVenda;
        private double valorNota;
            
            public Estoque(String nome, String tipoProduto, String codProduto, String codBarras, double preço, int qtdMinima, boolean ativo, String fabricante, int quantidade, String validade, String dataEntrada, String dataCompra, double valorUnitarioVenda, double valorNota){
                super(nome, tipoProduto, codProduto, codBarras, preço, qtdMinima, false);
                this.fabricante = fabricante;
                this.quantidade = quantidade;
                this.validade = validade;
                this.dataEntrada = dataEntrada;
                this.dataCompra = dataCompra;
                this.valorUnitarioVenda = valorUnitarioVenda;
                this.valorNota = valorNota;
                
            }
    
        private static int qtdProdutos;
        private static List<Estoque> produtos = new ArrayList<>();
    
        public static void InsereNovoProduto(){

            Scanner solicitaDado = new Scanner(System.in);
            System.out.print("Informe o nome do Produto: ");
            String nome = solicitaDado.next();

            solicitaDado = new Scanner(System.in);
            System.out.print("Informe o tipo do produto: ");
            String tipoProduto = solicitaDado.next();

            solicitaDado = new Scanner(System.in);
            System.out.print("Informe o codigo do Produto: ");
            String codProduto = solicitaDado.next();

            solicitaDado = new Scanner(System.in);
            System.out.print("Informe o codigo de barras do produto: ");
            String codBarras = solicitaDado.next();

            solicitaDado = new Scanner(System.in);
            System.out.print("Informe o preço do produto: ");
            double preço = solicitaDado.nextDouble();

            solicitaDado = new Scanner(System.in);
            System.out.print("Informe a quantidade minima deste produto: ");
            int qtdMinima = solicitaDado.nextInt();

            solicitaDado = new Scanner(System.in);
            System.out.print("Informe a a situaçao do produto: ");
            boolean ativo = solicitaDado.hasNextBoolean();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Informe o fabricante do Produto: ");
            String fabricante = solicitaDado.next();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Informe a quantidade total deste produto: ");
            int quantidade = solicitaDado.nextInt();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Informe a validade deste produto: ");
            String validade = solicitaDado.next();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Informe a data de entrada deste produto: ");
            String dataEntrada = solicitaDado.next();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Informe a data da compra deste produto: ");
            String dataCompra = solicitaDado.next();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Informe o valor de cada unidade deste produto: ");
            double valorUnitarioVenda = solicitaDado.nextDouble();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Informe o valor da nota: ");
            double valorNota = solicitaDado.nextDouble();

            produtos.add(new Estoque(nome, tipoProduto, codProduto, codBarras, preço, qtdMinima, ativo, fabricante, quantidade, validade, dataEntrada, dataCompra, valorUnitarioVenda, valorNota));
            qtdProdutos++;
    }
 public static void mostrarListaProdutos(){
        for(int i=0; i< produtos.size(); i++){
            System.out.println("Nome: " + produtos.get(i).getNome()
                   + "\nTipo do Produto: " + produtos.get(i).getTipoProduto()
                   + "\nCodigo do Produto: " + produtos.get(i).getCodProduto()
                   + "\nCodigo de barras: " + produtos.get(i).getCodBarras()
                   + "\nPreço: " + produtos.get(i).getPreço()
                   + "\nQuantidade minima: " + produtos.get(i).getQtdMinima()
                   + "\nFabricante: " + produtos.get(i).getFabricante()
                   + "\nQuantidade: " + produtos.get(i).getQuantidade()
                   + "\nValidade: " + produtos.get(i).getValidade()
                   + "\nData de Entrada: " + produtos.get(i).getDataEntrada()
                   + "\nData da Compra: " + produtos.get(i).getDataCompra()
                   + "\nValor Unitario da Venda: " + produtos.get(i).getValorUnitarioVenda()
                   + "\nValor da Nota: " + produtos.get(i).getValorNota());
                 
        }
    }
  
    public static void removerProduto(){
            Scanner solicitaDado = new Scanner(System.in);
            System.out.print("Informe o código do Produto: ");
            String nome = solicitaDado.next();
            
        for(int i=0; i< produtos.size(); i++){
                if(produtos.get(i).getCodProduto().equals(nome)){
                    produtos.remove(i);
                }
        }
    }

    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the validade
     */
    public String getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(String validade) {
        this.validade = validade;
    }

    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the dataCompra
     */
    public String getDataCompra() {
        return dataCompra;
    }

    /**
     * @param dataCompra the dataCompra to set
     */
    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    /**
     * @return the valorUnitarioVenda
     */
    public double getValorUnitarioVenda() {
        return valorUnitarioVenda;
    }

    /**
     * @param valorUnitarioVenda the valorUnitarioVenda to set
     */
    public void setValorUnitarioVenda(double valorUnitarioVenda) {
        this.valorUnitarioVenda = valorUnitarioVenda;
    }

    /**
     * @return the valorNota
     */
    public double getValorNota() {
        return valorNota;
    }

    /**
     * @param valorNota the valorNota to set
     */
    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }
    }