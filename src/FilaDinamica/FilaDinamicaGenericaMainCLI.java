package FilaDinamica;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.InputMismatchException;


public class FilaDinamicaGenericaMainCLI {
    public static  void main(String[] args) {
        Enfileiravel<String> fila = new FilaDinamicaGenerica<>(7);
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção (0-6): ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir o newline

                switch (opcao) {
                    case 0:
                        System.out.println("Saindo da Fila. Até mais!");
                        break;
                    case 1:
                        System.out.print("Digite o valor: ");
                        String valor = scanner.nextLine();
                        try {
                            fila.enfilerarFim(valor);
                        } catch(NoSuchElementException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.print("Deseja desenfileirar[s/n]? ");
                        String confirmacao = scanner.nextLine().trim().toLowerCase();
                        if (confirmacao.equals("s")) {
                            try {
                                fila.desenfilerarInicio();
                            } catch(NoSuchElementException e) {
                                System.err.println(e.getMessage());
                            }
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Frente: " + fila.frente());
                        } catch(NoSuchElementException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.print("Digite o valor: ");
                        String novoValorInicio = scanner.nextLine();
                        try {
                            fila.atulizarinicio(novoValorInicio);
                        } catch(NoSuchElementException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.print("Digite o valor: ");
                        String novoValorFim = scanner.nextLine();
                        try {
                            fila.atualizarfim(novoValorFim);
                        } catch(NoSuchElementException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 6:
                        System.out.println(fila.imprimirDeFrentePraTras());
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine(); // Consumir a entrada inválida
                opcao = -1; // Para não sair do loop
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("=== PILHA DINÂMICA GENÉRICA CLI ===");
        System.out.println("0. SAIR");
        System.out.println("1. Enfileirar");
        System.out.println("2. Desenfileirar");
        System.out.println("3. Frente");
        System.out.println("4. AtualizarInicio");
        System.out.println("5. AtualizarFim");
        System.out.println("6. Imprimir");
    }
}
