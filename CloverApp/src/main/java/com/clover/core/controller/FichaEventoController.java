package com.clover.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clover.core.serviceImpl.FichaEventoServiceImpl;

@RestController
@RequestMapping("/fichaEvento")
public class FichaEventoController
{
	@Autowired
	@Qualifier("FichaEventoService")
	private FichaEventoServiceImpl fichaEventoService;

	@GetMapping(value= {"/{idEvento}"}, produces="application/json;charset=UTF-8")
	public ResponseEntity<String> getFichaEvento(@PathVariable("idEvento") long idEvento)
	{
		try
		{
			String json = "Controlador funcionando\nPathVariable: " + idEvento + "\n";
			json += fichaEventoService.getFichaEvento(idEvento);

			return new ResponseEntity<String>(json, HttpStatus.OK);
		} catch (Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}