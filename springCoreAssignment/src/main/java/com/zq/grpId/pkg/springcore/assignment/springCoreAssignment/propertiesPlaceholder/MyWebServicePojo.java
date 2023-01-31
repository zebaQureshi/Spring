package com.zq.grpId.pkg.springcore.assignment.springCoreAssignment.propertiesPlaceholder;

public class MyWebServicePojo {

	private String url;
	private String userName;
	private String password;

	MyWebServicePojo(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyWebServicePojo [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

	public String getUrl() {
		return url;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
