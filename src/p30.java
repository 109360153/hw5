public class p30 {

	public static void main(String[] args) {
		Car5 car1;
		car1=new Car5();
		try {
			car1.setCar(1234, -10.0);
		}
		catch(CarException e) {
			System.out.println("�ߥX"+e+"�F");
		}
		car1.show();
	}
}

class CarException extends Exception{
	
}

class Car5{
	private int num;
	private double gas;
	
	public Car5() {
		num=0;
		gas=0.0;
		System.out.println("�v�Ͳ��F�T��");
	}
	public void setCar(int n,double g)throws CarException{
		if(g<0) {
			CarException e=new CarException();
			throw e;
		}	else {
		num=n;
		gas=g;
		System.out.println("�����]��"+num+"�T�o�q�]��"+gas);
		}
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}