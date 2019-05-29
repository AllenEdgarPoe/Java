class P4{
    public static void main(String[] args){
        S1 sum = new S1();

        int a = 10;
        int b = 20;
        
        System.out.println(sum.plus(a,b));

    }
}
class S1{
    int value;

    int plus(int num1,int num2){
        num1 +=num2;
        value = num1;
        return value;
    }
}