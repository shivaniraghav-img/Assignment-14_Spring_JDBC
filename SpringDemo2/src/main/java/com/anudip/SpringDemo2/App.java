package com.anudip.SpringDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
    	JdbcTemplate  template=context.getBean("jdbcTemplate",JdbcTemplate.class);
    	
   
    
    	AgentDao a1=(AgentDao)context.getBean("a2");
    	
    	/*INSERT QUERY*/
    	int sp= a1.saveAgent(new Agent(101,"Mansi","Rajendra Park",4));
    	System.out.println(sp);
    	AgentDao a2=(AgentDao)context.getBean("a2");
    	int st= a2.saveAgent(new Agent(102,"Divya","Shanti Nagar",6));
    	System.out.println(st);
    	AgentDao a3=(AgentDao)context.getBean("a2");
    	int sv= a3.saveAgent(new Agent(103,"Shivani","Shyam Kunj",5));
    	System.out.println(sv);
    	AgentDao a4=(AgentDao)context.getBean("a2");
    	int sc= a4.saveAgent(new Agent(104,"Kusum","Ganga Nagar",6));
    	System.out.println(sc);
    	AgentDao a5=(AgentDao)context.getBean("a2");
    	int sq= a5.saveAgent(new Agent(105,"Preeti","Model Town",3));
    	System.out.println(sq);
    	
    	
        /*UPDATE QUERY*/
    	int sp1=a1.updateAgent(new Agent(101,"Ajay","Gandhi Nagar",8));
    	System.out.println(sp1);
    	
    	/*DELETE QUERY*/
    	int sp2=a1.deleteAgent(new Agent(101,"Ajay","Gandhi Nagar",8));
    	System.out.println(sp2);
    	
    }
}

