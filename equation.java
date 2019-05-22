public class equation{
    public static void main(String[] args){
        int x_label = 2;
        int y_label = 4;
        int result = 10;

        for (int x=0;x<=10;x++){
            for (int y=0;y<=10;y++){
                if (x_label*x+y_label*y == result){
                    System.out.println("x="+x+", y="+y);
                }
            }
        }
    }
}