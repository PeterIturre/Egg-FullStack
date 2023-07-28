package libreriapedros.servicios;

import libreriapedros.entidades.Autor;
import libreriapedros.entidades.Editorial;
import libreriapedros.entidades.Libro;
import libreriapedros.persitencia.LibroJpaController;

public class LibroServicio {

    LibroJpaController libroController = new LibroJpaController();
    
    public void ingresarLibro(Editorial editorial, Autor autor) {  
        Libro libro = new Libro();
        libro.setAlta(true);
        libro.setAnio(1958);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setEjemplares(3);
        libro.setEjemplaresPrestados(2);
        libro.setEjemplaresRestantes(1);
        libroController.create(libro);
    }
    
}
