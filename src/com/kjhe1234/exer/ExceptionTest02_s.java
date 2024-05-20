package com.kjhe1234.exer;

public class ExceptionTest02_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwTest(10, 0);
		} catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("0나누기 에러 발생!");
		}
		
		
	}

	public static void throwTest(int a, int b) throws ArithmeticException {
		System.out.println(a/b);
	}
	
	
}
