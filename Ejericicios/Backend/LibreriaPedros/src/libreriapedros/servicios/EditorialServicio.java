package libreriapedros.servicios;

import libreriapedros.entidades.Editorial;
import libreriapedros.persitencia.EditorialJpaController;

public class EditorialServicio {

    EditorialJpaController editorialController = new EditorialJpaController();

    public Editorial cargarEditorial() {
        Editorial editorial = new Editorial();
        editorial.setNombre ("Ibrea");
        editorial.setAlta(true);
        editorialController.create(editorial);
        
        return editorial;
    }

}
