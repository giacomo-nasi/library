package it.html.tutorial.library.api;

import javax.ws.rs.Path;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Request;

@Path("notifications")
public class Notifications {
	int newId;
	
	@POST
	public String notifyChildCreation(NotificationObject noti) throws URISyntaxException	{
//		String s = noti.toString();
//		System.out.println(s);
		
//		NotificationObject nObj = new NotificationObject();
		System.out.println(noti.toString());
		
//		newId = newId++;
//		return Response.created(new URI("notifications/" + newId)).build();
		
		return noti.toString();
	}
}
