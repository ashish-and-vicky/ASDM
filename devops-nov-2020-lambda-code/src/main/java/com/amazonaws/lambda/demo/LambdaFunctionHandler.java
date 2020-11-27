package com.amazonaws.lambda.demo;

import java.util.LinkedList;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<QueryParser, JsonRespPojo> {

	public JsonRespPojo handleRequest(QueryParser request, Context context) {

		// context.getLogger().log("Input: " + input);

		System.out.println("Message from Event Input  : " + request.getQuery());

		LinkedList<DataPojo> result = JdbcConnector.runTestQuery(JdbcConnector.getCon(), request.getQuery());
		System.out.println("result" + result);

		return new JsonRespPojo(result);
	}

}
