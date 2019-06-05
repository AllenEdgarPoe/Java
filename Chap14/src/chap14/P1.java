package chap14;
import java.util.*;

public class P1{
	public static void main(String[] args) {
//		Data [] arr = new Data[10];
//		arr[0] = new Data();
		
		//arrList<Data> arrList = new ArrayList<Data>();
		List<Data> arrList = new ArrayList<Data>(); //이 경우는 인터페이스인 List를 상속받은 것. 
		//List<Data> arrList = new LinkedList<Data>(); 상속을 쉽게 하기 위해서 그 안에 메쏘드를 맞췄다. 
		arrList.add(new Data());
		arrList.add(new Data());
		arrList.add(new Data());
		arrList.add(new Data());
		arrList.remove(0);
		arrList.remove(3);
		
		arrList.size();
	}
}

class Data{
	int a;
	
}