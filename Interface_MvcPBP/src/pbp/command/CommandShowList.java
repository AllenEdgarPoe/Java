package pbp.command;
import pbp.*;

public class CommandShowList implements CommandAble{
	public void excute(Viewer viewer, Model model) {
		// TODO Auto-generated method stub
		PBData [] arrList = model.getList();
        viewer.showList(arrList);
	}

}
