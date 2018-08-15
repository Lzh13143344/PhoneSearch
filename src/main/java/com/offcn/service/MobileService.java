package com.offcn.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.po.Mobile;

public interface MobileService {

	@GET
	@Path("/get/{mobileNumber}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Mobile getByMNumberForClient(@PathParam("mobileNumber") String mobileNumber);
	
	public Mobile getByMNumber(String mobileNumber);
}
