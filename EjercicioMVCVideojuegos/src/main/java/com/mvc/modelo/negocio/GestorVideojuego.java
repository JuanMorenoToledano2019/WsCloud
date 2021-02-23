package com.mvc.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.modelo.entidad.Videojuego;
import com.mvc.modelo.persistencia.DaoVideojuego;

@Service
public class GestorVideojuego {
	
	@Autowired
	private DaoVideojuego daoVideojuego;
	
	public boolean validarVideojuego(Videojuego videojuego) {
		Videojuego videojuegoAux = daoVideojuego.findByNombreAndPassword(videojuego.getNombre(), 
				videojuego.getPassword());
		
		if (videojuegoAux == null) {
			return false;
		} else {
			return true;
		}
	}
}
