package idat.grupo7.pe.service;

import java.util.List;


import idat.grupo7.pe.model.Alumno;

public interface AlumnoService {

	void guardar(Alumno alumno);
	void actualizar(Alumno alumno);
	void eliminar(Integer id);
	List<Alumno> listar();
	Alumno obtener(Integer id);
	
}
