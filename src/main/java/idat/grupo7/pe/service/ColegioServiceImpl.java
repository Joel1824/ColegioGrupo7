package idat.grupo7.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.grupo7.pe.model.Colegio;
import idat.grupo7.pe.repository.ColegioRepository;
@Service
public class ColegioServiceImpl implements ColegioService {
	
	@Autowired
	private ColegioRepository repositorio;

	@Override
	public void guardar(Colegio colegio) {
		repositorio.save(colegio);

	}

	@Override
	public void actualizar(Colegio colegio) {
		repositorio.saveAndFlush(colegio);

	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Colegio> listar() {
		return repositorio.findAll();
	}

	@Override
	public Colegio obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
