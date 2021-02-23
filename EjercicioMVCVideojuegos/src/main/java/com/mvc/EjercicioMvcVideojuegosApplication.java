package com.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mvc.modelo.entidad.Videojuego;
import com.mvc.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class EjercicioMvcVideojuegosApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioMvcVideojuegosApplication.class, args);
		
		DaoVideojuego dv = context.getBean("daoVideojuego", DaoVideojuego.class);
		
		Videojuego v = new Videojuego();
		v.setNombre("marvel");
		v.setPassword("145354");
		
		dv.save(v);
	}

}
