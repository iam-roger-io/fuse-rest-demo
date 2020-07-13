package com.redhat.consulting.fuse.processor;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.oorsprong.websamples.ArrayOftContinent;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.redhat.consulting.fuse.model.ContinentModel;

@Component
public class ProcessorDemo implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		//Response of WebService in the  generated class(CXF maven plugin) ArrayOftContinent
		ArrayOftContinent list = exchange.getIn().getBody(ArrayOftContinent.class);

		List<ContinentModel> listModel = new ArrayList<ContinentModel>();

		list.getTContinent().stream().forEach( (item) -> listModel.add(new ContinentModel(item.getSCode(), item.getSName() )));	
		
		ObjectMapper objectMapper = new ObjectMapper();		
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		exchange.getIn().setBody(objectMapper.writeValueAsString(listModel));
		
	}

}
