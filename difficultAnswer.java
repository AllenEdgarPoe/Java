public class difficultAnswer{
    public static void main(String[] args){
        int start = 1;
        int end = 10000;

        int count = 0;

        for (int i = start;i<=end;i++){
            int temp = i;

            while (temp>0){
                if(temp%10 == 8){
                    count++;
                }
                temp = temp/10;
            }
        }
    System.out.println(count);
    }
}