package com.clover.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clover.core.serviceImpl.CrearEventoServiceImpl;

@RestController
@RequestMapping("/crearEvento")
public class CrearEventoController
{
	@Autowired
	@Qualifier("CrearEventoService")
	private CrearEventoServiceImpl crearEventoService;

	@GetMapping(value= {"/{tipo}"}, produces="application/json;charset=UTF-8")
	public ResponseEntity<String> getActividades(@PathVariable("tipo") String tipo)
	{
		try
		{
			String json = "Controlador funcionando\n";
			json += crearEventoService.getActividades();

			return new ResponseEntity<String>(json, HttpStatus.OK);
		} catch (Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
