package entidades;

public class Persona {

    String nombre;
    String apellido;
    DNI documento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, DNI documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DNI getDocumento() {
        return documento;
    }

    public void setDocumento(DNI documento) {
        this.documento = documento;
    }
}
