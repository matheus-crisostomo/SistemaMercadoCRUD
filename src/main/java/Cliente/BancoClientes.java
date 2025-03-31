package Cliente;


public class BancoClientes {
    private Cliente[] cliente = new Cliente[5];

    public BancoClientes() {
    }

    public void cadastrarCliente(int posicao, String nome, String endereco, String telefone) {
        cliente[posicao] = new Cliente(nome, endereco, telefone);
    }

    public void editarCliente(int posicao, Cliente clienteObj, String nome, String endereco, String telefone) {
        clienteObj.putCliente(nome, endereco, telefone);
    }

    public void excluirCliente(int posicao) {
        cliente[posicao] = null;
    }

    public Cliente getCliente(int posicao) {
        if (posicao < 0 || posicao >= cliente.length) {
            return null;
        }
        return cliente[posicao];
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