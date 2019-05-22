import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = Integer.parseInt(scn.nextLine());

        int first = 0;
        int end = 1;
        int count = 0;
        
        while(count<num-1){
            int temp = first;
            first = end;
            end = temp+end;

            count++;
        }
    System.out.println("The "+num+" th Fibonacci number is "+end);
    }
}