package Quiz.model;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String nomeDoQuiz = "Quiz Iteris";
    private List<Questao> listaDeQuestoes;

    private int nota;

    public String getNomeDoQuiz() {
        return nomeDoQuiz;
    }

    public List<Questao> getListaDeQuestoes() {
                return listaDeQuestoes;
    }

}
