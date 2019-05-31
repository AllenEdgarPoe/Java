package pbp;

public class Controller{
    private Viewer viewer;
    private Model model; 

    public Controller(){
        viewer = new Viewer();
        model = new Model();
    }

    //Method
    public void run(){
        //Start..
        viewer.hello();

        while(true){
            viewer.showMenu();
            String inputValue = viewer.inputMenuValue();

            if(inputValue.equals("q")) break;

            switch(inputValue){
            case "1":
                input();
                break;
            case "2":
                break;
            case"3":
                break;
            case "4":
                break;
            case "5":
                break;
            default:
                viewer.invalidValue();
            }
            
            viewer.pause();

        }

        
        
        //End..
    
        viewer.goodbye();
    

        }
        private void input(){
            String name = viewer.showInputGuide();
            String number = viewer.InputNumber();
            String birth = viewer.InputNumber();

            model.InputPBData(name, number, birth);

            viewer.showResultInput();
        }
}
