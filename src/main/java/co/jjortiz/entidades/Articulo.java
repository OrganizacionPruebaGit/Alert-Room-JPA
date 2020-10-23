package co.jjortiz.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Class for articles table mapping 
 * @author JUAN ORTIZ
 *
 */
@Entity
@Table(name = "articulos")
public class Articulo {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idarticulo")
	private Integer id;
	
	@Column(nullable = false , length = 50  )
	private String nombre;
	
	/**
	 * Constructor empty  
	 */
	public  Articulo() {

	}

	/**
	 * Class constructor using fields
	 * 
	 * @param id
	 * @param nombre
	 */
	public Articulo(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	

}
