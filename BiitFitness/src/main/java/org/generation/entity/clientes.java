package org.generation.entity;

import javax.persistence.*;




@Entity
@Table(name="clientes_biit")
public class clientes {
	
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY )
		@Column(name="idCliente")
		private Long idCliente;
		@Column(name="nombre", length=150)
		private String nombre;
		@Column(name="apellido", length=150)
		private String apellido;
		@Column(name="movil")
		private Long movil;
		@Column(name="direccion", length=200)
		private String direccion;
		
		
		public Long getIdCliente() {
			return idCliente;
		}
		public void setIdCliente(Long idCliente) {
			this.idCliente = idCliente;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public Long getMovil() {
			return movil;
		}
		public void setMovil(Long movil) {
			this.movil = movil;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		

		

	}

