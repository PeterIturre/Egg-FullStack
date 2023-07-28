package Entidades;

public class Cadena {

    private String frase;
    private int longitudFrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitudFrase = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }
}
