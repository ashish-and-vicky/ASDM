package com.amazonaws.lambda.demo;

import java.util.LinkedList;

public class JsonRespPojo {

	LinkedList<DataPojo> sqlrow;

	public JsonRespPojo(LinkedList<DataPojo> sqlrow) {
		super();
		this.sqlrow = sqlrow;
	}
	public JsonRespPojo() {
		
	}

	public LinkedList<DataPojo> getSqlrow() {
		return sqlrow;
	}

	public void setSqlrow(LinkedList<DataPojo> sqlrow) {
		this.sqlrow = sqlrow;
	}
	
}
