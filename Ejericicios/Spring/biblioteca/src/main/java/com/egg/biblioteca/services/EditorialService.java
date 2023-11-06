package com.egg.biblioteca.services;

import com.egg.biblioteca.entities.Editorial;
import com.egg.biblioteca.exceptions.MiException;
import com.egg.biblioteca.repositories.EditorialRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EditorialService {
    @Autowired
    EditorialRepository editorialRepository;

    @Transactional
    public void crearEditorial(String nombre) throws MiException {

        validar(nombre);

        Editorial editorial = new Editorial();

        editorial.setNombre(nombre);

        editorialRepository.save(editorial);
    }

    public List<Editorial> listarEditoriales() {

        List<Editorial> editoriales = new ArrayList<>();

        editoriales = editorialRepository.findAll();

        return editoriales;
    }

    public void modificarEditorial(String id, String nombre) throws MiException {

        validar(nombre);

        Optional<Editorial> respuestaEditorial = editorialRepository.findById(id);

        if (respuestaEditorial.isPresent()) {

            Editorial editorial = respuestaEditorial.get();

            editorial.setNombre(nombre);

            editorialRepository.save(editorial);
        }
    }

    private void validar(String nombre) throws MiException {
        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("El nombre de la editorial no puede ser nulo o estar vacio");
        }
    }
}
