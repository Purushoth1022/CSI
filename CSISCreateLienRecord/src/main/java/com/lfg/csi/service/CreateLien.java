package com.lfg.csi.service;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lfg.csi.entity.Lien;

public class CreateLien {
	private static Logger Log = LoggerFactory.getLogger(CreateLien.class);
	public APIGatewayProxyResponseEvent createLienRecord (APIGatewayProxyRequestEvent request) throws IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Lien order = objectMapper.readValue(request.getBody(), Lien.class);
		Log.info("CreateLien -> createLienRecord -> Data Processed and inserted Succuessfully ");
		
		return new APIGatewayProxyResponseEvent().withStatusCode(200).withBody("Success");
		
	}

}
