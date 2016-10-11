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
public class AbstractClassPTest {
	ObjectMapper mapper = new ObjectMapper();

	@Test
	public void checkSubType() throws Exception {
		ClassP1 p1 = ClassP1.builder().value(42).build();
		String str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(p1);
		System.out.println(str);

		final AbstractClassP abstractClassP = mapper.readValue(str, AbstractClassP.class);
		System.out.println(abstractClassP.getClass().getName());
		// assertThat(abstractClassP.getClass(), Matchers.is(ClassP1.class));
	}

}