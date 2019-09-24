package com.antonioazambuja.javapocs.feignpoc.operation;

import com.antonioazambuja.javapocs.feignpoc.domain.GithubUser;

import feign.Param;
import feign.RequestLine;

public interface FeignHttpClient {
	@RequestLine("GET /users/{userName}")
	GithubUser getUserGithub(@Param(value = "userName") String userName);
}
