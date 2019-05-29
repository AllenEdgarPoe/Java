class P2{
    public static void main(String[] args){
        StudentData a1 = new StudentData("Lee","111",90);
      
        StudentData a2 = new StudentData("Park","222");

       
    }
}

class StudentData{
    //attribute..very important...
    String name; // class instance, restored in hip memory 
    String number;
    int score;
    
    //Constructor
    StudentData(String name, String number, int score){ //restored in stack memory
        //System.out.println(name+" has number of "+number+" and score is "+score);
        //System.out.println(name);
        this.name = name;
        this.number = number;
        this.score = score;
    }

    //method
    StudentData(String name, String number){
        System.out.println("test");
        this.name = name;
        this.number =number;
    }
}