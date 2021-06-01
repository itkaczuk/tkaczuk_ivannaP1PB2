package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;


public class Biblioteca {

	private String nombre;
	private Set<Libro> libros;
	private Set<Libro> librosPrestados;
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.libros = new HashSet<Libro>();
	}
	
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}
	
	private Libro getLibro(Integer codigo) {
		for(Libro libro : libros) {
			if(libro.getCodigo().equals(codigo)){
				return libro;
			}
		}return null;
	}
	
	public void prestarLibro(Libro libroPedido) {
		if(getLibro(libroPedido.getCodigo())==null) {	
		}
		librosPrestados.add(libroPedido);
		libros.remove(libroPedido);
	}
	
	public Integer cantidadLibrosPrestados() {
		return librosPrestados.size();
	}
	
	public void libroDevuelto(Libro libroDevuelto) {
		librosPrestados.remove(libroDevuelto);
		libros.add(libroDevuelto);
	}
	
	public void imprimirLibros() {
		
	}
}
