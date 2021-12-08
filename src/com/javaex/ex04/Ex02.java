package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//정수형 관리
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		int i04 = 100; 
		Integer i05 = new Integer(3);
		Integer i06 = new Integer(4);

		
		//제너릭 문법에 따르면 <> 안에는 반드시 클래스가 와야한다. 기본 자료형은 올 수 없다.
		//Set<int> pList = new HashSet<int>();
		Set<Integer> iSet = new HashSet<Integer>();
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);//int>Integer로 자동 boxing(wrapper class 참조)↓toString()이 없는데도 오류가 생기지 않는 이유
		iSet.add(i05);//개수에 포함 안 됨
		iSet.add(i06);
		
		iSet.remove(i06);
		iSet.remove(7);//Integer는 삭제할 값 직접 입력 가능
		
		System.out.println("개수: "+iSet.size());//i05,i07은 중복되기 때문에 들어가지 않는다. Set은 중복 저장이 불가능하다.
		
		for(Integer no : iSet) {//방 번호를 정할 수 없다. 나와 상관 없이 무작위로 도출된다.
			System.out.println(no.toString());
		}
		
		
		
		System.out.println("------------------");
		
		//Point 관리
		Point p01 = new Point(3,13); //16
		Point p02 = new Point(4,14); //18
		Point p03 = new Point(5,15); //20
		Point p04 = new Point(3,13); //16
		Point p05 = new Point(6,10); //16
		
		Set<Point> pSet = new HashSet<Point>();//섞어쓴 이유: 추후 제너릭 사용을 위해(인터페이스 사용시 자주 이용되는 방식)
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		pSet.add(p05);
		
		//pSet.remove(3,13); > 이 경우엔 메소드가 없기 때문에 값을 입력해서는 지워지지 않는다.
		pSet.remove(p01);//정상 작동
		
		System.out.println("개수: "+pSet.size());
		
		for(Point p : pSet) {
			System.out.println(p.getX());
		}
		
		System.out.println(pSet.toString());
	}
	
}
