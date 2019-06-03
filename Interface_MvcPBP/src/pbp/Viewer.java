package pbp;

import java.util.Scanner;

public class Viewer{
    private Scanner scn;
    
    public Viewer(){
        scn = new Scanner(System.in);
    }
    //Method..
    public void hello(){
        System.out.println("====Welcome to the PhoneBooKProgram====");
    }
    public void goodbye(){
        System.out.println("Exit from program. \n  Thank you for using PhoneBookProgram.");
    }

    public void showMenu(){
        System.out.println("***Menu***");
        System.out.println("1. Add number");
        System.out.println("2. Show the list");
        System.out.println("3. Search number");
        System.out.println("4. Delete number");
        System.out.println("5. Edit number");
    }

    public String InputMenuValue(){
        System.out.print("ют╥б> ");
        return scn.nextLine();
    }

    public void invalidValue(){
        System.out.print("Invalid Number. \nPlz try again");
    }

    public void showInputGuide(){
        System.out.println("====Starting the Input====");
        System.out.println("Enter the name, number and birth");
    }

    public String InputName(){
        System.out.print("Enter the name>");
        return scn.nextLine();
    }

    public String InputNumber(){
        System.out.print("Enter the number>");
        return scn.nextLine();
    }

    public String InputBirth(){
        System.out.print("Enter the birth>");
        return scn.nextLine();
    }

    public void showResultInput(){
        System.out.println("The value has been appropriately entered.");
    }

    public void pause(){
        System.out.println("Press \"enter\" if you want to continue");
    scn.nextLine();
    }
    public void showList(PBData [] arrList){
        for(int i =0;i< arrList.length; i++){
            if(arrList[i] == null){
                break;
            }
            System.out.println("name: "+arrList[i].getName()+"number: "+arrList[i].getNumber()+"birth: "+ arrList[i].getBirth());
        }
    }
    
}