package idat.grupo7.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.grupo7.pe.model.Alumno;
@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

}
