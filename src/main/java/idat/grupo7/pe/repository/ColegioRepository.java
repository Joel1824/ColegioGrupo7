package idat.grupo7.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.grupo7.pe.model.Colegio;
@Repository
public interface ColegioRepository extends JpaRepository<Colegio, Integer>{

}
