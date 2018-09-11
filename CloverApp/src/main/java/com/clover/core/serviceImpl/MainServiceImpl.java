package com.clover.core.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.core.mapper.MainMapper;
import com.clover.core.service.MainService;

@Service("MainService")
public class MainServiceImpl implements MainService
{
	@Autowired
	private MainMapper mainMapper;
	
	private static final Log logger = LogFactory.getLog(MainService.class);

	@Override
	public Map<String, Object> getEventos()
	{
		logger.info("Inicio getEventos");
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
