package trabalhopoo;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class GerenciadorVenda{        
    
        private static int qtdVendas;
        private  List<Produto> produtosVenda = new ArrayList<>();
    
        
        public static void criarVenda(){
            Scanner solicitaDado = new Scanner(System.in);                                 
            System.out.println("Forma de pagamento");
            String formaPagamento = solicitaDado.next();
            
            solicitaDado = new Scanner(System.in);
            System.out.println("Insira da data da venda");
            String dataVenda = solicitaDado.next();
         
            Venda venda = new Venda();
            
            adicionaProdutoVenda(venda);
            
          
          
            qtdVendas++;
            System.out.print("Venda concluida com sucesso !");
            
           
            
//            for(int i = 0; i < produtosVenda.size(); i++){
//                GerenciadorEstoque.removeProdutoEstoque(produtosVenda.get(i).getCodProduto(), qtdProdutos);
//            }
            }
        
        
                  
        public static Venda adicionaProdutoVenda(Venda venda){
              Scanner solicitaDado = new Scanner(System.in);
              int codigo = 1;
              int quantidade;
              for(int i=0; codigo > 0 ; i++)  {
                System.out.print("Informe o codigo do produto");
                codigo = solicitaDado.nextInt();
              if(codigo < 0){
                break;
              }
                  
              System.out.print("Informe a quantidade do produto");
              quantidade = solicitaDado.nextInt(); 
              
                  
              if(GerenciadorEstoque.insereProdutoVenda(codigo, quantidade) != null){
                  venda.setProdutosVenda((List<Produto>) GerenciadorEstoque.insereProdutoVenda(codigo, quantidade));
              }
                  
              
             // Venda.CalculaValorTotal(quantidade);
            }
             // remove o produto depois da compra ter sido realizada.
//            produtosVenda.add(GerenciadorEstoque.removeProdutoEstoque(produtosVenda));
               //qtdProdutos++;
               return venda;
          }
//     Função esta incorreta.               
//     public static Double CalculaValorTotal(int quant) {
//             double valorTo = 0;
//             for(int i=0; i<produtosVenda.size(); i++){            
//             valorTo += produtosVenda.get(i).getPreço()*quant;
//             }
//         return valorTo; 
//       }
        
                
//        public static void mostrarVenda(){
//            for(int i = 0; i< vendas.size(); i++){
//                System.out.println("Forma de Pagamento: "+vendas.get(i).getFormaPagamento()
//                       +"\nData de emissão: "+vendas.get(i).getDataVenda());
////          Corrigir: não está mostrando a lista de produtos.          
//               for(int x = 0; x < vendas.get(i).produtosVenda.size(); x++){   
//                    System.out.println("Nome do Produto: "+vendas.get(i).produtosVenda.get(x).getNome()
//                          +"Quantidade de produtos: "+venda.get(i).produtosVenda.get(x).getQuantidade()
//                          +"Codigo do produto: "+ vendas.get(i).produtosVenda.get(x).getCodProduto());
//                            
//                }              
//            }
//      }
    }
