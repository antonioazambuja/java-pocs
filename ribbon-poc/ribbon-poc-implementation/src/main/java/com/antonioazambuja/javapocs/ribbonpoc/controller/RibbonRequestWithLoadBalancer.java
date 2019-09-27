package com.antonioazambuja.javapocs.ribbonpoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.antonioazambuja.javapocs.ribbonpoc.ribbon.ServiceClient;
import com.netflix.client.config.CommonClientConfigKey;
import com.netflix.config.ConfigurationManager;
import com.netflix.ribbon.Ribbon;

import io.netty.buffer.ByteBuf;
import rx.Observable;

@RestController
public class RibbonRequestWithLoadBalancer {
	
	private ServiceClient serviceClient;
	
	@RequestMapping(method = RequestMethod.GET)
	public void getHelloWorldsWithLoadbalancer() {
		ConfigurationManager.getConfigInstance().setProperty("ServiceClient.ribbon." + CommonClientConfigKey.MaxAutoRetriesNextServer, "10");
		ConfigurationManager.getConfigInstance().setProperty("ServiceClient.ribbon." + CommonClientConfigKey.ListOfServers, "localhost:6001,localhost:6002");
		this.serviceClient =  Ribbon.from(ServiceClient.class);
		for(int i = 0; i < 3; i++) {
			Observable<ByteBuf> result = serviceClient.getHelloWorld().observe();
			System.out.println(result);
		}
	}

}
