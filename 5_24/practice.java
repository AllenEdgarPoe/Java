public class practice{
    public static void main(String[] args){
        int [] newArr = new int[5];
        for(int i=0;i<newArr.length;i++){
            newArr[i] = i+1;
        }
        // for(int i=0; i<newArr.length;i++){
        //     System.out.println(newArr[i]);
        
        //foreach loop
        for (int data : newArr){
            System.out.println(data);
        }
        
    }
}