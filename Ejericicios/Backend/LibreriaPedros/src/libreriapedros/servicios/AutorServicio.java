package libreriapedros.servicios;

import libreriapedros.entidades.Autor;
import libreriapedros.persitencia.AutorJpaController;

public class AutorServicio {

    AutorJpaController autorControl = new AutorJpaController();
    
    public Autor cargarAutor() {
        Autor autor = new Autor();
        autor.setNombre("Ernesto");
        autor.setApellido("Ernesto");
        autorControl.create(autor);
        
        return autor;
    }
    
}
