import java.util.Arrays;

public class T2{
    public static void main(String[] args){
        int[] arr = {6,3,4,2,1,1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}