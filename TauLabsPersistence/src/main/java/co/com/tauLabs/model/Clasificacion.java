package co.com.tauLabs.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the clasificacion database table.
 * 
 */
@Entity
@NamedQuery(name="Clasificacion.findAll", query="SELECT c FROM Clasificacion c")
public class Clasificacion implements Serializable, IEntity<Long> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clasificacion")
	private Long id;

	private String estado;

	private String nombre;

	//bi-directional many-to-one association to Item
	@OneToMany(mappedBy="clasificacion")
	private List<Item> items;

	public Clasificacion() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Item addItem(Item item) {
		getItems().add(item);
		item.setClasificacion(this);

		return item;
	}

	public Item removeItem(Item item) {
		getItems().remove(item);
		item.setClasificacion(null);

		return item;
	}

}