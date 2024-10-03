package com.crud.cerveceria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.cerveceria.model.Cerveza;
import com.crud.cerveceria.repository.CervezaRepository;

@Service
public class CervezaServiceImpl implements CervezaService {
	@Autowired
	private CervezaRepository repositorio;

	@Override
	public List<Cerveza> listarTodasLasCervezas() {
		return repositorio.findAll();
	}

	@Override
	public Cerveza crearCerveza(Cerveza cerveza) {
		return repositorio.save(cerveza);
	}

	@Override
	public Cerveza obtenerCervezaPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Cerveza actualizarCerveza(Cerveza cerveza) {
		return repositorio.save(cerveza);
	}

	@Override
	public void eliminarCerveza(Long id) {
		repositorio.deleteById(id);
		
	}


	

	
	

}
