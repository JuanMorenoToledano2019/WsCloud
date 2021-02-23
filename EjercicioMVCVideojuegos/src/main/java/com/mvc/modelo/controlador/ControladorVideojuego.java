package com.mvc.modelo.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.modelo.entidad.Videojuego;
import com.mvc.modelo.negocio.GestorVideojuego;

@Controller
public class ControladorVideojuego {
	
	@Autowired
	private GestorVideojuego gestorVideojuego;
	
	@PostMapping("doLogin")
	public String logarse(
			@RequestParam("nombre_usuario") String nombre,
			@RequestParam("pass") String password,
			Model model) {
		
		Videojuego videojuego = new Videojuego();
		videojuego.setNombre(nombre);
		videojuego.setPassword(password);
		
		boolean validado = gestorVideojuego.validarVideojuego(videojuego);
		
		if (validado) {
			model.addAttribute("nombreVideojuego", nombre);
			
			List<Videojuego> listaVideojuego = new ArrayList<>();
			Videojuego videojuego1 = new Videojuego();
			videojuego1.setNombre("Sonic");
			videojuego1.setPassword("674430");
			
			listaVideojuego.add(videojuego1);
			
			videojuego1 = new Videojuego();
			videojuego1.setNombre("Transformers");
			videojuego1.setPassword("956748");
			
			listaVideojuego.add(videojuego1);
			
			model.addAttribute("lista", listaVideojuego);
			return "inicio";
		}else {
			return "error";
		}
	}
}
