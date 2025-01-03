package com.gestion.finanzas.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.time.LocalDate;

@Entity
@Table(name = "control_finanzas")
public class Gasto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "titulo", nullable = false, length = 100)
	private String titulo; // Título o descripción del gasto

	@Column(name = "importe", nullable = false)
	private Double importe; // Monto del gasto

	@Column(name = "metodo_pago", nullable = false, length = 50)
	private String metodoPago; // Método de pago (efectivo, BBVA, PayPal, etc.)

	@Column(name = "fecha", nullable = false)
	private LocalDate fecha; // Fecha del gasto

	@Column(name = "categoria", nullable = false, length = 50)
	private String categoria; // Categoría (comida, gasolina, etc.)

	@Column(name = "nota", length = 255)
	private String nota; // Nota opcional para detalles adicionales

	// Constructores
	public Gasto() {
	}

	public Gasto(String titulo, Double importe, String metodoPago, LocalDate fecha, String categoria, String nota) {
		super();
		this.titulo = titulo;
		this.importe = importe;
		this.metodoPago = metodoPago;
		this.fecha = fecha;
		this.categoria = categoria;
		this.nota = nota;
	}

	// Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Gasto{" + "id=" + id + ", titulo='" + titulo + '\'' + ", importe=" + importe + ", metodoPago='"
				+ metodoPago + '\'' + ", fecha=" + fecha + ", categoria='" + categoria + '\'' + ", nota='" + nota + '\''
				+ '}';
	}
}
