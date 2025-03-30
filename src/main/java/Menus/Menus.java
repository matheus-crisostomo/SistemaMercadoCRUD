package Menus;

import Cliente.BancoClientes;
import Estoque.Estoque;

public class Menus {

    public void printMenuPrincipal() {
        System.out.println(" ");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Deletar Cliente");
        System.out.println("3 - Dados Armazenados");
        System.out.println("4 - Alterar Cliente");
        System.out.println("5 - Estoque");
        System.out.println("6 - Sair");
    }

    public void printMenuCadastroCliente(BancoClientes bancoClientes) {
        System.out.println(" ");
        System.out.println("MENU DE CADASTRO CLIENTE");
        listagemMenuClientes(bancoClientes);
    }

    public void printMenuDeletarCliente(BancoClientes bancoClientes) {
        System.out.println(" ");
        System.out.println("MENU DE DELETAR CLIENTE");
        listagemMenuClientes(bancoClientes);
        System.out.println("6 - Voltar");
    }

    public void printMenuDados() {
        System.out.println(" ");
        System.out.println("MENU DE DADOS");
        System.out.println("1- Clientes Armazenados");
        System.out.println("2- Estoque");
        System.out.println("3- Voltar");

    }

    public void printMenuAlterarCliente(BancoClientes bancoClientes) {
        System.out.println(" ");
        System.out.println("MENU DE ALTERAR CLIENTE");
        listagemMenuClientes(bancoClientes);
        System.out.println("6 - Voltar");
    }

    public void printMenuEstoque() {
        System.out.println(" ");
        System.out.println("MENU DE ESTOQUE");
        System.out.println("1 - Cadastrar Item");
        System.out.println("2 - Deletar Item");
        System.out.println("3 - Voltar");
    }

    public void printMenuCadastroEstoque(Estoque estoque) {
        System.out.println(" ");
        System.out.println("MENU DE CADASTRO ESTOQUE");
        listagemMenuEstoque(estoque);
        System.out.println("8 - Voltar");
    }

    public void printMenuDeletarEstoque(Estoque estoque) {
        System.out.println(" ");
        System.out.println("MENU DE DELETAR ESTOQUE");
        listagemMenuEstoque(estoque);
        System.out.println("9 - Voltar");
    }

    private void listagemMenuClientes(BancoClientes bancoClientes) {
        System.out.println("1 - " + bancoClientes.getCliente(0));
        System.out.println("2 - " + bancoClientes.getCliente(1));
        System.out.println("3 - " + bancoClientes.getCliente(2));
        System.out.println("4 - " + bancoClientes.getCliente(3));
        System.out.println("5 - " + bancoClientes.getCliente(4));
    }

    private void listagemMenuEstoque(Estoque estoque) {
        System.out.println("1 - " + estoque.getNomeEstoque(0));
        System.out.println("2 - " + estoque.getNomeEstoque(1));
        System.out.println("3 - " + estoque.getNomeEstoque(2));
        System.out.println("4 - " + estoque.getNomeEstoque(3));
        System.out.println("5 - " + estoque.getNomeEstoque(4));
        System.out.println("6 - " + estoque.getNomeEstoque(5));
        System.out.println("7 - " + estoque.getNomeEstoque(6));
    }
}
