package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		//도형 생성
		Point p01 = new Point(4,7);
		Point p02 = new Point(6,19);
		
		Circle c01 = new Circle(5);
		
		//포인트(점) 관리
		MyList pList =new MyList();
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.get(0).toString());
		
		//Circle(원) 관리
		MyList<Circle> cList = new MyList<Circle>();
		cList.add(c01);
		//cList.add(p01); Object로 관리시 범용적이라 좋으나 이런 경우도 발생.
		//배열 이름과 상관 없이 아무 클래스나 들어올 수 있기 때문에 섞이는 것을 방지 못한다.
		//그래서 <> 사용. <>안에 관리할 클래스 배열을 한정시키고 사용한다.
		//제너릭으로 정의한 클래스 이외의 다른 값은 오류로 인식.
		
		System.out.println(cList.get(0).getRadius());
		
		System.out.println(cList.get(0).toString());
		
		
	}
	
	
}
