import java.util.Scanner;
public class sorting{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = Integer.parseInt(scn.nextLine());
        int[] arr = new int [N];
        for (int i=0;i<N;i++){
            arr[i] = Integer.parseInt(scn.nextLine());
        }
        
        //bubble sorting
        for(int i =0;i<arr.length;i++){
            for(int x = 0; x<arr.length-i-1; x++){
                if(arr[x] > arr[x+1]){
                    int temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = temp;
                }

            }
        }
        for(int data:arr){
            System.out.println("bubble array: "+ data);
        }

        //selection
        for (int i =0; i<arr.length; i++){
            for (int x=i+1; x< arr.length; x++){
                if (arr[i]> arr[x]){
                    int temp = arr[i];
                    arr[i] = arr[x];
                    arr[x] = temp;
                }
            }

        }
        for(int data:arr){
            System.out.println("selection array: "+ data);
        }

        //insertion

        int i =1;
        while (true){
            int key = arr[i];
            int j = i -1;
            while(true){
                if(key>=arr[j]) break;
                arr[j + 1] = arr[j];
                j--;
                if(j<0) break;
            }
            arr[j+1] = key;
            i++;
            if (i>arr.length) break;
       }

       for(int data:arr) System.out.println("insertion = "+data);
    }
}
