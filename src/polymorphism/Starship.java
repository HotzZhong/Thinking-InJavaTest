package polymorphism;

import static operators.SimplePrint.*;

class AlertStatus {
	void alarm() {
		print("AlerStatus.alarm().");
	}
}

//�̳б����Ϊ�����
class AlertStatus1 extends AlertStatus {
	void alarm() {
		print("AlerStatus1.alarm().111111111");
	}
}

class AlertStatus2 extends AlertStatus {
	void alarm() {
		print("AlerStatus2.alarm().2222222222");
	}
}

class AlertStatus3 extends AlertStatus {
	void alarm() {
		print("AlerStatus3.alarm().3333333333");
	}
}

class StarshipChangState {
	//�ֶα��״̬�ϱ仯
	AlertStatus alert = new AlertStatus();

	void control() {
		alert.alarm();
	}

	void changeAlarm1() {
		alert = new AlertStatus1();
	}

	void changeAlarm2() {
		alert = new AlertStatus2();
	}

	void changeAlarm3() {
		alert = new AlertStatus3();
	}
}

public class Starship {
	public static void main(String[] args) {
		
		//����ָʾ���ֲ�ͬ״̬
		StarshipChangState scs = new  StarshipChangState();
		scs.control();
		
		scs.changeAlarm1();
		scs.control();
		
		scs.changeAlarm2();
		scs.control();
		
		scs.changeAlarm3();
		scs.control();

	}
}
