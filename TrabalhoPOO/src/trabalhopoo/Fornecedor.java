package trabalhopoo;


public class Fornecedor {
    private int id;
    private String nome;
    private String cpfCnpj;
    private String contato;
    private String endereco;
    private boolean ativo;

    public Fornecedor(int id,String nome, String cpfCnpj, String contato, String endereco, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.contato = contato;
        this.endereco = endereco;
        this.ativo = ativo;
    }
    private static List<Fornecedor> fornecedor = new ArrayList<>();
    private static int qtdFornecedor;

    public static void novoFornecedor() {

        Scanner solicitaDado = new Scanner(System.in);

        System.out.println("Informe o codigo para Identificar seu Fornecedor: ");
        int id = solicitaDado.nextInt();
        
         solicitaDado = new Scanner(System.in);
                
        System.out.println("Informe o Nome do Fornecedor: ");
        String nome = solicitaDado.nextLine();

        System.out.println("Informe o CPF ou o CNPJ: ");
        String cpfCnpj = solicitaDado.nextLine();

        System.out.println("Informe o Endereco: ");
        String endereco = solicitaDado.nextLine();

        System.out.println("Informe os dados para contato: ");
        String contato = solicitaDado.nextLine();


        System.out.println("O Forncedor encontra-se ativo? ");
        boolean ativo = solicitaDado.nextBoolean();

        getFornecedor().add(new Fornecedor(id,nome, cpfCnpj, contato, endereco, ativo));
        qtdFornecedor++;

    }

    public static void mostrarFornecedor() {
        for (int i = 0; i < fornecedor.size(); i++) {
            System.out.println("Identificador do Fornecedor: " + fornecedor.get(i).getId()
                    +"\nNome: " + fornecedor.get(i).getNome()
                    + "\nCPF / CNPJ: " + fornecedor.get(i).getCpfCnpj()
                    + "\nContato: " + fornecedor.get(i).getContato()
                    + "\nEndereco: " + fornecedor.get(i).getEndereco());
        }
    }
    
}
