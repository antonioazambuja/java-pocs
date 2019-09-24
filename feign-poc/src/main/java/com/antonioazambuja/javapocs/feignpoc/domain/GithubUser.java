package com.antonioazambuja.javapocs.feignpoc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubUser {
	
	@JsonProperty("login")
	private String login;
	@JsonProperty("public_repos")
	private Integer numberRepos;
	
	public GithubUser() { }
	
}
