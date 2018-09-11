package com.clover.core.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CrearEventoMapper
{
	Map<String, Object> getActividades();
}
