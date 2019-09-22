
package trabalhopoo;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Charlie04
 */
public class Compra {

    private int valor;
    private String descricaoDaCompra;
    private String dataDaCompra;
    private String fornecedor;
    
   public Compra(int valor, String descricaoDaCompra, String dataDaCompra, String fornecedor) {
        this.valor = valor;
        this.descricaoDaCompra = descricaoDaCompra;
        this.dataDaCompra = dataDaCompra;
        this.fornecedor = fornecedor;
    }

    private static int qtdCompras;
    private static List<Compra> compras = new ArrayList<Compra>();
   
   public static void novaCompra(){
       
       Scanner solicitaDado = new Scanner(System.in);
            System.out.print("Informe o valor da Compra: ");
            int valor = solicitaDado.nextInt();

            solicitaDado = new Scanner(System.in);
            System.out.print("Informe a descriçao da Compra: ");
            String descricaoDaCompra = solicitaDado.next();

            solicitaDado = new Scanner(System.in);
            System.out.print("Informe a data da Compra:  ");
            String dataDaCompra = solicitaDado.next();

            solicitaDado = new Scanner(System.in);
            System.out.print("Informe o fornecedor do produto comprado: ");
            String fornecedor = solicitaDado.next();

       
       
       
   }
   
   public static void mostrarCompras(){
        for(int i=0; i< compras.size(); i++){
            System.out.println("Valor: " + compras.get(i).getValor()
                   + "\n Descriçao: " + compras.get(i).getDescricaoDaCompra()
                   + "\n Codigo do Produto: " + compras.get(i).getDataDaCompra()
                   + "\n Fornecedor: " + compras.get(i).getFornecedor());
                 
   
        }}
   
   
   
   
   
   
   
   
   
   
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the descricaoDaCompra
     */
    public String getDescricaoDaCompra() {
        return descricaoDaCompra;
    }

    /**
     * @param descricaoDaCompra the descricaoDaCompra to set
     */
    public void setDescricaoDaCompra(String descricaoDaCompra) {
        this.descricaoDaCompra = descricaoDaCompra;
    }

    /**
     * @return the dataDaCompra
     */
    public String getDataDaCompra() {
        return dataDaCompra;
    }

    /**
     * @param dataDaCompra the dataDaCompra to set
     */
    public void setDataDaCompra(String dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the valor
     */
}

