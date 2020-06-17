import Classes.Candidato;
import Classes.Votos;
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static Votos votos = new Votos();


    public static void main(String[] args) {
        int escolha;

        do {
            System.out.println(" ------- Escolha uma das opcoes abaixo ------- ");

            System.out.println("[1] Adicionar candidato \n" +
                    "[2] Exibir candidato mais jovem \n" +
                    "[3] Exibir candidato mais velho \n" +
                    "[4] Exibir candidato mais votado \n" +
                    "[5] Exibir candidato menos votado \n" +
                    "[6] Exibir o total de votos \n" +
                    "[7] Exibir média de votação \n" +
                    "[0] Sair");

            escolha = in.nextInt();
            in.nextLine();

            switch (escolha) {
                case 1:
                    adicionarCandidato();
                    break;

                case 2:
                    Candidato maisNovo = votos.candidatoMaisNovo();
                    if(maisNovo != null) {
                        System.out.println(maisNovo.toString() + "\n");
                    } else {
                        System.out.println("Nao existem candidatos cadastrados no sistema!");
                    }
                    break;

                case 3:
                    Candidato maisVelho = votos.candidatoMaisVelho();
                    if(maisVelho != null) {
                        System.out.println(maisVelho.toString() + "\n");
                    } else {
                        System.out.println("Nao existem candidatos cadastrados no sistema!");
                    }
                    break;

                case 4:
                    Candidato maisVotado = votos.candidatoMaisVotado();
                    if(maisVotado != null) {
                        System.out.println(maisVotado.toString() + "\n");
                    } else {
                        System.out.println("Nao existem candidatos cadastrados no sistema!");
                    }
                    break;

                case 5:
                    Candidato menosVotado = votos.candidatoMenosVotado();
                    if(menosVotado != null) {
                        System.out.println(menosVotado.toString() + "\n");
                    } else {
                        System.out.println("Nao existem candidatos cadastrados no sistema!");
                    }
                    break;

                case 6:
                    System.out.println("Total de votos: " + votos.totalDeVotos() + "\n");
                    break;

                case 7:
                    System.out.println("Média de votos: " + votos.mediaDeVotos()+ "\n");
                    break;

                case 0:
                    System.out.print("Saindo.... \n");
                    break;

                default:
                    System.out.println("Opcao Invalida!!!!! \n");
                    break;
            }
        } while (escolha != 0);
    }

    private static void adicionarCandidato() {
        System.out.println(" ------- Adicionando candidato ------- ");

        System.out.print("Nome: ");
        String nome = in.nextLine();

        System.out.print("Idade: ");
        int idade = in.nextInt();
        in.nextLine();

        System.out.print("Partido: ");
        String partido = in.nextLine();

        System.out.print("Numero de votos: ");
        int numeroVotos = in.nextInt();
        in.nextLine();

        Candidato candidato = new Candidato(
                nome,
                idade,
                partido,
                numeroVotos
        );

        votos.novoCandidato(candidato);

        System.out.println();
    }

}