package Quiz.model;

import java.util.List;

public class Alternativa{
    private Letra letra;
    private String texto;
    private boolean certo;

//    public Alternativa(int numero, String texto, int acertou, List<Alternativa> alternativas, Letra letra, String texto1, boolean certo) {
//        super(numero, texto, acertou, alternativas);
//        this.letra = letra;
//        this.texto = texto1;
//        this.certo = certo;
//    }

    public Alternativa(Letra letra, String texto, boolean certo) {
        this.letra = letra;
        this.texto = texto;
        this.certo = certo;
    }

    public Letra getLetra() {
        return letra;
    }

    public void setLetra(Letra letra) {
        this.letra = letra;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCerto() {
        return certo;
    }

    public void setCerto(boolean certo) {
        this.certo = certo;
    }
}
