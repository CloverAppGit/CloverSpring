package com.clover.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clover.core.serviceImpl.LoginServiceImpl;

@RestController
@RequestMapping("/login")
public class LoginController
{
	@Autowired
	@Qualifier("LoginService")
	private LoginServiceImpl loginService;

	@GetMapping(value= {"/{idUsuario}"}, produces="application/json;charset=UTF-8")
	public ResponseEntity<String> getFichaEvento(@PathVariable("idUsuario") long idUsuario)
	{
		try
		{
			String json = "Controlador funcionando\nHola Usuario!\n";
			json += loginService.login(idUsuario);

			return new ResponseEntity<String>(json, HttpStatus.OK);
		} catch (Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}