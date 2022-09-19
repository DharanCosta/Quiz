package Quiz;

import Quiz.model.Alternativa;
import Quiz.model.Letra;
import Quiz.model.Questão;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


    System.out.println("Bem Vindo ao Quiz Iteris");
    System.out.println("Esse quiz é comporsto por 3 questões.");

    int pontuação = 0;
    // Questão 1
        System.out.println("\n----------------------------");
    List<Alternativa> alternativas = new ArrayList<>();
    alternativas.add(new Alternativa(Letra.A, "Compaixão, Conhecimento e Coragem", false));
    alternativas.add(new Alternativa(Letra.B, "Conhecimento, Colaboração e Comprometimento", true));
    alternativas.add(new Alternativa(Letra.C, "Colaboração, Correria e Coração", false));
    Questão questão1 = new Questão(1, "Quais são os 3 C's da Iteris", 2, alternativas);

        System.out.println("1 - "+questão1.getTexto());
        System.out.println("A) "+questão1.getAlternativas().get(0).getTexto());
        System.out.println("B) "+questão1.getAlternativas().get(1).getTexto());
        System.out.println("C) "+questão1.getAlternativas().get(2).getTexto());
    String resposta = entrada.next();
    if(resposta.equals("B") || resposta.equals("b")){
        System.out.println("Resposta do usuário:" + resposta);
        pontuação++;
    }else {
        System.out.println("Resposta do usuário: " + resposta);
    }

    // Questão 2
        System.out.println("\n----------------------------");
        List<Alternativa> alternativas2 = new ArrayList<>();
        alternativas2.add(new Alternativa(Letra.A, "2010", false));
        alternativas2.add(new Alternativa(Letra.B, "2008", false));
        alternativas2.add(new Alternativa(Letra.C, "2009", true));
        Questão questão2 = new Questão(2, "Quando foi fundada a Iteris?", 3, alternativas2);
        System.out.println("2 - "+questão2.getTexto());
        System.out.println("A) "+questão2.getAlternativas().get(0).getTexto());
        System.out.println("B) "+questão2.getAlternativas().get(1).getTexto());
        System.out.println("C) "+questão2.getAlternativas().get(2).getTexto());
        String resposta2 = entrada.next();
        if(resposta2.equals("C") || resposta2.equals("c")){
            System.out.println("Resposta do usuário: " + resposta2);
            pontuação++;
        }else {
            System.out.println("Resposta do usuário: " + resposta2);
        }

       // Questão 3
        System.out.println("\n----------------------------");
        List<Alternativa> alternativas3 = new ArrayList<>();
        alternativas2.add(new Alternativa(Letra.A, "Carlos, Sergio e Marcelo", false));
        alternativas2.add(new Alternativa(Letra.B, "Marcelo, Felipe e Sergio", false));
        alternativas2.add(new Alternativa(Letra.C, "Sergio, Marcelo e Fernando ", true));
        Questão questão3 = new Questão(2, "Quem são os fundadores da Iteris", 3, alternativas2);
        System.out.println("3 - "+questão3.getTexto());
        System.out.println("A) "+questão3.getAlternativas().get(0).getTexto());
        System.out.println("B) "+questão3.getAlternativas().get(1).getTexto());
        System.out.println("C) "+questão3.getAlternativas().get(2).getTexto());
        String resposta3 = entrada.next();
        if(resposta3.equals("C") || resposta3.equals("c")){
            System.out.println("Resposta do usuário: " + resposta3);
            pontuação++;
        }else {
            System.out.println("Resposta do usuário: " + resposta3);
        }

        System.out.println("\n----------RESULTADO----------");
        System.out.println("Você acertou "+pontuação+"/3 perguntas");
    }
}