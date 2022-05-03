package pe.edu.upc.controladores;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Academia;
import pe.edu.upc.entidades.Estudiante;
import pe.edu.upc.service.AcademiaService;
import pe.edu.upc.service.IEstudianteService;

@Named
@RequestScoped
public class LoginController {

	@Inject
	private AcademiaService  aService;
	private Academia academia;
	
	
	@Inject
	private IEstudianteService  esService;
	private Estudiante estudiante;
	
	@PostConstruct
	public void init() {
		
	}
	
	
	
}
