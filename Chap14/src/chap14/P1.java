package chap14;
import java.util.*;

public class P1{
	public static void main(String[] args) {
//		Data [] arr = new Data[10];
//		arr[0] = new Data();
		
		//arrList<Data> arrList = new ArrayList<Data>();
		List<Data> arrList = new ArrayList<Data>(); //�� ���� �������̽��� List�� ��ӹ��� ��. 
		//List<Data> arrList = new LinkedList<Data>(); ����� ���� �ϱ� ���ؼ� �� �ȿ� �޽�带 �����. 
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