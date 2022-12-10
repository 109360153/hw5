public class p48 {

	public static void main(String[] args) {
		Car45 car1=new Car45("1號車");
		car1.start();
		try {
			car1.join();				
		}
		catch(InterruptedException e) {				
		}
		System.out.println("結束main()的處理工作");
	}
}
