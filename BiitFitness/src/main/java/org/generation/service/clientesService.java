package org.generation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.generation.entity.*;
import org.generation.Repository.*;

@Service
public class clientesService {

	@Autowired
	clientesRepository clientesRepository;
	
	public Iterable<clientes> getAllClientes(){
		return clientesRepository.findAll();
	}
	
	public clientes findClientesById(Long id) {
		return clientesRepository.findById(id).orElseThrow(
			()->new IllegalStateException
			("El usuario con el id " + id+ " no existe"));
	}
		
	public boolean existsClientesById(Long id) {
		return clientesRepository.existsById(id);
	}
	
	public void saveClientes(clientes customer) {
		clientesRepository.save(customer);
	}
	
}
