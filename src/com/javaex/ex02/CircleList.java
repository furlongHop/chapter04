package com.javaex.ex02;

import java.util.Arrays;

public class CircleList {

	private Circle[] cArray;
	private int crtPos;
	
	public CircleList() {
		cArray = new Circle[3];
		crtPos=0;
	}
	

	public void add(Circle c) {//칸을 채우면 옆 방으로 이동하기 위한 메소드
		cArray[crtPos] = c;
		crtPos++;
	}
	
	public Circle get(int index) {//배열의 index 방 주소를 리턴해주는 메소드
		Circle result = cArray[index];
		return result;
	}
	
	public int size() {
		return crtPos;
	}


	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
