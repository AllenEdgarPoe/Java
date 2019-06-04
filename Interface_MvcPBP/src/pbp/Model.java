package pbp;

public class Model{
    private PBData[] arrData;
    private int count;

    public Model(){
        arrData = new PBData[100];
        count = 0;
    }

    //Method.. 
    public void InputPBData(String name, String number, String birth){
        
        arrData[count] = new PBData(name,number,birth);
        count++;
    
    }
    public PBData [] getList(){
        PBData [] returnList = arrData.clone();
        return returnList;
    }
    
}