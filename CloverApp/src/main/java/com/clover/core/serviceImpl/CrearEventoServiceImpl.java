package com.clover.core.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.core.mapper.CrearEventoMapper;
import com.clover.core.service.CrearEventoService;

@Service("CrearEventoService")
public class CrearEventoServiceImpl implements CrearEventoService
{
	@Autowired
	private CrearEventoMapper crearEventoMapper;
	
	private static final Log logger = LogFactory.getLog(CrearEventoService.class);

	@Override
	public Map<String, Object> getActividades()
	{
		logger.info("Inicio getActividades");
		try
		{
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("Servicio", "Working...");
			
			return result;
		} catch (Exception ex)
		{
			logger.error(ex.getMessage());
			return null;
		}
	}
}
