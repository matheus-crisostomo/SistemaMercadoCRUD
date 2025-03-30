package Cliente;

public class BancoClientes {
    private Cliente[] cliente = new Cliente[5];

    public BancoClientes() {
    }

    public void cadastrarCliente(int posicao, String nome , String endereco , String telefone) {
        cliente[posicao] = new Cliente(nome, endereco, telefone);
    }

    public void editarCliente(int posicao, Cliente cliente, String nome , String endereco , String telefone) {
        cliente.putCliente(nome, endereco, telefone);
    }
    public void excluirCliente(int posicao) {
        cliente[posicao] = null;
    }

    public String getCliente(int posicao) {
        return cliente[posicao].pegarNome();
    }

    public void listarClientes() {
        System.out.println(" ");
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] != null) {
                System.out.println(cliente[i]);
            }
        }
    }
}
