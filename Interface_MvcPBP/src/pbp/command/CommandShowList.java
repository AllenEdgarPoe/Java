package pbp.command;

import pbp.Model;
import pbp.Viewer;
import pbp.PBData;

public class CommandShowList implements CommandAble{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PBData [] arrList = model.getList();
        viewer.showList(arrList);

	}

}
