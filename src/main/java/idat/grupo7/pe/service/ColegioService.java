package idat.grupo7.pe.service;

import java.util.List;

import idat.grupo7.pe.model.Colegio;


public interface ColegioService {

	void guardar(Colegio colegio);
	void actualizar(Colegio colegio);
	void eliminar(Integer id);
	List<Colegio> listar();
	Colegio obtener(Integer id);
}
