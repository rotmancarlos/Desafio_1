import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int pontuacaoTotal = 0;
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            int numeroSorteado = random.nextInt(10) + 1; // Gera um número aleatório entre 1 e 10
            System.out.print("Adivinhe o número (entre 1 e 10): ");
            int numeroAdivinhado = scanner.nextInt();

            if (numeroAdivinhado == numeroSorteado) {
                pontuacaoTotal += 10;
                System.out.println("Parabéns! Você acertou e ganhou 10 pontos.");
            } else if (numeroAdivinhado == numeroSorteado - 1 || numeroAdivinhado == numeroSorteado + 1) {
                pontuacaoTotal += 5;
                System.out.println("Quase lá! Você ganhou 5 pontos.");
            } else {
                System.out.println("Que pena! Você errou.");
            }

            System.out.print("Deseja jogar novamente? (S/N): ");
            String opcao = scanner.next();
            jogarNovamente = opcao.equalsIgnoreCase("S");
            System.out.println();
        }

        System.out.println("Pontuação total: " + pontuacaoTotal);
    }
}
