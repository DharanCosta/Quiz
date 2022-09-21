package Quiz.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Questão extends Quiz {

    private String texto;
    private int acertou;
    private ArrayList<String> alternativas;


    Questão(){
        alternativas.add("A) Compaixão, Conhecimento e Coragem\n " +
                        "B) Conhecimento, Colaboração e Comprometimento\n " +
                        "C) Colaboração, Correria e Coração \n");
        alternativas.add("A) 2010\n" +
                        "B) 2008\n" +
                        "C) 2009\n");
        alternativas.add("A) Carlos, Sergio e Marcelo\n" +
                        "B) Marcelo, Felipe e Sergio\n" +
                        "C) Sergio, Marcelo e Fernando\n");
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

    public ArrayList<String> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String alternativas) {
        this.alternativas.add(alternativas);
    }
}
