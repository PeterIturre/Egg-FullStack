package entidades;

public class DNI {

    String serie;
    long numero;

    public DNI() {
    }

    public DNI(String serie, long numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
    
}
