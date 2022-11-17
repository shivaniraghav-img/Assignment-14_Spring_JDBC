package com.anudip.SpringDemo2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*Lombok Annotation*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Agent {
    {
		// TODO Auto-generated constructor stub
	}
   private int id;
   private String name;
   private String area;
   private int agent_commission;
}
