package Test_reusing.E15;
import reusing.E15;
public class TestForE15 extends E15 {
	static int i = 0;
	public TestForE15(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	//E15 e = new E15("9line:" + ++i );
	
	public void g(){
		this.wheel();
		 
	}
	public static void main(String[] args) {
		new TestForE15("16line:" + ++i ).wheel();
		new TestForE15("17line:" + ++i ).g();
		//e.wheel();
		/*
		 * �޷�ʹ�����淽�� ��Ϊ  �÷���Ϊprotected ֻ��ͬ������ ���� �̳��˸���
		 */
	}
}
