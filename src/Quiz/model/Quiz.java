package Quiz.model;

import java.util.List;

public abstract class Quiz {
    private String nomeDoQuiz = "Quiz Iteris";
    private List<Questão> listaDeQuestoes;


    public String getNomeDoQuiz() {
        return nomeDoQuiz;
    }

    public List<Questão> getListaDeQuestoes() {
        return listaDeQuestoes;
    }

//    public boolean acertou(String entrada, )
}
