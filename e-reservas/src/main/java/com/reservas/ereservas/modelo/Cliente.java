/**
 * 
 */
package com.reservas.ereservas.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Clase que representa la tabla cliente
 * @author JP
 *
 */
/** Lombok reconoce que es un pojo y trata a la clase como privada */
@Data
@Entity
@Table(name = "cliente")
@NamedQuery(name="Cliente.findByRut", query="select c from Cliente c where c.rutCli =?1")

public class Cliente {
	@Id
	@GeneratedValue(generator ="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idCLi;
	private String nombreCli;
	private String apellidoCli;
	private String rutCli;
	private String direccionCli;
	private String fonoCli;
	private String emailCli;
	@OneToMany(mappedBy = "cliente")
	private Set<Reserva> reservas;

	public Cliente() {

	}

}
