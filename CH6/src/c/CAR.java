package c;

public class CAR {
    public static void main(String[] args){
            Car car1 = new Car();
            car1.model = "Ferari";
            car1.run(2);

    }

}
class Car{
    String model;
    int gasLimit;
    int speed;
    
    int gasLeft(int hour){
        int gasLeft = this.gasLimit;
        for(int i =0;i<=hour;i++){
            gasLimit -=i;
        
        }
        return gasLeft;
    }

    void run(int hour){
        System.out.println(gasLeft(hour));
    }


}