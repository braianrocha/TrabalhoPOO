package trabalhopoo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

    public class Venda {
        private int codVenda;
        private String formaPagamento;
        private String dataVenda;
        private Double valorVenda;

        public Venda( String formaPag, String datVen,Double valorVen){
//            codVenda = cod;
            formaPagamento = formaPag;
            dataVenda = datVen;
            valorVenda = valorVen;
        }
        
        private static int qtdVendas;
        private static List<Venda> vendas = new ArrayList<>();
        
        public static void criarVenda(){
            Scanner solicitaDado = new Scanner(System.in);
            
            
            solicitaDado = new Scanner(System.in);
            System.out.println("Forma de pagamento");
            String formaPagamento = solicitaDado.next();
            
            solicitaDado = new Scanner(System.in);
            System.out.println("Insira da data da venda");
            String dataVenda = solicitaDado.next();
            
            solicitaDado = new Scanner(System.in);
            System.out.print("Informe o valor da venda");
            Double valorVenda = solicitaDado.nextDouble();
           
            vendas.add(new Venda( formaPagamento, dataVenda, valorVenda));
            qtdVendas ++;
            
            
        }
        
            private static int qtdprodutos;
            List<Produto> produtos1 = new ArrayList<>();
            
            private static void ListaProdutos(){
                
            }
         public static void mostrarVenda(){
            for(int i = 0; i< vendas.size(); i++){
                System.out.print("codigo da venda: " +vendas.get(i).getCodVenda()
                        +"Forma de Pagamento: "+vendas.get(i).getFormaPagamento()
                        +"Data de emissão: "+vendas.get(i).getDataVenda()
                        +"Valor: "+vendas.get(i).getValorVenda());
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

