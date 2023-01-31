package com.zq.grpId.pkg.spring.springCoreAdvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myProfile")  //defining name of the created bean
public class Profile {

	@Value("student")
	private String title;
	
	@Value("MyCompany")
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
