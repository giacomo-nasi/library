package it.html.tutorial.library.api;

import java.awt.Container;
import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.core.Response;

public class ReqAndResp<E> {
	
	public void filter(ContainerRequestContext requestContext)
			throws IOException {
	}
	
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
	}
	
	Response toResponse(E exception) {
		return null;
	}
	
	public void onStartup(Container container) {
	}
	public void onReload(Container container) {
	}
	public void onShutdown(Container container) {
	}

}
