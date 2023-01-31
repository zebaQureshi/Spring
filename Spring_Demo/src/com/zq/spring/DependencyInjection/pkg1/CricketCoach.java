package com.zq.spring.DependencyInjection.pkg1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CricketCoach implements Coach,DisposableBean,InitializingBean	 {
	private FortuneService fortuneService;
	
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService f1)
	{
		fortuneService=f1;
	}

	@Override
	public void getDailyWorkOut() {
		System.out.println("Practise ball catching for cricket");

	}

	@Override
	public void getDailyFortune() {
		fortuneService.getFortuneService();
		System.out.println(" You got it, just husstle");

	}
	void myinitMethodHere()
	{
		System.out.println("inside myinitMethodHere");
		
	}
	public void destroy()
	{
		System.out.println("inside DestroyMethod");
	}

	void myDestroyMethod()
	{
		System.out.println("inside my DestroyMethod");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside afterproperty set method");
		
	}
}
