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
        bancoClientes.cadastrarCliente(1,"Gabriel", "Avenida das três bermudas", "12 34567-8901");
        bancoClientes.cadastrarCliente(2,"Cristhian", "Condominio Factory", "12 34567-8901");
        bancoClientes.cadastrarCliente(3,"Felipe", "Complexo Cidade Alta", "12 34567-8901");

        estoque.cadastrarItemEstoque("Feijao - 1kg", 20, 10.0f, 0);
        estoque.cadastrarItemEstoque("Arroz - 1kg", 30, 12.0f, 1);
        estoque.cadastrarItemEstoque("Açucar - 1kg", 25, 5.50f, 2);
        estoque.cadastrarItemEstoque("Café - 200g", 10, 1000.0f, 3);
        estoque.cadastrarItemEstoque("Sal", 10, 1.2f, 4);

        while (true) {
            menu.printMenuPrincipal();
            String opcao = sc.nextLine().trim();

            boolean subMenuAtivo = false;
            boolean subSubMenuAtivo = false;
            switch (opcao) {
                case "1": {
                    subMenuAtivo = true;
                    while (subMenuAtivo) {
                        menu.printMenuCadastroCliente(bancoClientes);
                        String opcaoMenuCadastro = sc.nextLine().trim();

                        switch (opcaoMenuCadastro) {
                            case "1", "2", "3", "4", "5": {
                                System.out.println("Digite o nome do cliente: ");
                                String nome = sc.nextLine();
                                System.out.println("Digite o endereço do cliente: ");
                                String endereco = sc.nextLine();
                                System.out.println("Digite o telefone do cliente: ( 12 34567-8901 )");
                                String telefone = sc.nextLine();
                                bancoClientes.cadastrarCliente(Integer.parseInt(opcaoMenuCadastro) - 1, nome, endereco, telefone);
                            }
                            break;

                            case "6":
                                subMenuAtivo = false;
                                break;

                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }
                    }
                }
                break;
                case "2": {
                    subMenuAtivo = true;
                    while (subMenuAtivo) {
                        menu.printMenuDeletarCliente(bancoClientes);
                        String opcaoMenuDeletar = sc.nextLine().trim();
                        switch (opcaoMenuDeletar) {
                            case "1", "2", "3", "4", "5": {
                                bancoClientes.excluirCliente(Integer.parseInt(opcaoMenuDeletar) - 1);
                                System.out.println("Cliente " + opcaoMenuDeletar + " deletado com sucesso!");
                            }
                            break;
                            case "6": {
                                subMenuAtivo = false;
                            }
                            break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }

                    }
                }
                break;

                case "3": {
                    subMenuAtivo = true;
                    while (subMenuAtivo) {
                        menu.printMenuDados();
                        String opcaoMenuDados = sc.nextLine().trim();
                        switch (opcaoMenuDados) {
                            case "1": {
                                bancoClientes.listarClientes();
                                break;
                            }
                            case "2": {
                                estoque.listarEstoque();
                                break;
                            }
                            case "3": {
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

                case "4": {
                    subMenuAtivo = true;
                    while (subMenuAtivo) {
                        menu.printMenuAlterarCliente(bancoClientes);
                        String opcaoMenuAlterar = sc.nextLine().trim();
                        switch (opcaoMenuAlterar) {
                            case "1", "2", "3", "4", "5": {
                                System.out.println("Digite o novo nome do cliente: ");
                                String nome = sc.nextLine();
                                System.out.println("Digite o novo endereço do cliente: ");
                                String endereco = sc.nextLine();
                                System.out.println("Digite o novo telefone do cliente: ( 12 34567-8901 )");
                                String telefone = sc.nextLine();
                                bancoClientes.editarCliente(Integer.parseInt(opcaoMenuAlterar) - 1, nome, endereco, telefone);
                            }
                            break;
                            case "6": {
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

                case "5": {
                    subMenuAtivo = true;
                    while (subMenuAtivo) {
                        menu.printMenuEstoque();
                        String opcaoMenuEstoque = sc.nextLine().trim();
                        switch (opcaoMenuEstoque) {
                            case "1": {
                                subSubMenuAtivo = true;
                                while (subSubMenuAtivo) {
                                    menu.printMenuCadastroEstoque(estoque);
                                    String opcaoCadastroEstoque = sc.nextLine().trim();
                                    switch (opcaoCadastroEstoque) {
                                        case "1", "2", "3", "4", "5", "6", "7": {
                                            System.out.println("Digite o nome do item: ");
                                            String nome = sc.nextLine();



                                            //verifica se a entrada é um numero e se ele é valido
                                            int quantidade;
                                            while (true) {
                                                try {
                                                    System.out.print("Digite a quantidade do item: ");
                                                    quantidade = Integer.parseInt(sc.nextLine().trim());

                                                    if (quantidade >= 0) {
                                                        break;
                                                    } else {
                                                        System.out.println("A quantidade deve ser um número inteiro positivo.");
                                                    }
                                                } catch (Exception e) {
                                                    System.out.println("Entrada inválida! Digite um número inteiro.");
                                                }
                                            }


                                            //verifica se a entrada é um numero e se ele é valido
                                            float preco;
                                            while (true) {
                                                try {
                                                    System.out.print("Digite o preço do item: R$ ");
                                                    String entrada = sc.nextLine().replace(",", ".");
                                                    preco = Float.parseFloat(entrada);
                                                    if (preco >= 0) {
                                                        break;
                                                    } else {
                                                        System.out.println("O preço deve ser um número positivo.");
                                                    }
                                                } catch (Exception e) {
                                                    System.out.println("Entrada inválida! Digite um número decimal válido (ex: 10.50).");
                                                }
                                            }
                                            estoque.cadastrarItemEstoque(nome, quantidade, preco, Integer.parseInt(opcaoCadastroEstoque) - 1);
                                        }
                                        break;
                                        case "8": {
                                            subSubMenuAtivo = false;
                                        }
                                        default: {
                                            System.out.println("Opção inválida! Tente novamente.");
                                        }
                                    }
                                }
                            }
                            break;

                            case "2": {
                                subSubMenuAtivo = true;
                                while (subSubMenuAtivo) {
                                    menu.printMenuDeletarEstoque(estoque);
                                    String opcaoDeletarEstoque = sc.nextLine().trim();
                                    switch (opcaoDeletarEstoque) {
                                        case "1", "2", "3", "4", "5", "6", "7": {
                                            estoque.deleteItemEstoque(Integer.parseInt(opcaoDeletarEstoque) - 1);
                                        }
                                        break;
                                        case "8": {
                                            subSubMenuAtivo = false;
                                        }
                                        default: {
                                            System.out.println("Opção inválida! Tente novamente.");
                                        }
                                    }
                                }
                            }
                            break;

                            case "3": {
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
                case "6":{
                    System.out.println("Sistema encerrado!");
                    System.exit(0);
                }
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}