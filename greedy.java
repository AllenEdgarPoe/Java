public class greedy{
    public static void main(String[] args){
        int cost = 73210;
        int count = 0;
        
        count+=cost/50000;
        cost-=cost/50000*50000;
        count+=cost/10000;
        cost-=cost/10000*10000;
        count+=cost/5000;
        cost-=cost/5000*5000;
        count+=cost/1000;
        cost-=cost/1000*1000;
        count+=cost/500;
        cost-=cost/500*500;
        count+=cost/100;
        cost-=cost/100*100;
        count+=cost/50;
        cost-=cost/50*50;
        count+=cost/10;
        cost-=cost/10*10;
        count+=cost/1;
        cost-=cost/1*1;
        

        System.out.print(count);

    }
}