package trabalhopoo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Venda {

    private int codVenda;
    private String formaPagamento;
    private String dataVenda;
    private double valorVenda;
    private List<Produto> produtosVenda;

    public Venda() {
        codVenda = 0;
        formaPagamento = "";
        dataVenda = "";
        valorVenda = 0;
    }

    public Venda(String formaPag, String datVen) {
//            codigo tem que ser randomico por enquanto
//            codVenda = cod;
        formaPagamento = formaPag;
        dataVenda = datVen;

    }
    private static int qtdProdutos;
    private static int qtdVendas;
    private static List<Venda> vendas = new ArrayList<Venda>();
//        private  List<Produto> produtosVenda = new ArrayList<Produto>();

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

    /**
     * @return the produtosVenda
     */
    public List<Produto> getProdutosVenda() {
        return produtosVenda;
    }

    /**
     * @param produtosVenda the produtosVenda to set
     */
    public void setProdutosVenda(List<Produto> produtosVenda) {
        this.produtosVenda.add((Produto) produtosVenda);
    }

    Object setProdutosVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    


}
