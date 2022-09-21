package Quiz;

import Quiz.model.Questao;

import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String play = "S";
        Gerenciador gerenciador = new Gerenciador();
        List<Questao> listaDeQuestoes = gerenciador.geraQuiz();

        System.out.println("Bem Vindo ao Quiz Iteris");
        System.out.println("Esse quiz é comporsto por 3 questões.");
        do{
            int pontuação = 0;
            // Questão 1
            for(int i =0; i <listaDeQuestoes.size();i++){
                System.out.println("\n----------------------------");
                Questao questao = listaDeQuestoes.get(i);
                gerenciador.imprimirQuestao(questao);
                int resposta = entrada.nextInt();
                pontuação = gerenciador.calcularResposta(resposta, questao.getAcertou(), pontuação);
            }
            // Resultado
            System.out.println("\n----------RESULTADO----------");
            System.out.println("Você acertou " + pontuação + "/3 perguntas\n");

            System.out.println("Gostaria de jogar novamente? [S] ou [N]");
            play = entrada.next();
        }while(play.equals("S") || play.equals("s"));


    }


}

