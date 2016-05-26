package com.test.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

@ApiModel
public final class Greeting {

	private final long id;

	@JsonProperty(required = true)
	@ApiModelProperty(position = 1, notes = "Name of the user", required = true)
	private final String name;

	public Greeting(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
