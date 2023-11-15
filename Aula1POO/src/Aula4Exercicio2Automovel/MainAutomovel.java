package Aula4Exercicio2Automovel;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAutomovel {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Criar Pessoa");
            System.out.println("2. Criar Automovel");
            System.out.println("3. Transferir Automovel");
            System.out.println("4. Mostrar Todas as Pessoas");
            System.out.println("5. Mostrar Automovel da Pessoa");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.print("Digite o codigo da Pessoa: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer de entrada
                    System.out.print("Digite o nome da Pessoa: ");
                    String nome = scanner.nextLine();
                    Pessoa pessoa = new Pessoa(codigo, nome);
                    pessoas.add(pessoa);
                    break;

                case 2:
                    System.out.print("Digite a marca do Automovel: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo do Automovel: ");
                    String modelo = scanner.nextLine();

                    if (pessoas.isEmpty()) {
                        System.out.println("Nao ha pessoas para vincular o automovel. Crie uma pessoa primeiro.");
                    } else {
                        System.out.println("Escolha a Pessoa para vincular o Automovel:");
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.println(i + 1 + " - " + pessoas.get(i).getNome());
                        }
                        int escolha = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer de entrada

                        if (escolha >= 1 && escolha <= pessoas.size()) {
                            Automovel automovel = new Automovel(marca, modelo);
                            pessoas.get(escolha - 1).inserirAutomovel(automovel);
                        } else {
                            System.out.println("Escolha invalida.");
                        }
                    }
                    break;

                case 3:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nao ha pessoas para transferir automoveis.");
                    } else {
                        System.out.println("Escolha a Pessoa de origem para transferir o Automovel:");
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.println(i + 1 + " - " + pessoas.get(i).getNome());
                        }
                        int origem = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer de entrada

                        if (origem >= 1 && origem <= pessoas.size()) {
                            Pessoa pessoaOrigem = pessoas.get(origem - 1);

                            if (pessoaOrigem.getAutomoveis().isEmpty()) {
                                System.out.println("Essa pessoa nao possui automoveis para transferir.");
                            } else {
                                System.out.println("Escolha o Automovel de origem:");
                                for (int i = 0; i < pessoaOrigem.getAutomoveis().size(); i++) {
                                    System.out.println(i + 1 + " - " + pessoaOrigem.getAutomoveis().get(i).imprimir());
                                }
                                int automovelOrigem = scanner.nextInt();
                                scanner.nextLine(); // Limpar o buffer de entrada

                                if (automovelOrigem >= 1 && automovelOrigem <= pessoaOrigem.getAutomoveis().size()) {
                                    System.out.println("Escolha a Pessoa de destino para transferir o Automovel:");
                                    for (int i = 0; i < pessoas.size(); i++) {
                                        System.out.println(i + 1 + " - " + pessoas.get(i).getNome());
                                    }
                                    int destino = scanner.nextInt();
                                    scanner.nextLine(); // Limpar o buffer de entrada

                                    if (destino >= 1 && destino <= pessoas.size()) {
                                        Pessoa pessoaDestino = pessoas.get(destino - 1);
                                        Automovel automovelTransferido = pessoaOrigem.getAutomoveis().remove(automovelOrigem - 1);
                                        pessoaDestino.inserirAutomovel(automovelTransferido);
                                        System.out.println("Automovel transferido com sucesso!");
                                    } else {
                                        System.out.println("Escolha invalida para a Pessoa de destino.");
                                    }
                                } else {
                                    System.out.println("Escolha invalida para o Automovel de origem.");
                                }
                            }
                        } else {
                            System.out.println("Escolha invalida para a Pessoa de origem.");
                        }
                    }
                    break;

                case 4:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nao ha pessoas cadastradas.");
                    } else {
                        System.out.println("Pessoas cadastradas:");
                        for (Pessoa p : pessoas) {
                            System.out.println(p.imprimir());
                        }
                    }
                    break;

                case 5:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nao ha pessoas para mostrar seus automoveis.");
                    } else {
                        System.out.println("Escolha a Pessoa para mostrar seus automoveis:");
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.println(i + 1 + " - " + pessoas.get(i).getNome());
                        }
                        int escolha = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer de entrada

                        if (escolha >= 1 && escolha <= pessoas.size()) {
                            Pessoa pessoaSelecionada = pessoas.get(escolha - 1);
                            System.out.println("Automoveis de " + pessoaSelecionada.getNome() + ":");
                            System.out.println(pessoaSelecionada.imprimirAutomoveis());
                        } else {
                            System.out.println("Escolha invalida.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opçao invalida. Tente novamente.");
                    break;
            }
        }
    }
}