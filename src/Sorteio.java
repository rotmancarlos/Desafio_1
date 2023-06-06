import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
    //Gerando um número aleatório

    int numeroSorteado = (int) (Math.random() * 100) + 1;


    //Resposta do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite um número de 1 a 100: ");
        int resposta = scanner.nextInt();


     //Conferir a resposta do usuário esta correta
        int pontuacao;
        if (resposta == numeroSorteado) {
            pontuacao = 10;
            System.out.println("Que sorte hein! Você acertou e ganhou 10 pontos!");
        }else {
            //Verificar se a resposta esta acima ou abaixo do número sorteado
            if (resposta == numeroSorteado - 1 || resposta == numeroSorteado + 1) {
                pontuacao = 5;
                System.out.println("Quase acertou hein! Ganhou 5 pontos");
            } else {
                pontuacao = 0;
                System.out.println("Não foi dessa vez, você errou!");
            }
        }

        //Mostrar a pontuação

        System.out.println("Pontuação: " + pontuacao);

    }
}
