package com.crud.cerveceria.service;

import java.util.List;

import com.crud.cerveceria.model.Cerveza;

public interface CervezaService {
	public List<Cerveza> listarTodasLasCervezas();
	
	public Cerveza crearCerveza(Cerveza cerveza);
	
	public Cerveza obtenerCervezaPorId(Long id);
	
	public Cerveza actualizarCerveza(Cerveza cerveza);
	
	public void eliminarCerveza(Long id);
	
}
