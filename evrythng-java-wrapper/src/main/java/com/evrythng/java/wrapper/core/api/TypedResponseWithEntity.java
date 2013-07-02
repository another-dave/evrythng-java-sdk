/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 */
package com.evrythng.java.wrapper.core.api;

import org.apache.http.HttpResponse;

/**
 * Bundle both http response and response entities
 * 
 **/
public class TypedResponseWithEntity<T> {

	public final HttpResponse httpResponse;

	public final T entity;

	public TypedResponseWithEntity(HttpResponse httpResponse, T entity) {
		this.httpResponse = httpResponse;
		this.entity = entity;
	}

}
