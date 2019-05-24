public class T1{
    public static void main(String[] args){
        int[][] arr = new int[5][5];
        int m =1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (i>=j){
                    arr[i][j] = m;
                    m+=1;
                }
                
            }
        }
        for(int i=0;i<arr.length;i++){
            String row = "";
            for(int j=0;j<arr[i].length;j++){
                row+=arr[i][j]+"\t";
            
            }
            System.out.println(row);
        }
    }
}