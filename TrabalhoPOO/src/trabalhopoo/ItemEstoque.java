package trabalhopoo;


public class ItemEstoque {    
        private String fabricante;
        private int quantidade;
        private String validade;
        private String dataEntrada;
        private String dataCompra;
        private double valorUnitarioVenda;
        private double valorNota;
            
            public ItemEstoque(String fabricante, int quantidade, String validade, String dataEntrada, String dataCompra, double valorUnitarioVenda, double valorNota){                
                this.fabricante = fabricante;
                this.quantidade = quantidade;
                this.validade = validade;
                this.dataEntrada = dataEntrada;
                this.dataCompra = dataCompra;
                this.valorUnitarioVenda = valorUnitarioVenda;
                this.valorNota = valorNota;
                
            }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorUnitarioVenda() {
        return valorUnitarioVenda;
    }

    public void setValorUnitarioVenda(double valorUnitarioVenda) {
        this.valorUnitarioVenda = valorUnitarioVenda;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }
}
