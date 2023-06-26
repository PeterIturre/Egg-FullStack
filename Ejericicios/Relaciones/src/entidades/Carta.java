package entidades;

public class Carta {

    Palo palo;
    int numero;

    public Carta() {
    }

    public Carta(Palo palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + '}';
    }

}
