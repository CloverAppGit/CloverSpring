package com.clover.core.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper
{
	Map<String, Object> getUsuario(@Param("idUsuario") long idUsuario);
}
