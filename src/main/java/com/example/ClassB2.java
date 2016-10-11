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

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClassB2<P extends AbstractClassP> extends AbstractClassB {
	String barB2;
	P p;

	public ClassB2(String barB, String barB2, P p) {
		super(barB);
		this.barB2 = barB2;
		this.p = p;
	}

	public static ClassB2Builder builderB2() {
		return new ClassB2Builder();
	}

	public static class ClassB2Builder<PP extends AbstractClassP> {
		private String barB;
		private String barB2;
		private PP p;

		ClassB2Builder() {
		}

		public ClassB2.ClassB2Builder barB(String barB) {
			this.barB = barB;
			return this;
		}

		public ClassB2.ClassB2Builder barB2(String barB2) {
			this.barB2 = barB2;
			return this;
		}

		public ClassB2.ClassB2Builder p(PP p) {
			this.p = p;
			return this;
		}

		public ClassB2<PP> build() {
			return new ClassB2(barB, barB2, p);
		}

		public String toString() {
			return "com.example.ClassB2.ClassB2Builder(barB=" + this.barB + ", barB2="
					+ this.barB2 + ", p=" + this.p + ")";
		}
	}
}
