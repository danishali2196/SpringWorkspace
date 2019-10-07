package com.nt.test;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("HI! Danish");
		
		ApplicationContext ctx = null;
		JobLauncher launcher= null;
		Job job = null;
		JobExecution execution = null;
		
		ctx = new ClassPathXmlApplicationContext("com/nt/cfg/simple-job.xml");
		
		launcher = ctx.getBean("jobLancher", JobLauncher.class);
		
		job = (Job) ctx.getBean("mySimpleJob");
		
		try {
			
				execution = launcher.run(job, new JobParameters());
				System.out.println("Job Exit Status :: "+execution.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
