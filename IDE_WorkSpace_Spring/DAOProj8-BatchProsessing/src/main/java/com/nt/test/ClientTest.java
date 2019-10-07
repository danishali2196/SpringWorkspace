package com.nt.test;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.PassengerDTO;
import com.nt.service.PassengerMgmtService;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PassengerMgmtService service=null;
		Scanner scn=null;
		String name=null,source=null,dest=null;
		int price=0,count=0;
		List<PassengerDTO> listDTO=new ArrayList();
		PassengerDTO dto=null;
		
		scn=new Scanner(System.in);
		System.out.println("Enter No of  Passenger:");
		count=scn.nextInt();
		System.out.println("Enter Source");
		source=scn.next();
		System.out.println("Enter Destination");
		dest=scn.next();
		System.out.println("Enter Price");
		price=scn.nextInt();
		for (int i =1; i <=count; i++) {
			System.out.println("Enter  Passenger Name:");
			name=scn.next();
			dto=new  PassengerDTO();
			dto.setName(name);
			dto.setSource(source);
			dto.setDest(dest);
			dto.setPrice(price);
			
			listDTO.add(dto);	
		}
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		service=ctx.getBean("pService", PassengerMgmtService.class);
		
		
		System.out.println(service.insertPassenger(listDTO));
		
		((AbstractApplicationContext) ctx).close();

	}

}
