package Chap13;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<String,Integer> st = new Student<String,Integer>();
		
		Student<Integer,Integer> st2 = new Student<Integer,Integer>();
		st2.name = "Tracer";
		st2.number = 01012;
		st2.score = 90;
	}

}


class Student<T,Q>{
	String name;
	T number;
	Q score;
	
}















