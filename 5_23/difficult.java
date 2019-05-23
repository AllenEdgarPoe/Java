public class difficult{
    public static void main(String[] args){
        // int count = 0;
        // // a number of 8
        // count += (int) 10000/10;
        // // a number of 80
        // count += (int) 10 * 10000/100;
        // // a number of 800
        // count += (int) 100 * 10000/1000;

        // count += (int) 1000 * 10000/10000;

        // System.out.print(count);

        int count = 0;
        int num = 10000;
        String strNum = Integer.toString(num);
        for(int i=1;i<=strNum.length()-1;i++){
            count+= (int) Math.pow(10,i-1) * (num/(Math.pow(10,i)));
        }
        System.out.print(count);

    }
}
