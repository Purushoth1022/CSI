package com.lfg.annuity.csi.lambda;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.lfg.csi.service.CreateLien;

public class CSISCreateLienRecord implements RequestHandler<APIGatewayProxyRequestEvent , APIGatewayProxyResponseEvent> {

	private static Logger Log = LoggerFactory.getLogger(CSISCreateLienRecord.class);
	public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent request, Context context){
		Log.info("CSIServiceCreateLienHandler is Up and Processing Record");
		 CreateLien create = new CreateLien();
		 try {
			 return create.createLienRecord(request);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new APIGatewayProxyResponseEvent().withStatusCode(500).withBody("Faiure");
		}
		
	}

}
