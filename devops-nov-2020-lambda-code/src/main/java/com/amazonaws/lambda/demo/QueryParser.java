package com.amazonaws.lambda.demo;

public class QueryParser {

	public String query;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public QueryParser(String query) {
		super();
		this.query = query;
	}

	public QueryParser() {

	}

}
