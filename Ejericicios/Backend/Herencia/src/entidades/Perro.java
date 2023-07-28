package entidades;

public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }
    
}
