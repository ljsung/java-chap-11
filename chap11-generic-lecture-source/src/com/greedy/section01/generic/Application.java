package com.greedy.section01.generic;

import java.util.List;

public class Application {

	public static void main(String[] args) {
	
		/* 제네릭(generic)
		 * 데이터 타입을 일반화 한다.
		 * 
		 * JDK 1.5에서 추가된 문법이다.
		 * 데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입들을 가질 수 있는 기술에 중점을 두어
		 * 재사용성을 높일 수 있는 프로그래밍 방식이다.
		 * */
		GenericTest<Integer> gt1 = new GenericTest<Integer>();
		gt1.setValue(1);
		System.out.println(gt1.getValue());
		System.out.println(gt1.getValue() instanceof Integer);
		
		/* JDK 7부터 타입 선언 시 타입변수가 작성되면 타입 추론이 가능학 ㅣ때문에
		 * 생성자 호출 구문 쪽의 타입을 생략하고 사용할 수 있게 되었다.
		 * 단, 타입이 명시되지 않은 빈 다이아몬드 연산자는 사용해야 한다.*/
		GenericTest<String> gt2 = new GenericTest<>();
		gt2.setValue("홍길동");
		System.out.println(gt2.getValue());
		System.out.println(gt2.getValue() instanceof String);
		
//		List<String> list = new ArrayList<>();
//		list.add("1234");
//		list.add(1234);
//		
//		List<Integer> list 2 = new ArrayList<>();
//		list2.add(1234);
//		list2.add("1234");
	}

}
