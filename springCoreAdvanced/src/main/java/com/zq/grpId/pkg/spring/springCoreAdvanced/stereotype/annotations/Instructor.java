package com.zq.grpId.pkg.spring.springCoreAdvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst") // to indicate spring to create an object for this class
@Scope("prototype") // for determining the scope of the objects
public class Instructor {

	@Value("20") // to inject values
	private int id;
	@Value("Zeba Qureshi")
	private String name;

	@Value("#{myTopics}")
	private List<String> topics;

	@Autowired
	@Qualifier("myProfile")  //asking for name specific bean , by default name is camel case class name
	private Profile profile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
