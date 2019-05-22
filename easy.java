public class easy{
    public static void main(String[] args){
        int sum = 0;
        for(int i=1;i<=1000;i++){
            if (i%2 ==0 && i%7 == 0){
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}