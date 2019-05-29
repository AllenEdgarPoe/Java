class P3{
    public static void main(String[] args){
        int v1 = 20;
        A test = new A();

        int v2 = test.sum(v1);
        test.sum(v2);
    }
}
class A{
    int sum;
    //attribute..

    //Constructor..
    
    //method 
    
    int sum(int value) {
        System.out.println("===starting summation===");
        value++;
        System.out.println(value);
        return value;
        

    }
    
}