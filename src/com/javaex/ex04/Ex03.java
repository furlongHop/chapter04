package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		
		//HashSet을 이용해 로또 자동 생성기 제작
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		while(true) {//무한 루프
			if(iSet.size()>=6){//조건: 6개가 채워지면 탈출 (혹시 모를 사태에 대비하여 ==보다 >=가 더 안전)
				break;
			}
			int num = (int)(Math.random()*45)+1;//랜덤함수	
			System.out.println("생성된 숫자: "+num);//정말 중복을 거르는지 랜덤으로 나온 숫자 전부 확인
			iSet.add(num);//랜덤 숫자 num이 도출되면 iSet에 입력 ← 중복체크는 Set이 해결해준다.
		}	
		
		System.out.println("");
		for(Integer rotto : iSet) {//자동 unboxing(Integer>int)
			System.out.print(rotto+" ");
		}
		

		
	}

}
