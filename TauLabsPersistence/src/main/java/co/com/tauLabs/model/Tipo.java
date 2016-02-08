package co.com.tauLabs.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tipo implements Serializable, IEntity<Long> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo")
	private Long id;

	private String estado;

	private String nombre;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_padre")
	private Tipo tipo;

	@OneToMany(fetch=FetchType.LAZY,mappedBy="tipo")
	private List<Tipo> tipos;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="tipo")
	private List<Contenido> contenidos;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="tipo")
	private List<Entidad> entidades;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="tipo")
	private List<Item> items;

	public Tipo() {
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

	public List<Contenido> getContenidos() {
		return this.contenidos;
	}

	public void setContenidos(List<Contenido> contenidos) {
		this.contenidos = contenidos;
	}

	public Contenido addContenido(Contenido contenido) {
		getContenidos().add(contenido);
		contenido.setTipo(this);

		return contenido;
	}

	public Contenido removeContenido(Contenido contenido) {
		getContenidos().remove(contenido);
		contenido.setTipo(null);

		return contenido;
	}

	public List<Entidad> getEntidades() {
		return this.entidades;
	}

	public void setEntidades(List<Entidad> entidades) {
		this.entidades = entidades;
	}

	public Entidad addEntidade(Entidad entidade) {
		getEntidades().add(entidade);
		entidade.setTipo(this);

		return entidade;
	}

	public Entidad removeEntidade(Entidad entidade) {
		getEntidades().remove(entidade);
		entidade.setTipo(null);

		return entidade;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Item addItem(Item item) {
		getItems().add(item);
		item.setTipo(this);

		return item;
	}

	public Item removeItem(Item item) {
		getItems().remove(item);
		item.setTipo(null);

		return item;
	}

	public Tipo getTipo() {
		return this.tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public List<Tipo> getTipos() {
		return this.tipos;
	}

	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
	}

	public Tipo addTipo(Tipo tipo) {
		getTipos().add(tipo);
		tipo.setTipo(this);

		return tipo;
	}

	public Tipo removeTipo(Tipo tipo) {
		getTipos().remove(tipo);
		tipo.setTipo(null);

		return tipo;
	}

}