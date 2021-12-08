package com.javaex.ex04;

import java.util.LinkedList;
//import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		 
		Point p01 = new Point(2,12);
		Point p02 = new Point(3,13);
		Point p03 = new Point(7,17);
		
		//List<Point> pList = new ArrayList<Point>(); //섞어쓰기한 이유 잘 이해하기!!
		//↓바꿔 쓰기 위해 섞어 썼다.List는 바꾸지 않고 ArrayList만 수정하면 된다.
		List<Point> pList = new LinkedList<Point>();

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size()); //개수 출력하기
		
		//관리되고 있는 Point에 접근하기
		System.out.println(pList.get(1).getX());//getX>Point에 있는 메소드
		//System.out.println(pList.get(1).toString());
		
		//전체 출력하기
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i).toString());//get()>list에 있는 메소드
		}
		System.out.println("");
		
		//데이터 지우기
		pList.remove(1);
		pList.remove(p02);
		
		System.out.println(pList.size());
		for(int i=0 ; i<pList.size() ; i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("");
		
		pList.add(1, p02);
		for(int i=0 ; i<pList.size() ; i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("");
		
		System.out.println(pList.toString());
		
		System.out.println("");
		//향상된 for문(항상 처음부터 끝까지)
		for(Point p : pList) {//하나 담을 그릇(임의로 지은 이름):전체 <한 번에 담을 수 없다. 하나씩 일하자.
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		

	}

}
