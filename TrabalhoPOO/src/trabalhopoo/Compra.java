package trabalhopoo;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class Compra {

    private int valor;
    private String descricaoDaCompra;
    private String dataDaCompra;
    private int idfor;
    
   public Compra(int valor, String descricaoDaCompra, String dataDaCompra, int idfor) {
        this.valor = valor;
        this.descricaoDaCompra = descricaoDaCompra;
        this.dataDaCompra = dataDaCompra;
        this.idfor = idfor;
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
            System.out.print("Informe o ID do fornecedor: ");
            int idfor = solicitaDado.nextInt();

            Fornecedor.buscaFornecedor(idfor);
            
            compras.add(new Compra(valor, descricaoDaCompra, dataDaCompra, idfor));
            qtdCompras ++;
            
       
       
   }
   
   public static void mostrarCompras(){
        for(int i=0; i< compras.size(); i++){
            System.out.println("\nValor: " + compras.get(i).getValor()
                   + "\n Descriçao: " + compras.get(i).getDescricaoDaCompra()
                   + "\n Codigo do Produto: " + compras.get(i).getDataDaCompra()
                   + "\n Fornecedor: " + compras.get(i).getIdfor());
                 
   
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
    public int getIdfor() {
        return idfor;
    }

    /**
     * @param idfor the fornecedor to set
     */
    public void setIdfor(int idfor) {
        this.idfor= idfor;
    }

    /**
     * @return the valor
     */
}