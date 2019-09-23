package trabalhopoo;

import java.util.Date;


public class Produto extends Estoque{
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

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tipoProduto
     */
    public String getTipoProduto() {
        return tipoProduto;
    }

    /**
     * @param tipoProduto the tipoProduto to set
     */
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    /**
     * @return the codProduto
     */
    public String getCodProduto() {
        return codProduto;
    }

    /**
     * @param codProduto the codProduto to set
     */
    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    /**
     * @return the codBarras
     */
    public String getCodBarras() {
        return codBarras;
    }

    /**
     * @param codBarras the codBarras to set
     */
    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    /**
     * @return the preço
     */
    public double getPreço() {
        return preço;
    }

    /**
     * @param preço the preço to set
     */
    public void setPreço(double preço) {
        this.preço = preço;
    }

    /**
     * @return the qtdMinima
     */
    public int getQtdMinima() {
        return qtdMinima;
    }

    /**
     * @param qtdMinima the qtdMinima to set
     */
    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

} 