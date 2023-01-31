package com.zq.spring.DependencyInjection.pkg1;

public class TrackCoach implements Coach{

private FortuneService ft;
	
TrackCoach(FortuneService f)
	{
		ft = f;
	}
	public void getDailyWorkOut()
	{
	 System.out.println("Run 5 km daily");
	}
	public void getDailyFortune()
	{
		ft.getFortuneService();
	}
}
