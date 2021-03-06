package com.example;
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

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClassP2 extends AbstractClassP {
	String foobar;

	@Builder
	public ClassP2(String foobar) {
		super("P2");
		this.foobar = foobar;
	}
}
