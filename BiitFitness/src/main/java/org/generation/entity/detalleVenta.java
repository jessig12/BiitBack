package org.generation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class detalleVenta {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="id_Detalle")
	private Long idDetalle;
	
	@ManyToOne
	@JoinColumn(name="id_Venta")
	private ventas idVenta;
	
	@ManyToOne
	@JoinColumn(name="id_Producto")
	private  Productos idProducto;
	
	@Column(name="cantidad")
	private Long cantidad;
	@Column(name="descuento")
	private Double descuento;
	
	
	public Long getIdDetalle() {
		return idDetalle;
	}
	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
	}
	/*public Long getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}*/
	
	
	/*public Productos getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}*/
	
	
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
}
