package com.kjhe1234.exer;

public class ExceptionTest01_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {
//			int a = 10;
//			int sum = a / 0;    // 0 나누기 에러 발생!
//			
//			System.out.println(sum);
//			
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("0나누기 에러 발생!! 다시 확인하세요!");
//		} catch (NullPointerException e) {
//			System.out.println("null 값을 가리키고 있습니다!! 다시 확인하세요");
//			
//		}

		try {
			int a = 10;
			int sum = a / 0;    // 0 나누기 에러 발생!
			
			System.out.println(sum);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0나누기 에러 발생!! 다시 확인하세요!");
			e.printStackTrace();   // 에러코드를 콘솔창에 출력해줌
		} finally {
			System.out.println("에러의 발생 여부와 상관없이 실행됨!!");
		}
		
		
	}

}
