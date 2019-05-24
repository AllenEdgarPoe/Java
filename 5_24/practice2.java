public class practice2{
    public static void main(String[] args){
        //double array
        int[][] arr = new int[3][4];
        arr[0][0] = 0;
        arr[0][1] = 1;
        arr[2][3] = 2;

        for(int i=0;i<arr.length;i++){ 
            for(int data:arr[i]){
                System.out.println(data);
            }
        }
    }
}