package pbp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		//핵심 데이터 메모리 생성...
		//String [][] arrData = new String[100][3];
		String [] arrName = new String[1];
		String [] arrNumber = new String[1];
		String [] arrBirth = new String[1];
		int indexCount = 0;
		
		
		
		
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
			
			if(inputValue.equals("1")) {
				//입력 로직...
				System.out.println("===입력 시작===");
				System.out.print("이름 입력>");
				String name = scn.nextLine();
				System.out.print("번호 입력>");
				String number = scn.nextLine();
				System.out.print("생년 입력>");
				String birth = scn.nextLine();
				
				if(indexCount >= arrName.length) {
					
					String [] tempArrName = new String[arrName.length*2];
					String [] tempArrNumber = new String[arrNumber.length*2];
					String [] tempArrBirth = new String[arrBirth.length*2];
					
					for(int i = 0 ; i < arrName.length ; i++) {
						tempArrName[i] = arrName[i];
						tempArrNumber[i] = arrNumber[i];
						tempArrBirth[i] = arrBirth[i];
					}
					
					arrName = tempArrName;
					arrNumber = tempArrNumber;
					arrBirth = tempArrBirth;
					
				}
				
				arrName[indexCount] = name;
				arrNumber[indexCount] = number;
				arrBirth[indexCount] = birth;
				
				indexCount++;
				
				System.out.println("입력이 완료 되었습니다.");
				System.out.println("계속 하시려면 enter...");
				scn.nextLine();
				
				
				
			}else if(inputValue.equals("2")) {
				//전체 리스트 출력
				System.out.println("====리스트 출력====");
				
				for(int i = 0 ; i < indexCount ; i++) {
					System.out.println("이름 : " + arrName[i] + ", 번호 : " + arrNumber[i] + ", 생년 : " + arrBirth[i]);               
				}
				
				System.out.println("계속 하시려면 enter....");
				scn.nextLine();
				
				
			}else if(inputValue.equals("3")) {
				//검색
				System.out.println("===검색 시작===");
				System.out.println("검색할 대상의 이름을 입력하세요.");
				System.out.print("입력>");
				
				String name = scn.nextLine();
				
				boolean isSearched = false;
				
				for(int i = 0 ; i < indexCount ; i++) {
					if(arrName[i].equals(name)) {
						System.out.println("이름 : " + arrName[i] + ", 번호 : " + arrNumber[i] + ", 생일 : " + arrBirth[i]);
						isSearched = true;
					}
				}
				
				if(isSearched == false) {
					System.out.println("검색된 결과가 없습니다.");
				}
				
				System.out.println("계속 하시려면 enter...");
				scn.nextLine();
				
			}else if(inputValue.equals("4")) {
				//삭제
				System.out.println("===삭제 수행??====");
				System.out.println("삭제할 이름을 입력하세요.");
				System.out.print("입력>");
				
				String name = scn.nextLine();
				
				for(int i = 0 ; i < indexCount ; i++) {
					if(arrName[i].equals(name)) {
						
						for(int j = i ; j < indexCount - 1; j++) {
							arrName[j] = arrName[j+1];
							arrNumber[j] = arrNumber[j+1];
							arrBirth[j] = arrBirth[j+1];
						}
						
						arrName[indexCount] = null;
						arrNumber[indexCount] = null;
						arrBirth[indexCount] = null;
						
						indexCount--;
					}
				}
				
				System.out.println("삭제 완료...");
				System.out.println("계속 하시려면...enter....");
				scn.nextLine();
				
				
				
			}else if(inputValue.equals("5")) {
				//수정
				
			}else {
				//예외 처리....
				System.out.println("잘못된 값을 입력하셨습니다.");
				System.out.println("계속 하시려면 enter키를 누르세요.");
				scn.nextLine();
			}
			
			
			
		}
		
		
		
		
	}

}


