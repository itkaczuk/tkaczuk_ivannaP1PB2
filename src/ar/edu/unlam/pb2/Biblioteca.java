package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;


public class Biblioteca {

	private String nombre;
	private Set<Libro> libros;
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.libros = new HashSet<Libro>();
	}
	
	public void agregarLibro() {
		
	}
	
	public void prestarLibro(Estudiante estudiante, Libro libroPedido) {
		//if(libroPedido esta disponible se elimina de la biblioteca )
	}
	
	public Integer cantidadLibrosPrestados() {
		return Integer;
	}
	
	public void libroDevuelto() {
		
	}
	
	
}
