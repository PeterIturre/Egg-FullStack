package libreriapedros;

import libreriapedros.persitencia.LibroJpaController;
import libreriapedros.servicios.AutorServicio;
import libreriapedros.servicios.EditorialServicio;
import libreriapedros.servicios.LibroServicio;

public class LibreriaPedros {

    public static void main(String[] args) {

        LibroJpaController libroController = new LibroJpaController();
        
        LibroServicio ls = new LibroServicio();
        EditorialServicio es = new EditorialServicio();
        AutorServicio as = new AutorServicio();
        
        ls.ingresarLibro(es.cargarEditorial(), as.cargarAutor());
        
    }
}
