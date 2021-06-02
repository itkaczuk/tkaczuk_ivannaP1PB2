package ar.edu.unlam.pb2;

public class Libro {

	private Integer codigo;
	private String nombre;
	private String autor;
	private TiposDeLibros tipodeDeLibros;
	public Libro(Integer codigo, String nombre, String autor, TiposDeLibros tipodeDeLibros) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
		this.setTipodeDeLibros(tipodeDeLibros);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public TiposDeLibros getTipodeDeLibros() {
		return tipodeDeLibros;
	}

	public void setTipodeDeLibros(TiposDeLibros tipodeDeLibros) {
		this.tipodeDeLibros = tipodeDeLibros;
	}
	
}
