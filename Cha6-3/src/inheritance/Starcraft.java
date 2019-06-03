package inheritance;

public class Starcraft {
	public static void main(String[] args) {
		//Unit a = new Unit; 오류. 왜냐면 추상 클래스는 new로 생성 불가능
		Unit a; //하지만 다형성을 위해서는 참조변수는 생성 가능.  
		
		
		Unit [] arrUnit = new Unit[6];
		arrUnit[0] = new Marine();
		arrUnit[1] = new Prove();
		arrUnit[2] = new Prove();
		
		arrUnit[3] = new Zealot();
		arrUnit[4] = new Zealot();
		
		arrUnit[5] = new Dragoon();
		
		//Attack
		for(int i=0;i<arrUnit.length; i++) {
			arrUnit[i].attack();
		}
		//Use steampack
		for(int i = 0; i< arrUnit.length;i++) {
			if(arrUnit[i] instanceof Marine) {
				Marine m = (Marine)arrUnit[i]; //arrUnit을 마린으로 형변환
				m.steamPack();
			}
		}
		
	}

}
abstract class Unit{
	int hp;
	int speed;
	int ap; //attackPoint
	
	//추상화
	abstract void attack(); //attack이라는 기능이 있다는 뜻. 상속받았다는 걸 보여줌
	abstract void move(); 
	
	void stop() {
		System.out.println("유닛이 멈춥니다.");
	}
}

class Prove extends Unit{
	Prove(){
		hp = 40;
		speed = 3;
		ap = 1;
	}
	void attack() {
		System.out.println("프로브는 "+ap+"의 공격력으로 공격합니다.");
	}
	void move() {
		System.out.println("프로브는 "+speed+"의 스피드로 이동합니다.");
	}
	
}
class Zealot extends Unit{
	Zealot(){
		hp = 100;
		speed = 5;
		ap = 10;
	}
	void attack() {
		System.out.println("질럿은 "+ap+"의 공격력으로 공격합니다.");
	}
	void move() {
		System.out.println("질럿 "+speed+"의 스피드로 이동합니다.");
	}
}
class Dragoon extends Unit{
	Dragoon(){
		hp = 150;
		speed = 7;
		ap = 20;
	}
	void attack() {
		System.out.println("드라군은 "+ap+"의 공격력으로 공격합니다.");
	}
	void move() {
		System.out.println("드라군 "+speed+"의 스피드로 이동합니다.");
	}
}

class Marine extends Unit{
	void attack() {
		System.out.println("");
	}
	void move() {
		
	}
	void steamPack() {
		System.out.println("SteamPack!!마린이 날뛰기 시작했습니다!");
	}
}














