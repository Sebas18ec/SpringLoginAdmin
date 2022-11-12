package com.login.usuarios.servicio;



import java.util.List;


import com.login.usuarios.modelo.*;

public interface EstudianteServicio {
	
	public List<Estudiante> listarEstudiantes();
	
	public Estudiante guardarEstudiante(Estudiante estudiante);
	
	public Estudiante obtenerEstudiantePorId(Long id);
	
	public Estudiante actualizarEstudiante(Estudiante estudiante);
	
	public void eliminarEstudiante(Long id);

}
