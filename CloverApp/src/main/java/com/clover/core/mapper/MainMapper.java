package com.clover.core.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MainMapper
{
	List<Map<String, Object>> getEventos(@Param("idUsuario") long idUsuario);
}
