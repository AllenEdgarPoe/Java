package pbp;

import pbp.command.*;

public class Controller{
    private Viewer viewer;
    private Model model; 
    private CommandFactory commandFactory;
    
    //»ý¼ºÀÚ
    public Controller(){
        viewer = new Viewer();
        model = new Model();
        commandFactory = new CommandFactory();
    }

    //Method
    public void run(){
        //Start..
        viewer.hello();

        while(true){
            viewer.showMenu();
            String inputValue = viewer.InputMenuValue();

            if(inputValue.equals("q")) break;
            
            CommandAble command = commandFactory.getCommander(inputValue);
            
            // invalidValue();
            
            if (command != null)
            	command.excute(viewer,model);
            else
            	viewer.invalidValue();
            
            viewer.pause();

        
        }
        //End..
    
        viewer.goodbye();
        
    }
    private void input(){
    	String name = viewer.InputName();
        String number = viewer.InputNumber();
        String birth = viewer.InputBirth();

        model.InputPBData(name, number, birth);

        viewer.showResultInput();
        }
    
     private void getList(){
        PBData [] arrList = model.getList();
        viewer.showList(arrList);
        }
     
}
    

