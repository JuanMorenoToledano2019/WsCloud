package com.mvc.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.modelo.entidad.Videojuego;

@Repository
public interface DaoVideojuego extends JpaRepository<Videojuego, Integer>{
	
	public Videojuego findByNombre(String nombre);
	
	public Videojuego findByNombreAndPassword(String nombre, String password);
}
