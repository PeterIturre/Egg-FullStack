package entidades;

public class JugadorRuleta {

    int id;
    String nombre;
    boolean muerto;

    public JugadorRuleta() {
    }

    public JugadorRuleta(int id, String nombre, boolean muerto) {
        this.id = id;
        this.nombre = nombre;
        this.muerto = muerto;
    }

    public JugadorRuleta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public boolean disparo(Revolver r) {
        if (r.disparar()) {
            muerto = false;
            r.siguienteRecamara();
            return true;
        } else {
            muerto = true;
            r.siguienteRecamara();
            return false;
        }
    }

}
