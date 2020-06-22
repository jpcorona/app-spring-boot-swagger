/**
 * 
 */
package com.reservas.ereservas.vista.resources.vo;

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
@Data
public class ClienteVO {

	private String nombreCli;
	private String apellidoCli;
	private String rutCli;
	private String direccionCli;
	private String fonoCli;
	private String emailCli;
	
}
