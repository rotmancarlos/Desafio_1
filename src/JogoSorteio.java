import java.util.Random;
import java.util.Scanner;

class SorteioJogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalPontos = 0;
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            int numeroSorteado = random.nextInt(10); // Gera um número aleatório entre 0 e 9
            System.out.println("Digite um número entre 0 e 9: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroSorteado) {
                totalPontos += 10;
                System.out.println("Parabéns! Você acertou e ganhou 10 pontos!");
            } else if (numeroUsuario == numeroSorteado - 1 || numeroUsuario == numeroSorteado + 1) {
                totalPontos += 5;
                System.out.println("Você está quente! Ganhou 5 pontos!");
            } else {
                System.out.println("Que pena! Você errou!");
            }

            System.out.println("Pontuação atual: " + totalPontos);
            System.out.println("Deseja jogar novamente? (s/n)");
            String resposta = scanner.next();
            jogarNovamente = resposta.equalsIgnoreCase("s");
        }

        System.out.println("Fim do jogo! Sua pontuação final: " + totalPontos);
    }
}

