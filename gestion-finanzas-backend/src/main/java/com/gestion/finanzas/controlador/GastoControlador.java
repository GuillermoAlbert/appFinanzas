package com.gestion.finanzas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.finanzas.modelo.Gasto;
import com.gestion.finanzas.repositorio.GastoRepositorio;

@RestController
@RequestMapping("/api/v1/")
public class GastoControlador {

	@Autowired
	private GastoRepositorio repositorio;

	@GetMapping("/gastos")
	public List<Gasto> listarTodosLosEmpleados() {
		return repositorio.findAll();
	}
}