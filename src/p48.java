public class p48 {

	public static void main(String[] args) {
		Car45 car1=new Car45("1����");
		car1.start();
		try {
			car1.join();				
		}
		catch(InterruptedException e) {				
		}
		System.out.println("����main()���B�z�u�@");
	}
}
