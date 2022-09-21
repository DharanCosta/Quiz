package Quiz.model;

import java.util.List;

public class Questao extends Quiz {

    private int numero;
    private String texto;
    private int acertou;
    private List<Alternativa> alternativas;

    public Questao(int numero, String texto, int acertou, List<Alternativa> alternativas) {
        this.numero = numero;
        this.texto = texto;
        this.acertou = acertou;
        this.alternativas = alternativas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getAcertou() {
        return acertou;
    }

    public void setAcertou(int acertou) {
        this.acertou = acertou;
    }

    public List<Alternativa> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<Alternativa> alternativas) {
        this.alternativas = alternativas;
    }
}
