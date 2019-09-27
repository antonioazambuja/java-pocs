package com.antonioazambuja.javapocs.ribbonpoc.ribbon;

import com.netflix.ribbon.RibbonRequest;
import com.netflix.ribbon.proxy.annotation.Http;
import com.netflix.ribbon.proxy.annotation.Http.HttpMethod;

import io.netty.buffer.ByteBuf;

public interface ServiceClient {
	
	@Http(method = HttpMethod.GET, uri = "")
	RibbonRequest<ByteBuf> getHelloWorld();

}
