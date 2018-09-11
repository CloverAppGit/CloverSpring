package com.clover.core.serviceImpl;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.core.mapper.FichaEventoMapper;
import com.clover.core.service.FichaEventoService;

@Service("FichaEventoService")
public class FichaEventoServiceImpl implements FichaEventoService
{
//	@Autowired
//	@Qualifier("UsuarioRepo")
//	private UsuarioRepo usuarioRepo;
//	
//	@Autowired
//	@Qualifier("ActividadRepo")
//	private ActividadRepo actividadRepo;
//	
	@Autowired
	private FichaEventoMapper fichaEventoMapper;
	
	private static final Log logger = LogFactory.getLog(FichaEventoService.class);

	@Override
	public Map<String, Object> getFichaEvento(long idEvento)
	{
		logger.info("Inicio getFichaEvento");
		try
		{
			Map<String, Object> result = fichaEventoMapper.getGeneral(idEvento);
			result.put("Servicio", "Working...");
			
			return result;
		} catch (Exception ex)
		{
			logger.error(ex.getMessage());
			return null;
		}
	}
}
