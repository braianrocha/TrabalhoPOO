package trabalhopoo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

    public class Venda {
        private int codVenda;
        private String formaPagamento;
        private String dataVenda;
        private double valorVenda;
        
        public Venda(){
            codVenda = 0;
            formaPagamento = "";
            dataVenda = "";
            valorVenda = 0;
        }
        public Venda( String formaPag, String datVen){
//            codigo tem que ser randomico por enquanto
//            codVenda = cod;
            formaPagamento = formaPag;
            dataVenda = datVen;
            
        }
        private static int qtdProdutos;
        private static int qtdVendas;
        private static List<Venda> vendas = new ArrayList<Venda>();
        private static List<Produto> produtosVenda = new ArrayList<Produto>();
 
        public static void criarVenda(){
            Scanner solicitaDado = new Scanner(System.in);                                 
            System.out.println("Forma de pagamento");
            String formaPagamento = solicitaDado.next();
            
            solicitaDado = new Scanner(System.in);
            System.out.println("Insira da data da venda");
            String dataVenda = solicitaDado.next();
            
            
        
            vendas.add(new Venda( formaPagamento, dataVenda));
            qtdVendas++;
            Venda.ListaProdutoVenda();
          
            
            }
            
        public static void ListaProdutoVenda(){
              Scanner solicitaDado = new Scanner(System.in);
              System.out.print("Informe o codigo do produto");
              int codigo = solicitaDado.nextInt();
              
              System.out.print("Informe a quantidade do produto");
              int quantidade = solicitaDado.nextInt();
              
              for(int i=0; i<produtosVenda.size(); i++)  {
              if(produtosVenda.get(i).getQuantidade() > quantidade){
                  produtosVenda.add(GerenciadorEstoque.insereProdutoVenda(codigo, quantidade));
              }else{
                  System.out.println("Produto Indisponivel");
                  
              }
              
              Venda.CalculaValorTotal(quantidade);
                
            }
             // remove o produto depois da compra ter sido realizada.
//            produtosVenda.add(GerenciadorEstoque.removeProdutoEstoque(produtosVenda));
               qtdProdutos++;
          }
//     Função esta incorreta.               
     public static Double CalculaValorTotal(int quant) {
             double valorTo = 0;
             for(int i=0; i<produtosVenda.size(); i++){            
             valorTo += produtosVenda.get(i).getPreço()*quant;
             }
         return valorTo; 
       }
        
                
        public static void mostrarVenda(){
            for(int i = 0; i< vendas.size(); i++){
                System.out.println("Forma de Pagamento: "+vendas.get(i).getFormaPagamento()
                       +"\nData de emissão: "+vendas.get(i).getDataVenda());
//          Corrigir: não está mostrando a lista de produtos.          
               for(int x = 0; x< produtosVenda.size(); x++){   
                    System.out.println("Nome do Produto: "+produtosVenda.get(x).getNome()
                          +"Quantidade de produtos: "+produtosVenda.get(x).getQuantidade()
                          +"Codigo do produto: "+ produtosVenda.get(x).getCodProduto());
                            
                }              
            }
      }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public static int getQtdVendas() {
        return qtdVendas;
    }

    public static void setQtdVendas(int qtdVendas) {
        Venda.qtdVendas = qtdVendas;
    }

    public static List<Venda> getVendas() {
        return vendas;
    }

    public static void setVendas(List<Venda> vendas) {
        Venda.vendas = vendas;
    }
         
    }

