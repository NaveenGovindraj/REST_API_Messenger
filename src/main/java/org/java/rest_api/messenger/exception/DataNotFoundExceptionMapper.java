/*
 * package org.java.rest_api.messenger.exception;
 * 
 * import javax.ws.rs.core.Response; import javax.ws.rs.core.Response.Status;
 * import javax.ws.rs.ext.ExceptionMapper;
 * 
 * import org.java.rest_api.messenger.model.ErrorMessage;
 * 
 * //@Provider public class DataNotFoundExceptionMapper implements
 * ExceptionMapper<DataNotFoundException> {
 * 
 * @Override public Response toResponse(DataNotFoundException ex) { // TODO
 * Auto-generated method stub ErrorMessage errorMessage = new
 * ErrorMessage(ex.getMessage(), 404,
 * "http://restapi.exceptionhandling.test.org"); return
 * Response.status(Status.NOT_FOUND).entity(errorMessage).build(); }
 * 
 * }
 */