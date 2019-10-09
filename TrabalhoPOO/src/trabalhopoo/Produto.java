package trabalhopoo;

import java.util.Date;


public class Produto extends ItemEstoque{
   private String nome;
   private String tipoProduto;   
   private String codProduto;
   private String codBarras;
   private double preço;
   private int qtdMinima;
   private boolean ativo;     
   
        public Produto(String nome, String tipoProduto, String codProduto, String codBarras, double preço, int qtdMinima, boolean ativo, String fabricante, int quantidade, String validade, String dataEntrada, String dataCompra, double valorUnitarioVenda, double valorNota){
        super(fabricante, quantidade, validade, dataEntrada, dataCompra, valorUnitarioVenda, valorNota);
        this.nome = nome;
        this.tipoProduto = tipoProduto;    
        this.codProduto = codProduto;
        this.codBarras = codBarras;
        this.preço = preço;
        this.qtdMinima = qtdMinima;
        this.ativo = false;    
        
        


}

 

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

} 