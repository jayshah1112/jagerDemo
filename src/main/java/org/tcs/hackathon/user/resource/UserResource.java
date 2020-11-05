package org.tcs.hackathon.user.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.bson.types.ObjectId;
import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;


import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.health.Readiness;
import javax.enterprise.context.ApplicationScoped;

import org.jboss.logging.Logger;

@Path("/user")
@Consumes("application/json")
@Produces("application/json")
@Liveness
@Readiness
@ApplicationScoped
public class UserResource {
	
		
		private static final Logger LOG = Logger.getLogger(UserResource.class);
	
	    
	    @GET
	    @Path("/hello")
	    public String count() {
			LOG.info("MY COUNT VALUE IS ");
	        return "Hello Jagger";
	    }
	    
}
