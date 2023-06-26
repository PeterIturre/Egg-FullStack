package entidades;

public class Revolver {

    int posicionActual;
    int posicionBala;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionBala) {
        this.posicionActual = posicionActual;
        this.posicionBala = posicionBala;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    public void llenarRevolver() {
        posicionActual = (int) (Math.random() * 7) + 1;
        posicionBala = (int) (Math.random() * 7) + 1;
    }

    public boolean disparar() {
        return posicionActual == posicionBala;
    }

    public void siguienteRecamara() {
        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
            posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionBala=" + posicionBala + '}';
    }
}
