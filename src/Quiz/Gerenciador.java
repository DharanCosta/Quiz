package Quiz;

import Quiz.model.Alternativa;
import Quiz.model.Letra;
import Quiz.model.Questao;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    public List<Questao> geraQuiz(){

        List<Alternativa> alternativas = new ArrayList<>();
        alternativas.add(new Alternativa(Letra.A, "Compaixão, Conhecimento e Coragem", false));
        alternativas.add(new Alternativa(Letra.B, "Conhecimento, Colaboração e Comprometimento", true));
        alternativas.add(new Alternativa(Letra.C, "Colaboração, Correria e Coração", false));
        Questao questao1 = new Questao(1, "Quais são os 3 C's da Iteris?", 2, alternativas);

        List<Alternativa> alternativas2 = new ArrayList<>();
        alternativas2.add(new Alternativa(Letra.A, "2010", false));
        alternativas2.add(new Alternativa(Letra.B, "2008", false));
        alternativas2.add(new Alternativa(Letra.C, "2009", true));
        Questao questao2 = new Questao(2, "Quando foi fundada a Iteris?", 3, alternativas2);

        List<Alternativa> alternativas3 = new ArrayList<>();
        alternativas3.add(new Alternativa(Letra.A, "Carlos, Sergio e Marcelo", false));
        alternativas3.add(new Alternativa(Letra.B, "Marcelo, Felipe e Sergio", false));
        alternativas3.add(new Alternativa(Letra.C, "Sergio, Marcelo e Fernando ", true));
        Questao questao3 = new Questao(2, "Quem são os fundadores da Iteris?", 3, alternativas3);

        List<Questao> listaDeQuestoes = new ArrayList<>();
        listaDeQuestoes.add(questao1);
        listaDeQuestoes.add(questao2);
        listaDeQuestoes.add(questao3);

        return listaDeQuestoes;
    }
    public void imprimirQuestao(Questao questao){
        System.out.println("1 - " + questao.getTexto());
        System.out.println("1) " + questao.getAlternativas().get(0).getTexto());
        System.out.println("2) " + questao.getAlternativas().get(1).getTexto());
        System.out.println("3) " + questao.getAlternativas().get(2).getTexto());
    }

    public static int calcularResposta(int resposta, int alternativa, int pontuação) {
        if (resposta == alternativa) {
            System.out.println("Resposta do usuário: " + resposta);
            return pontuação + 1;
        } else {
            System.out.println("Resposta do usuário: " + resposta);
            return pontuação;
        }
    }
}
