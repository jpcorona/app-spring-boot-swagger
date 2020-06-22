/**
 * 
 */
package com.reservas.ereservas.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservas.ereservas.modelo.Cliente;

/**Interfaz para manejar las operaciones de  relacionadas con cliente
 * @author JP
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	/**
	 * Definición de método para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByRut (String rutCli);

}
