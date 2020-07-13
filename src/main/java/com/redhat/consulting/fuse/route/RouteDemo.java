package com.redhat.consulting.fuse.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.SerializationFeature;

@Component
public class RouteDemo extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		restConfiguration()
			.component("spark-rest").contextPath("rest").port(8082) 
			.bindingMode(RestBindingMode.json)
			.apiProperty("api.description", "Exemplo basico com Fuse");

		rest("/demo")
			.produces("application/json")
			.get("/continents")
			.to("direct:get-continents");

		 JacksonDataFormat jacksonDataFormat = new JacksonDataFormat();
		    jacksonDataFormat.setPrettyPrint(true);
		    jacksonDataFormat.enableFeature(SerializationFeature.WRAP_ROOT_VALUE);
		
		from("direct:get-continents")		
		.bean("countryInfoServiceSoapType", "listOfContinentsByCode")		
		.to("processorDemo");

		
	}
}
