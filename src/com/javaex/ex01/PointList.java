package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	private Point[] pArray; //Point 주소를 관리할 배열
	private int crtPos; //current Position: 현재 위치, 0에서 시작
	//→차곡차곡 배열 안에 주소를 넣기 위해 값을 넣을 공간 앞에 위치하는 필드(감시자 역할)
	
	public PointList() {
		this.pArray = new Point[3];
		this.crtPos = 0;
	}
	
	public void add(Point p) {//칸을 채우면 옆 방으로 이동하기 위한 메소드
		pArray[crtPos] = p;
		crtPos++;
	}
	
	public Point get(int index) {//배열의 index 방 주소를 리턴해주는 메소드
		Point result = pArray[index];
		return result;
	}
	
	public int size() {
		return crtPos;
	}

	
	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
	
}
