package com.egg.biblioteca.services;

import com.egg.biblioteca.entities.Autor;
import com.egg.biblioteca.exceptions.MiException;
import com.egg.biblioteca.repositories.AutorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    @Transactional
    public void crearAutor(String nombre) throws MiException {
        validar(nombre);

        Autor autor = new Autor();

        autor.setNombre(nombre);

        autorRepository.save(autor);
    }

    public List<Autor> listarAutores() {
        List<Autor> autores = new ArrayList<>();

        autores = autorRepository.findAll();

        return autores;
    }

    public void modificarAutor(String nombre, String id) throws MiException {
        validar(nombre);

        Optional<Autor> respuestaAutor = autorRepository.findById(id);

        if (respuestaAutor.isPresent()) {
            Autor autor = respuestaAutor.get();
            autor.setNombre(nombre);
            autorRepository.save(autor);
        }
    }

    public Autor getOne(String id) {
        return autorRepository.getOne(id);
    }

    public void validar(String nombre) throws MiException {
        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("El nombre del autor no puede ser nulo o estar vacio");
        }
    }
}
