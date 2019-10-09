package trabalhopoo;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class GerenciadorEstoque{        
    
        private static int qtdProdutos;
        private static List<Produto> produtos = new ArrayList<>();
    
        
        public static void criaProdutoAleatorio(){
            
            String nome = "Coca cola";
            String tipoProduto = "bebidas";
            String codProduto = "123";
            String codBarras = "392424";
            double preço = 4.50;
            int qtdMinima = 5;
            boolean ativo = true;
            String fabricante = "ambev";
            int quantidade = 50;
            String validade = "05/12/2022";
            String dataEntrada = "05/12/2019";
            String dataCompra = "05/06/2019";
            double valorUnitarioVenda = 7.00;
            double valorNota = 500;
            
            produtos.add(new Produto(nome, tipoProduto, codProduto, codBarras, preço, qtdMinima, ativo, fabricante, quantidade, validade, dataEntrada, dataCompra, valorUnitarioVenda, valorNota));
            qtdProdutos++;
            
        }
        
        
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
    
    
       public static  void removeProdutoEstoque(String codProduto , Integer quantidadeProduto){
       
           for(int i=0; i< produtos.size(); i++){
                if(produtos.get(i).getCodProduto().equals(codProduto)){
                    if( produtos.get(i).getQuantidade() == quantidadeProduto ){
                        produtos.get(i).setQuantidade( produtos.get(i).getQuantidade() - quantidadeProduto); 
                    }
                }
                
        }
            
    }
    }
