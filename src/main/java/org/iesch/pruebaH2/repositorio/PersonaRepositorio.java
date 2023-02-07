package org.iesch.pruebaH2.repositorio;

import org.iesch.pruebaH2.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona,Long> {
}
