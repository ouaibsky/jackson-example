package com.example;/*
					* Copyright 2015 the original author or authors.
					*
					* Licensed under the Apache License, Version 2.0 (the "License");
					* you may not use this file except in compliance with the License.
					* You may obtain a copy of the License at
					*
					* http://www.apache.org/licenses/LICENSE-2.0
					*
					* Unless required by applicable law or agreed to in writing, software
					* distributed under the License is distributed on an "AS IS" BASIS,
					* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
					* See the License for the specific language governing permissions and
					* limitations under the License.
					*/

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@JsonSubTypes(value = { @JsonSubTypes.Type(value = ClassA1.class, name = "A1"),
		@JsonSubTypes.Type(value = ClassA2.class, name = "A2") })
public abstract class AbstractClassA<B extends AbstractClassB> {
	String type;
	String fooA;
	List<B> bb;

	public AbstractClassA(String type, String fooA, List<B> bb) {
		this.type = type;
		this.fooA = fooA;
		this.bb = bb;
	}
}
