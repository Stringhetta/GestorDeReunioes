import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        boolean logado = false;
        String usuarioLogado = "";

        while (!sair) {
            if (!logado) {
                System.out.println("----- Menu Inicial -----");
                System.out.println("1. Entrar com usuário e senha");
                System.out.println("2. Criar novo usuário");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do scanner

                switch (opcao) {
                    case 1:
                        // Lógica para entrar com usuário e senha
                        System.out.println("Opção selecionada: Entrar com usuário e senha");
                        // Implemente o código correspondente aqui
                        logado = true; // Simulando login com sucesso
                        usuarioLogado = "fulano"; // Nome do usuário logado
                        break;
                    case 2:
                        // Lógica para criar novo usuário
                        System.out.println("Opção selecionada: Criar novo usuário");
                        // Implemente o código correspondente aqui
                        break;
                    case 3:
                        sair = true;
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        break;
                }
            } else {
                System.out.println("----- Menu Logado -----");
                System.out.println("1. Consultar agenda");
                System.out.println("2. Criar novo evento");
                System.out.println("3. Reuniões pendentes de aprovação");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do scanner

                switch (opcao) {
                    case 1:
                        System.out.println("Opção selecionada: Consultar agenda");
                        // Implemente o código correspondente aqui
                        break;
                    case 2:
                        System.out.println("Opção selecionada: Criar novo evento");
                        // Implemente o código correspondente aqui
                        break;
                    case 3:
                        System.out.println("Opção selecionada: Reuniões pendentes de aprovação");
                        // Implemente o código correspondente aqui
                        break;
                    case 4:
                        logado = false; // Simulando logout
                        System.out.println("Saindo do usuário " + usuarioLogado);
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        break;
                }
            }

            System.out.println(); // Linha em branco para separar as iterações do menu
        }

        scanner.close();
    }
}
