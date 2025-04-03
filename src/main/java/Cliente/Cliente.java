package Cliente;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void deleteCliente() {
        this.nome = null;
        this.endereco = null;
        this.telefone = null;
    }

    public void putCliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void printDadosCliente() {
        System.out.println(" ");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

    public String pegarNome() {
        if (nome == null) {
            return " ";
        }else {
            return nome;
        }
    }
}

