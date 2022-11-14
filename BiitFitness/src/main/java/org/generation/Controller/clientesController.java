package org.generation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.generation.entity.*;
import org.generation.service.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class clientesController {

	@Autowired
	clientesService subirClientes;
	
	@GetMapping("/customer/{id}") //localhost:8080/api/customer/id
	public @ResponseBody clientes getClientesById(@PathVariable("id") Long id) {
		return subirClientes.findClientesById(id);
	}
	
	@GetMapping("/customer") //localhost:8080/api/customer
	public @ResponseBody Iterable<clientes> getAllClientes() {
		return subirClientes.getAllClientes();
	}
	
	
}