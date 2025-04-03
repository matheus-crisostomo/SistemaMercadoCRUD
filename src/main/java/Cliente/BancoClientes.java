package Cliente;


public class BancoClientes {
    private Cliente[] cliente = new Cliente[5];

    public BancoClientes() {
    }

    public void cadastrarCliente(int posicao, String nome, String endereco, String telefone) {
        if (posicao < 0 || posicao >= cliente.length) {
            System.out.println("Posição de registro não existe!");
        }else if(cliente[posicao] != null){
            System.out.println("Posição de registro ja preenchida");
        }else{
            cliente[posicao] = new Cliente(nome, endereco, telefone);
            System.out.println("Cliente cadastrado com sucesso!");
        }

    }

    public void editarCliente(int posicao, String nome, String endereco, String telefone) {
        if (posicao < 0 || posicao >= cliente.length) {
            System.out.println("Posição de edição não existe!");
        }else if(cliente[posicao] == null){
            System.out.println("Posição selecionada não possui dados!");
        }else{
            cliente[posicao].putCliente(nome, endereco, telefone);
        }
    }

    public void excluirCliente(int posicao) {
        cliente[posicao].deleteCliente();
        cliente[posicao] = null;
    }


    public String pegarNomeCliente(int posicao) {
        if (cliente[posicao] != null && cliente[posicao].pegarNome() != null){
            return cliente[posicao].pegarNome();
        } else {
            return " ";
        }
    }

    public void listarClientes() {
        System.out.println(" ");
        for (int i = 0; i < cliente.length; i++) {
            System.out.println(" ");
            System.out.println("CLIENTE " + (i + 1));
            if (cliente[i] != null) {
                cliente[i].printDadosCliente();
            } else {
                System.out.println(" ");
            }
        }
    }
}