package pbp;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		//main data memory 
		String [] arrName = new String[100];
		String [] arrNumber = new String[100];
		String [] arrBirth = new String[100];
		int index= 0;


		System.out.println("Welcome to the PhoneBook");

		while(true) {
			System.out.println("===menu===");
			System.out.println("1. input the number");
			System.out.println("2. print out entire list");
			System.out.println("3. search number");
			System.out.println("4. Delete");
			System.out.println("5. Edit");
			System.out.println("Exit = q");

			String inputValue = scn.nextLine();

			if (inputValue.equals("1")){
				System.out.println("===begin input===");
				System.out.print("name >");
				String name = scn.nextLine();
				System.out.print("number >");
				String number = scn.nextLine();
				System.out.print("birth >");
				String birth = scn.nextLine();

				if(index>= arrName.length){
					String[] tempArrName = new String[2*arrName.length];
					String[] tempArrNumber = new String[2*arrNumber.length];
					String[] tempArrBirth = new String[2*arrBirth.length];

					for (int i=0;i<arrName.length;i++){
						tempArrName[i] = arrName[i];
						tempArrNumber[i] = arrNumber[i];
						tempArrBirth[i] = arrBirth[i];
					}
					arrName = tempArrName;
					arrNumber = tempArrNumber;
					arrBirth = tempArrBirth;
				}

				

				arrName[index] = name;
				arrNumber[index] = number;
				arrBirth[index] = birth;

				index+=1;

			}else if(inputValue.equals("2")){
				System.out.println("===printout List===");

				for (int i = 0; i<index;i++){
					System.out.println("name: "+arrName[i]+"\nnumber: "+arrNumber[i]+"\nbirth: "+ arrBirth[i]);

				}
				System.out.println("If you want to continue, Press Enter");
				scn.nextLine();

			}else if(inputValue.equals("3")){
				System.out.println("===begin searching===");
				System.out.print("input the name >");

				boolean isSearched = false;
				String name = scn.nextLine();
				for(int i=0;i<index;i++){
					if (arrName[i].equals(name)){
						System.out.println("number: "+arrNumber[i]+"\nbirth"+arrBirth[i]);
						isSearched = true;
						break;
					}
				}
				if (! isSearched) System.out.println("The name is not in the list. Please try another name.");

				System.out.println("If you want to continue, press Enter");
				scn.nextLine();

			}else if(inputValue.equals("4")){
				System.out.println("***Begin Deleting***");
				System.out.print("Input the name >");
				String name = scn.nextLine();

				boolean isSearched = false;
				for (int i=0;i<index;i++){
					if (arrName[i].equals(name)){
						isSearched = true;
						for(int j=i;j<index-1;j++){
							arrName[j] = arrName[j+1];
							arrNumber[j] = arrNumber[j+1];
							arrBirth[j] = arrBirth[j+1];
						}
						arrName[index] = null;
						arrNumber[index] = null;
						arrBirth[index] = null;

						index--;
					}break;
				}
				if (! isSearched) System.out.println("Nothing to delete");
				System.out.println("Finish Deleting");
				System.out.println("If you want to continue, press Enter");
				scn.nextLine();


			}else if(inputValue.equals("5")){
				System.out.println("===begin Editing===");
				System.out.print("input name you want to change > ");
				String name = scn.nextLine();
				
				boolean isSearched = false;
				for(int i=0;i<index;i++){
					if(arrName[i].equals(name)){
						
						System.out.print("input changed number >");
						String number = scn.nextLine();
						System.out.print("input changed birth >");
						String birth = scn.nextLine();

						isSearched = true;
						arrNumber[i] = number;
						arrBirth[i] = birth;
					}break;
				}
				if(! isSearched) System.out.println("Nothing to change");

				System.out.println("Finish Manipulating");
				System.out.println("If you want to continue, press Enter");
				scn.nextLine();

			}else if(inputValue.equals("q")){
				break;
			}

		}
	}

}
