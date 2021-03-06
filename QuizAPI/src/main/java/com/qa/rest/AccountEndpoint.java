package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.qa.business.service.AccountService;


@Path("/account")
public class AccountEndpoint {


	@Inject
	private AccountService service;
	
	@Path("/getAccount")
	@GET
	@Produces({ "application/json" })
	public String getAccount() {
		return service.getAccount();
	}
	

	@Path("/createAccount")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		return service.addAccount(account);
	}
	

	@Path("/deleteAccount/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Long id) {
		return service.deleteAccount(id);
	}
	
	@Path("/updateAccount/{id}")
	@DELETE 
	@Produces({"application/json"})
	public String updateAccount(@PathParam("id") Long id, String account) {
		return service.updateAccount(id, account);
	}
	
	public void setService(AccountService service) {
		this.service = service;
	}
}
