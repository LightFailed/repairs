package com.repair.common.jdbc.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.repair.common.jdbc.dao.JdbcTemplateDao;


public class JdbcTemplateDaoImpl extends JdbcDaoSupport implements JdbcTemplateDao {

	
	public List queryForList(String sql,Object[] params){
		if(params==null)
			return this.getJdbcTemplate().queryForList(sql);
		else
			return this.getJdbcTemplate().queryForList(sql,params);
	}
	
	public List queryForList(String sql) {
		return this.getJdbcTemplate().queryForList(sql);
	}
	
	public Map queryForMap(String sql,Object[] params){
		if(params==null)
			return this.getJdbcTemplate().queryForMap(sql);
		else
			return this.getJdbcTemplate().queryForMap(sql,params);
	}
	
	public int queryForInt(String sql,Object[] params){
		if(params==null)
			return this.getJdbcTemplate().queryForInt(sql);
		else
			return this.getJdbcTemplate().queryForInt(sql,params);
	}
	
	public Long queryForLong(String sql,Object[] params){
		if(params==null)
			return this.getJdbcTemplate().queryForLong(sql);
		else 
			return this.getJdbcTemplate().queryForLong(sql, params);
	}
	
	public void execute(String sql){
		this.getJdbcTemplate().execute(sql);
	}
	
	public void execute(String sql, PreparedStatementCallback action){
		this.getJdbcTemplate().execute(sql, action);
	}
	
	public int update(String sql,Object[] params){
		if(params==null)
			return this.getJdbcTemplate().update(sql);
		else
			return this.getJdbcTemplate().update(sql,params);
	}
	
	public int[] batchUpdate(String[] sql) {
		return this.getJdbcTemplate().batchUpdate(sql);
	}
	
	public int[] batchUpdate(String sql, BatchPreparedStatementSetter pss) {
		return this.getJdbcTemplate().batchUpdate(sql, pss);
	}
	
	public Object queryForObject(String sql, Class type){
		return this.getJdbcTemplate().queryForObject(sql, type);
	}
}
