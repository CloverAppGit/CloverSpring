package com.clover.core.serviceImpl;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.core.mapper.LoginMapper;
import com.clover.core.service.LoginService;

@Service("LoginService")
public class LoginServiceImpl implements LoginService
{
	@Autowired
	private LoginMapper loginMapper;
	
	private static final Log logger = LogFactory.getLog(LoginService.class);

	@Override
	public Map<String, Object> login(long idUsuario)
	{
		logger.info("Inicio login");
		try
		{
//			Map<String, Object> result = new HashMap<String, Object>();
			Map<String, Object> result = loginMapper.getUsuario(idUsuario);
			
			return result;
		} catch (Exception ex)
		{
			logger.error(ex.getMessage());
			return null;
		}
	}

}
