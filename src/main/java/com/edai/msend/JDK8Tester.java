package com.edai.msend;

import java.util.Arrays;
import java.util.stream.Stream;

public class JDK8Tester {

	interface MathOperation {
		int operation(int a, int b);
	}
	
	public static void main(String[] args) {
		MathOperation mathOperation = (a, b) -> a - b;
		Stream.of(Arrays.asList("aa", "bb", "cc", "dd"));
	}
	
}
