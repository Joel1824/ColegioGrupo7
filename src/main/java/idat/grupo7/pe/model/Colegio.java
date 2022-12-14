package idat.grupo7.pe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="colegios")
public class Colegio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idColegio;
	private String nombre;
	private String descripcion;
	public Integer getIdColegio() {
		return idColegio;
	}
	public void setIdColegio(Integer idColegio) {
		this.idColegio = idColegio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
