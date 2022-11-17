package com.anudip.SpringDemo2;

import org.springframework.jdbc.core.JdbcTemplate;

import com.anudip.SpringDemo2.Agent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AgentDao {
	private JdbcTemplate jdbcTemplate;
	
	
	public int saveAgent(Agent a)
	{
		String query="insert into agent(id,name,area,commission) values(?,?,?,?)";
		return jdbcTemplate.update(query,a.getId(),a.getName(),a.getArea(),a.getAgent_commission());
	}

	public int updateAgent(Agent a)
	{
		String query="update agent set name='"+a.getName()+"',area='"+a.getArea()+"'where id='"+a.getId()+"'";
		return jdbcTemplate.update(query);
	}
	
	public int deleteAgent(Agent a)
	{
		String query="delete from agent where id='"+a.getId()+"'";
		return jdbcTemplate.update(query);
	}
	
}
