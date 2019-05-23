package com.spring.demo.model;

import org.springframework.data.annotation.Id;

public class Feature
{
	@Id
	private double release;
	private String owner;
	private String dependencies;
	private String comments;
	private String onfor;
	
	public double getRelease() {
		return release;
	}
	public void setRelease(double release) {
		this.release = release;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getDependencies() {
		return dependencies;
	}
	public void setDependencies(String dependencies) {
		this.dependencies = dependencies;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getOnfor() {
		return onfor;
	}
	public void setOnfor(String onfor) {
		this.onfor = onfor;
	}
	@Override
	public String toString() {
		return "Feature [release=" + release + ", owner=" + owner + ", dependencies=" + dependencies + ", comments="
				+ comments + ", on_for=" + onfor + "]";
	}
	
}
