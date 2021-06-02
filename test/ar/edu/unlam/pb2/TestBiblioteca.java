package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBiblioteca {

	@Test
	public void queSePuedaAgregarUnLibro() {
		Libro libro1 = new Libro(01, "Manual1", "Pepe", TiposDeLibros.GEOGRAFIA);
		
		Biblioteca biblioteca = new Biblioteca("Juana A.");
		
		biblioteca.agregarLibro(libro1);
		
		assertTrue(biblioteca.getLibro(libro1.getCodigo())!=null);
		
	}
	
	@Test
	public void queSePuedaDevolverUnLibro() {
		
		Libro libro1 = new Libro(01, "Manual1", "Pepe", TiposDeLibros.GEOGRAFIA);
		
		Biblioteca biblioteca = new Biblioteca("Juana A.");
		
		biblioteca.agregarLibro(libro1);
		biblioteca.prestarLibro(libro1);
		biblioteca.libroDevuelto(libro1);
		
		assertTrue(biblioteca.getLibro(libro1.getCodigo())!=null);
		assertTrue(biblioteca.getLibroPrestado(libro1.getCodigo())==null);
		
	}
	
	@Test
	public void queUnEstudianteNoPidaMasDeDosLibros() {
		
		Libro libro1 = new Libro(01, "Manual1", "Pepe", TiposDeLibros.GEOGRAFIA);
		Libro libro2 = new Libro(02, "Manual2", "Pepe", TiposDeLibros.GEOGRAFIA);
		Libro libro3 = new Libro(03, "Manual3", "Pepe", TiposDeLibros.GEOGRAFIA);
		
		Estudiante estudiante1 = new Estudiante(35722757, "Tkaczuk", "Ivanna");
		
		Biblioteca biblioteca = new Biblioteca("Juana A.");
		
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarLibro(libro3);
		estudiante1.pedirLibro(libro1);
		estudiante1.pedirLibro(libro2);
		estudiante1.pedirLibro(libro3);
		
		
		//assertEquals(biblioteca.getLibroPrestado(libro3.getCodigo()), actual);
		
	}
	
	@Test
	public void queSePuedaImprimirUnLibro() {
		Libro libro1 = new Libro(01, "Manual1", "Pepe", TiposDeLibros.GEOGRAFIA);
		
		Biblioteca biblioteca = new Biblioteca("Juana A.");
		
		
		biblioteca.agregarLibro(libro1);
		
		assertEquals("Geografia", biblioteca.serFotocopiable(libro1));
		
	}
	
	@Test
	public void queSePuedanContarLosLibrosPrestados() {
		
		Libro libro1 = new Libro(01, "Manual1", "Pepe", TiposDeLibros.GEOGRAFIA);
		
		Biblioteca biblioteca = new Biblioteca("Juana A.");

		
		biblioteca.agregarLibro(libro1);
		biblioteca.prestarLibro(libro1);
		
		
		assertEquals((Integer)1, biblioteca.cantidadLibrosPrestados());;
		
		
	}
}
