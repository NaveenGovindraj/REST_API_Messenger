// This is an extra class to show some of the other available "Params" in JAX-RS
// Note: This class is not required to be used in the Messenger App

package org.java.rest_api.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class injectDemoResource {

	@GET
	@Path("annotations")
	public String getParamsUsingAnnotations(@MatrixParam("param") String matrixParam,
			@HeaderParam("authSessionID") String header, @CookieParam("name") String cookie) {

		return "Hola Amigo!!!" + "The Matrix param is :" + matrixParam + "The Header Param is :" + header
				+ "The Cookies param is :" + cookie;

	}

}
