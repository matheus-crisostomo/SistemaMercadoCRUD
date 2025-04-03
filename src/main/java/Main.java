import Cliente.BancoClientes;
import Estoque.Estoque;
import Menus.Menus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BancoClientes bancoClientes = new BancoClientes();
        Estoque estoque = new Estoque();
        Menus menu = new Menus();

        bancoClientes.cadastrarCliente(0,"Matheus", "Conjunto Clock Tower", "12 34567-8901");
        bancoClientes.cadastrarCliente(0,"Gabriel", "Avenida das três bermudas", "12 34567-8901");
        bancoClientes.cadastrarCliente(0,"Cristhian", "Condominio Factory", "12 34567-8901");
        bancoClientes.cadastrarCliente(0,"Felipe", "Complexo Cidade Alta", "12 34567-8901");

        estoque.cadastrarItemEstoque("Feijao - 1kg", 20, 10.0f, 0);
        estoque.cadastrarItemEstoque("Arroz - 1kg", 30, 12.0f, 1);
        estoque.cadastrarItemEstoque("Açucar - 1kg", 25, 5.50f, 2);
        estoque.cadastrarItemEstoque("Café - 200g", 10, 1000.0f, 3);
        estoque.cadastrarItemEstoque("Sal", 10, 1.2f, 4);

        while (true) {
            menu.printMenuPrincipal();
            int opcao = sc.nextInt();
            sc.nextLine();

            boolean subMenuAtivo = false;
            boolean subSubMenuAtivo = false;
            switch (opcao) {
                case 1: {
                    subMenuAtivo = true;
                    while (subMenuAtivo) {
                        menu.printMenuCadastroCliente(bancoClientes);
                        int opcaoMenuCadastro = sc.nextInt();
                        sc.nextLine();

                        switch (opcaoMenuCadastro) {
                            case 1, 2, 3, 4, 5: {
                                System.out.println("Digite o nome do cliente: ");
                                String nome = sc.nextLine();
                                System.out.println("Digite o endereço do cliente: ");
                                String endereco = sc.nextLine();
                                System.out.println("Digite o telefone do cliente: ( 12 34567-8901 )");
                                String telefone = sc.nextLine();
                                bancoClientes.cadastrarCliente(opcaoMenuCadastro - 1, nome, endereco, telefone);
                                System.out.println("Cliente cadastrado com sucesso!");
                            }
                            break;

                            case 6:
                                subMenuAtivo = false;
                                break;

                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }
                    }
                }
                break;
                case 2: {
                    subMenuAtivo = true;
                    while (subMenuAtivo) {
                        menu.printMenuDeletarCliente(bancoClientes);
                        int opcaoMenuDeletar = sc.nextInt();
                        sc.nextLine();
                        switch (opcaoMenuDeletar) {
                            case 1, 2, 3, 4, 5: {
                                bancoClientes.excluirCliente(opcaoMenuDeletar - 1);
                                System.out.println("Cliente " + opcaoMenuDeletar + " deletado com sucesso!");

                            }
                            break;
                            case 6: {
                                subMenuAtivo = false;
                            }
                            break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }

                    }
                }
                break;

                case 3: {
                    subMenuAtivo = true;
                    while (subMenuAtivo) {
                        menu.printMenuDados();
                        int opcaoMenuDados = sc.nextInt();
                        sc.nextLine();
                        switch (opcaoMenuDados) {
                            case 1: {
                                bancoClientes.listarClientes();
                                break;
                            }
                            case 2: {
                                estoque.listarEstoque();
                                break;
                            }
                            case 3: {
                                subMenuAtivo = false;
                                break;
                            }
                            default: {
                                System.out.println("Opção inválida! Tente novamente.");
                            }
                        }
                    }
                }
                break;

                case 4: {
                    subMenuAtivo = true;
                    while (subMenuAtivo) {
                        menu.printMenuAlterarCliente(bancoClientes);
                        int opcaoMenuAlterar = sc.nextInt();
                        sc.nextLine();
                        switch (opcaoMenuAlterar) {
                            case 1, 2, 3, 4, 5: {
                                System.out.println("Digite o novo nome do cliente: ");
                                String nome = sc.nextLine();
                                System.out.println("Digite o novo endereço do cliente: ");
                                String endereco = sc.nextLine();
                                System.out.println("Digite o novo telefone do cliente: ( 12 34567-8901 )");
                                String telefone = sc.nextLine();
                                bancoClientes.editarCliente(opcaoMenuAlterar - 1, nome, endereco, telefone);
                            }
                            break;
                            case 6: {
                                subMenuAtivo = false;
                            }
                            break;
                            default: {
                                System.out.println("Opção inválida! Tente novamente.");
                            }
                        }
                    }
                }
                break;

                case 5: {
                    subMenuAtivo = true;
                    while (subMenuAtivo) {
                        menu.printMenuEstoque();
                        int opcaoMenuEstoque = sc.nextInt();
                        sc.nextLine();
                        switch (opcaoMenuEstoque) {
                            case 1: {
                                subSubMenuAtivo = true;
                                while (subSubMenuAtivo) {
                                    menu.printMenuCadastroEstoque(estoque);
                                    int opcaoCadastroEstoque = sc.nextInt();
                                    sc.nextLine();
                                    switch (opcaoCadastroEstoque) {
                                        case 1, 2, 3, 4, 5, 6, 7: {
                                            System.out.println("Digite o nome do item: ");
                                            String nome = sc.nextLine();
                                            System.out.println("Digite a quantidade do item: ");
                                            int quantidade = sc.nextInt();
                                            System.out.println("Digite o preço do item: R$");
                                            float preco = sc.nextFloat();
                                            estoque.cadastrarItemEstoque(nome, quantidade, preco, opcaoCadastroEstoque - 1);
                                        }
                                        break;
                                        case 8: {
                                            subSubMenuAtivo = false;
                                        }
                                        default: {
                                            System.out.println("Opção inválida! Tente novamente.");
                                        }
                                    }
                                }
                            }
                            break;

                            case 2: {
                                subSubMenuAtivo = true;
                                while (subSubMenuAtivo) {
                                    menu.printMenuDeletarEstoque(estoque);
                                    int opcaoDeletarEstoque = sc.nextInt();
                                    sc.nextLine();
                                    switch (opcaoDeletarEstoque) {
                                        case 1, 2, 3, 4, 5, 6, 7: {
                                            estoque.deleteItemEstoque(opcaoDeletarEstoque - 1);
                                        }
                                        break;
                                        case 8: {
                                            subSubMenuAtivo = false;
                                        }
                                        default: {
                                            System.out.println("Opção inválida! Tente novamente.");
                                        }
                                    }
                                }
                            }
                            break;

                            case 3: {
                                subMenuAtivo = false;
                            }
                            break;
                            default: {
                                System.out.println("Opção inválida! Tente novamente.");
                            }
                        }
                    }
                }
                break;
                case 6:{
                    System.out.println("Sistema encerrado!");
                    System.exit(0);
                }
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
