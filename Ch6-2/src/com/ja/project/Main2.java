package com.ja.project;
import com.samsung.project.*;

public class Main2 {
	public static void main(String[] args) {
		Data ref = new Data();
//		ref.d +1; //None 
		
		StudentData ref2 = new StudentData();
		ref2.a = 10;
//		ref2.b = 20;
//		ref2.c = 30;
//		ref2.d = 30;
	}

}

class Data{
	//접근제한자 4가지 
	public int a;
	protected int b;
	int c;
	private int d;
	
	void test() {
		a = 10;
		b = 20;
		d = 40;
	}
}