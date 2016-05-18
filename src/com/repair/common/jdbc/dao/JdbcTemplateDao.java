package com.repair.common.jdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.PreparedStatementCallback;

public interface JdbcTemplateDao {

	
	public List queryForList(String sql,Object[] params);
	
	public List queryForList(String sql);
	
	public Map queryForMap(String sql,Object[] params);
	
	public int queryForInt(String sql,Object[] params);
	
	public Long queryForLong(String sql,Object[] params);
	
	public void execute(String sql);
	
	public void execute(String sql, PreparedStatementCallback action);
	
	public int update(String sql,Object[] params);
	
	public int[] batchUpdate(String[] sql);
	
	public int[] batchUpdate(String sql, BatchPreparedStatementSetter pss);
	
	public Object queryForObject(String sql, Class type);
}
