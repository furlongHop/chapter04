package com.javaex.ex01;

public class PointApp {

	public static void main(String[] args) {
		
		
		Point p01 = new Point(5,7);
		Point p02 = new Point(10,5);
		
		/*
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		*/
		
		//class명↓ ↓변수 이름              ↓생성자
		PointList pList = new PointList();
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).toString());
		
		System.out.println(pList.get(1).getY());
		System.out.println(pList.get(1).toString());
		
		System.out.println(pList.size());
		
		Point p03 = new Point(155,90); //Point p03 새로 생성
		pList.add(p03); //pList 배열에 추가(입력)
		System.out.println(pList.size()); //관리중인 Point 개수 증가
		
	}

}
