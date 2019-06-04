package pbp;
import java.util.*;
import pbp.command.*;

public class CommandFactory {
	
	private HashMap<String,CommandAble> map; //일종의 배열처럼 데이터를 차곡차곡 쌓는다.
	
	public CommandFactory(){
		map = new HashMap<String,CommandAble>(); //배열 생성
		
		map.put("1", new CommandInput());
		map.put("2", new CommandShowList());
		map.put("3", new CommandSearch());
		map.put("4", new CommandDelete());
	}
	
	public CommandAble getCommander(String command) {
		return map.get(command);
	}
}
