package com.example;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

/*
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
public class ClassA1Test {
	ObjectMapper mapper = new ObjectMapper();

	@Test
	public void builder() throws Exception {
		// final ClassB2<ClassP1> test = ClassB2.<ClassP1>builderB2().build();

		final ClassA1<ClassP1> classB2 = ClassA2.<ClassP1> builderB2().barB2("bar")
				.p(ClassP1.builder().value(123).build()).build();
		// classB2.setBarB2("bar");
		// classB2.setP(ClassP1.builder().value(123).build());
		String str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(classB2);
		System.out.println(str);

		final AbstractClassB abstractClassP = mapper.readValue(str, AbstractClassB.class);
		System.out.println(abstractClassP.getClass().getName());
	}

}