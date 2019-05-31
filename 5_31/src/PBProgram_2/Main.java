package PBProgram_2;

import java.util.Scanner;

public class Main {

	static Scanner scn = new Scanner(System.in);
	//핵심 데이터 메모리 생성..		
	static PBData [] arrPbData = new PBData[100];
	static int indexCount = 0;	
	
	public static void main(String[] args) {
		
		System.out.println("전화번호부 프로그램에 오신걸 환영합니다.!!!");
		
		while(true) {
			
			System.out.println("===메뉴===");
			System.out.println("1.전화번호 입력");
			System.out.println("2.전체 리스트 출력");
			System.out.println("3.검색");
			System.out.println("4.전화번호 삭제");
			System.out.println("5.전화번호 수정");
			System.out.print("입력 (종료=q)>");
			String inputValue = scn.nextLine();
			
			if(inputValue.equals("q")) {
				System.out.println("프로그램이 종료됩니다.");
				System.out.println("이용해주셔서 ㄳ 합니다.");
				break;
			}

			switch(inputValue) {
			case "1":
				input();
				break;
			case "2":
				showList();
				break;
			case "3":
				search();
				break;
			case "4":
				delete();
				break;
			case "5":
				update();
				break;
			default:
				//예외 처리....
				System.out.println("잘못된 값을 입력하셨습니다.");
				System.out.println("계속 하시려면 enter키를 누르세요.");
				scn.nextLine();
			}
		}
	}
	
	public static void input() {
		//입력 로직...
		System.out.println("===입력 시작===");
		System.out.print("이름 입력>");
		String name = scn.nextLine();
		System.out.print("번호 입력>");
		String number = scn.nextLine();
		System.out.print("생년 입력>");
		String birth = scn.nextLine();
		
		if(indexCount >= arrPbData.length) {
			
			PBData [] tempArr = new PBData[arrPbData.length*2];
			
			for(int i = 0 ; i < arrPbData.length ; i++) {
				tempArr[i] = arrPbData[i];
			}
			
			arrPbData = tempArr;
			
		}
		
		arrPbData[indexCount] = new PBData(name, number, birth);
		
		indexCount++;
		
		System.out.println("입력이 완료 되었습니다.");
		System.out.println("계속 하시려면 enter...");
		scn.nextLine();		
	}
	public static void showList() {
		//전체 리스트 출력
		System.out.println("====리스트 출력====");
		
		for(int i = 0 ; i < indexCount ; i++) {
			System.out.println("이름 : " + arrPbData[i].getName() + ", 번호 : " + arrPbData[i].getNumber() + ", 생년 : " + arrPbData[i].getBirth());               
		}
		
		System.out.println("계속 하시려면 enter....");
		scn.nextLine();
	}
	public static void search() {
		//검색
		System.out.println("===검색 시작===");
		System.out.println("검색할 대상의 이름을 입력하세요.");
		System.out.print("입력>");
		
		String name = scn.nextLine();
		
		boolean isSearched = false;
		
		for(int i = 0 ; i < indexCount ; i++) {
			if(arrPbData[i].getName().equals(name)) {
				System.out.println("이름 : " + arrPbData[i].getName() + ", 번호 : " + arrPbData[i].getNumber() + ", 생일 : " + arrPbData[i].getBirth());
				isSearched = true;
			}
		}
		
		if(isSearched == false) {
			System.out.println("검색된 결과가 없습니다.");
		}
		
		System.out.println("계속 하시려면 enter...");
		scn.nextLine();		
	}
	public static void delete() {
		//삭제
		System.out.println("===삭제 수행??====");
		System.out.println("삭제할 이름을 입력하세요.");
		System.out.print("입력>");
		
		String name = scn.nextLine();
		
		for(int i = 0 ; i < indexCount ; i++) {
			if(arrPbData[i].getName().equals(name)) {
				
				for(int j = i ; j < indexCount - 1; j++) {
					arrPbData[j] = arrPbData[j+1];
				}
				
				arrPbData[indexCount] = null;
				
				indexCount--;
			}
		}
		
		System.out.println("삭제 완료...");
		System.out.println("계속 하시려면...enter....");
		scn.nextLine();		
	}
	public static void update() {
		
	}
}
[출처] 전화번호 코드 클래스 조금 사용|작성자 s001lec

