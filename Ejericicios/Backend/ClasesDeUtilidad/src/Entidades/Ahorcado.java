package Entidades;

public class Ahorcado {

    private String[] buscar;
    private int letrasEncontradas;
    private int jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String palabra) {
        this.buscar = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            buscar[i] = palabra.substring(i, i + 1);
        }
    }

    public String[] getBuscar() {
        return buscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
}

