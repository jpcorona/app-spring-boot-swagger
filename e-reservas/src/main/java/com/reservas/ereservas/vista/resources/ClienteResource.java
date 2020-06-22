/**
 * 
 */
package com.reservas.ereservas.vista.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservas.ereservas.modelo.Cliente;
import com.reservas.ereservas.negocio.services.ClienteService;
import com.reservas.ereservas.vista.resources.vo.ClienteVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Clase que representa webservice cliente
 * 
 * @author JP
 *
 */
@RestController
@RequestMapping("api/cliente")
@Api(tags = "cliente")
public class ClienteResource {

	private final ClienteService clienteservice;

	public ClienteResource(ClienteService clienteservice) {
		this.clienteservice = clienteservice;
	}

	@PostMapping
	@ApiOperation(value = "Crear Cliente", notes = "Servicio para crear un nuevo cliente")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Cliente creado correctamente"),
			@ApiResponse(code = 400, message = "Solicitud inválida") })
	public ResponseEntity<Cliente> crearCliente(@RequestBody ClienteVO clientevo) {
		Cliente cliente = new Cliente();
		cliente.setNombreCli(clientevo.getNombreCli());
		cliente.setApellidoCli(clientevo.getApellidoCli());
		cliente.setDireccionCli(clientevo.getDireccionCli());
		cliente.setFonoCli(clientevo.getFonoCli());
		cliente.setEmailCli(clientevo.getEmailCli());

		return new ResponseEntity<>(this.clienteservice.create(cliente), HttpStatus.CREATED);
	}

	@PutMapping("/{rut}")
	@ApiOperation(value = "Actualizar Cliente", notes = "Servicio para actualizar un cliente")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Cliente actualizado correctamente"),
			@ApiResponse(code = 404, message = "No se encontro cliente") })
	public ResponseEntity<Cliente> updateCliente(@PathVariable("rut") String rut, ClienteVO clientevo) {

		Cliente cliente = this.clienteservice.findByRut(rut);
		if (cliente == null) {
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
		} else {
			cliente.setNombreCli(clientevo.getNombreCli());
			cliente.setApellidoCli(clientevo.getApellidoCli());
			cliente.setDireccionCli(clientevo.getDireccionCli());
			cliente.setFonoCli(clientevo.getFonoCli());
			cliente.setEmailCli(clientevo.getEmailCli());
		}
		return new ResponseEntity<>(this.clienteservice.create(cliente), HttpStatus.OK);
	}

	@DeleteMapping("/{rut}")
	@ApiOperation(value = "Eliminar Cliente", notes = "Servicio para eliminar cliente")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Cliente eliminado correctamente"),
			@ApiResponse(code = 404, message = "No se encontro cliente") })
	public void removeCliente(@PathVariable("rut") String rut) {
		Cliente cliente = this.clienteservice.findByRut(rut);

		if (cliente != null) {
			this.clienteservice.delete(cliente);
		}
	}

	@GetMapping
	@ApiOperation(value = "Listar Clientes", notes = "Servicio para listar todos los clientes")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Clientes encontrados"),
			@ApiResponse(code = 404, message = "No se encontraron clientes") })
	public ResponseEntity<List<Cliente>> findAll() {
		return ResponseEntity.ok(this.clienteservice.findAll());
	}

}
