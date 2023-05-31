import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        boolean logado = false;
        String usuarioLogado = "";
        GerenteDeAgenda gerenteDeAgenda = new GerenteDeAgenda();

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
                        System.out.print("Digite o nome de usuário: ");
                        String usuario = scanner.nextLine();
                        System.out.print("Digite a senha: ");
                        String senha = scanner.nextLine();

                        // Verificar as credenciais usando o GerenteDeAgenda
                        if (gerenteDeAgenda.verificarCredenciais(usuario, senha)) {
                            logado = true;
                            usuarioLogado = usuario;
                            System.out.println("Login realizado com sucesso!");
                        } else {
                            System.out.println("\nCredenciais inválidas. Tente novamente.");
                        }
                        break;

                    case 2:
                        // Lógica para criar novo usuário
                        System.out.println("Opção selecionada: Criar novo usuário");
                        System.out.print("Digite o nome de usuário: ");
                        String novoUsuario = scanner.nextLine();
                        System.out.print("Digite a senha: ");
                        String novaSenha = scanner.nextLine();
                        System.out.print("Digite o seu Email: ");
                        String novoEmail = scanner.nextLine();

                        // Criar o novo usuário usando o GerenteDeAgenda
                        if(gerenteDeAgenda.criarUsuarioSenha(novoUsuario, novaSenha, novoEmail)){
                            System.out.println("\nNovo usuário criado com sucesso!");
                        }else{
                            System.out.println("Falha ao criar o usuário, tente novamente!");
                        }
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
