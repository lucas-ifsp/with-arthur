package br.ifsp.ic.petshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final var petshop = new Petshop();
        final var scanner = new Scanner(System.in);
        int opc;

        do {
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Adicionar Cachorro");
            System.out.println("3. Listar Clientes");
            System.out.println("4. Listar Cachorros");
            System.out.println("5. Remover Cliente");
            System.out.println("6. Remover Cachorro");
            System.out.println("7. Listar todos Vacinados");
            System.out.println("8. Listar Vacinados por Cliente");
            System.out.println("0. Sair");
            opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc){

                case 1:
                    System.out.println("Digite o nome da pessoa: ");
                    String nomePessoa = scanner.nextLine();

                    System.out.println("Digite o cpf da pessoa: ");
                    String cpfPessoa = scanner.nextLine();

                    Pessoa pessoa = new Pessoa(nomePessoa, cpfPessoa);
                    petshop.addCliente(pessoa);

                    break;
                case 2:
                    petshop.listarClientes();

                    System.out.println("A quem esse Cachorro pertence? (Digite o cpf)");
                    String cpf = scanner.nextLine();

                    System.out.println("Digite o nome do cachorro: ");
                    String nomeCachorro = scanner.nextLine();

                    System.out.println("Digite a raça do cachorro: ");
                    String racaCachorro = scanner.nextLine();

                    System.out.println("Cachorro é vacinado? (1=Sim, 2=Não)");
                    boolean vacinado = scanner.nextInt() == 1;

                    Cachorro cachorro = new Cachorro(nomeCachorro, racaCachorro, vacinado);
                    petshop.addCachorro(cpf, cachorro);

                    break;
                case 3:
                    petshop.listarClientes();

                    break;
                case 4:
                    petshop.listarClientes();

                    System.out.println("Deseja visualizar os cachorros de quem? (Digite o cpf)");
                    String cpfProcura = scanner.nextLine();
                    petshop.listarCachorros(cpfProcura);

                    break;
                case 5:
                    petshop.listarClientes();

                    System.out.println("Deseja deletar qual cliente? (Digite o cpf)");
                    String cpfDelete = scanner.nextLine();
                    petshop.removeCliente(cpfDelete);

                    break;
                case 6:
                    petshop.listarClientes();

                    System.out.println("A quem pertence o Cachorro que deseja remover? (Digite o cpf)");
                    String cpfDeleteCachorro = scanner.nextLine();

                    petshop.listarCachorros(cpfDeleteCachorro);
                    System.out.println("Qual o nome do Cachorro que deseja remover? ");

                    String nomeCachorroDelete = scanner.nextLine();
                    petshop.removerCachorro(cpfDeleteCachorro, nomeCachorroDelete);

                    break;
                case 7:
                    petshop.listarTodosVacinados();

                    break;
                case 8:
                    petshop.listarClientes();

                    System.out.println("De que cliente deseja ver os cachorros vacinados? ");
                    String cpfVacinados = scanner.nextLine();
                    petshop.listarVacinadosPorCliente(cpfVacinados);

                    break;
            }
        } while (opc != 0);
    }
}
