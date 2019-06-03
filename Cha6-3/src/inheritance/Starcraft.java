package inheritance;

public class Starcraft {
	public static void main(String[] args) {
		//Unit a = new Unit; ����. �ֳĸ� �߻� Ŭ������ new�� ���� �Ұ���
		Unit a; //������ �������� ���ؼ��� ���������� ���� ����.  
		
		
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
				Marine m = (Marine)arrUnit[i]; //arrUnit�� �������� ����ȯ
				m.steamPack();
			}
		}
		
	}

}
abstract class Unit{
	int hp;
	int speed;
	int ap; //attackPoint
	
	//�߻�ȭ
	abstract void attack(); //attack�̶�� ����� �ִٴ� ��. ��ӹ޾Ҵٴ� �� ������
	abstract void move(); 
	
	void stop() {
		System.out.println("������ ����ϴ�.");
	}
}

class Prove extends Unit{
	Prove(){
		hp = 40;
		speed = 3;
		ap = 1;
	}
	void attack() {
		System.out.println("���κ�� "+ap+"�� ���ݷ����� �����մϴ�.");
	}
	void move() {
		System.out.println("���κ�� "+speed+"�� ���ǵ�� �̵��մϴ�.");
	}
	
}
class Zealot extends Unit{
	Zealot(){
		hp = 100;
		speed = 5;
		ap = 10;
	}
	void attack() {
		System.out.println("������ "+ap+"�� ���ݷ����� �����մϴ�.");
	}
	void move() {
		System.out.println("���� "+speed+"�� ���ǵ�� �̵��մϴ�.");
	}
}
class Dragoon extends Unit{
	Dragoon(){
		hp = 150;
		speed = 7;
		ap = 20;
	}
	void attack() {
		System.out.println("����� "+ap+"�� ���ݷ����� �����մϴ�.");
	}
	void move() {
		System.out.println("��� "+speed+"�� ���ǵ�� �̵��մϴ�.");
	}
}

class Marine extends Unit{
	void attack() {
		System.out.println("");
	}
	void move() {
		
	}
	void steamPack() {
		System.out.println("SteamPack!!������ ���ٱ� �����߽��ϴ�!");
	}
}














