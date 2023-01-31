package com.zq.spring.DependencyInjection.pkg1;

public class BaseBallCoach implements Coach {
	private FortuneService ft;
	
	BaseBallCoach(FortuneService f)
	{
		ft = f;
	}
	public void getDailyWorkOut()
	{
		System.out.println("Do bat practising");
	}
	
	public void getDailyFortune()
	{
		ft.getFortuneService();
	}
	
	

}
