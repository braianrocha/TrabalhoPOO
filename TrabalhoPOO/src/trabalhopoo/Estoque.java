package trabalhopoo;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

    public class Estoque{
        private String fabricante;
        private int quantidade;
        private String validade;
        private String dataEntrada;
        private String dataCompra;
        private double valorUnitarioVenda;
        private double valorNota;
            
            public Estoque(String fabricante, int quantidade, String validade, String dataEntrada, String dataCompra, double valorUnitarioVenda, double valorNota){                
                this.fabricante = fabricante;
                this.quantidade = quantidade;
                this.validade = validade;
                this.dataEntrada = dataEntrada;
                this.dataCompra = dataCompra;
                this.valorUnitarioVenda = valorUnitarioVenda;
                this.valorNota = valorNota;
                
            }
    
        private static int qtdProdutos;
        private static List<Produto> produtos = new ArrayList<>();
    
        public static void InsereNovoProduto(){

            Scanner solicitaDado = new Scanner(System.in);
            System.out.print("Nome do Produto: ");
            String nome = solicitaDado.nextLine();

            solicitaDado = new Scanner(System.in);
            System.out.print("Tipo do produto: ");
            String tipoProduto = solicitaDado.nextLine();

            solicitaDado = new Scanner(System.in);
            System.out.print("Codigo do Produto: ");
            String codProduto = solicitaDado.nextLine();

            solicitaDado = new Scanner(System.in);
            System.out.print("Codigo de barras do produto: ");
            String codBarras = solicitaDado.nextLine();

            solicitaDado = new Scanner(System.in);
            System.out.print("Informe o preço do produto: ");
            double preço = solicitaDado.nextDouble();

            solicitaDado = new Scanner(System.in);
            System.out.print("Informe a quantidade minima deste produto: ");
            int qtdMinima = solicitaDado.nextInt();

 
            boolean ativo = true;
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Informe o fabricante do Produto: ");
            String fabricante = solicitaDado.nextLine();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Quantidade total deste produto: ");
            int quantidade = solicitaDado.nextInt();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Validade deste produto: ");
            String validade = solicitaDado.nextLine();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Data de entrada deste produto: ");
            String dataEntrada = solicitaDado.nextLine();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Data da compra deste produto: ");
            String dataCompra = solicitaDado.nextLine();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Valor de cada unidade deste produto: ");
            double valorUnitarioVenda = solicitaDado.nextDouble();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Valor da nota: ");
            double valorNota = solicitaDado.nextDouble();

            produtos.add(new Produto(nome, tipoProduto, codProduto, codBarras, preço, qtdMinima, ativo, fabricante, quantidade, validade, dataEntrada, dataCompra, valorUnitarioVenda, valorNota));
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
    
    
    public static Produto buscaProduto(int cod){
        for(int i=0; i< produtos.size(); i++){
                if(produtos.get(i).getCodProduto().equals(cod)){
                    if( !(produtos.get(i).isAtivo()) ||  produtos.get(i).getQuantidade() < 1 ){
                        return null;
                    }else{
                    return produtos.get(i);    
                    }
                }
        }
            return null;
    }
    
        public static Produto insereProdutoVenda(int cod, int quantidade){
        for(int i=0; i< produtos.size(); i++){
                if(produtos.get(i).getCodProduto().equals(cod)){
                    if( !(produtos.get(i).isAtivo()) ||  produtos.get(i).getQuantidade() < quantidade ){
                        return null;
                    }else{
                    return produtos.get(i);    
                    }
                }
        }
            return null;
    }
    
    
       public static Produto removeProdutoEstoque(List<Produto> remover){
        for(int i=0; i< remover.size(); i++){

            
//                if(produtos.get(i).getCodProduto().equals(cod)){
//                    if( !(produtos.get(i).isAtivo()) ||  produtos.get(i).getQuantidade() < 1 ){
//                        return null;
//                    }else{
//                    return produtos.get(i);    
//                    }
//                }
                
        }
            return null;
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
