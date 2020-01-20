//multi Thread Programming and setPriority or getPriority using multiThread Programming
class A extends Thread{
	public void run(){
		for(int i = 1; i <= 5; i = i + 2){
			System.out.println("Inside Thread A: i = " + i);
		}
		System.out.println("Exit from A");
	}
}
class B extends Thread{
	public void run(){
		for(int i = 1; i <= 5; i = i + 2){
			System.out.println("Inside Thread B: i = " + i);
		}
		System.out.println("Exit from B");
	}
}
class MultiThread{
	public static void main(String[] args){
		A Th1 = new A();
		B Th2 = new B();
		Th1.setPriority(Thread.MIN_PRIORITY);
		Th2.setPriority(Th1.getPriority()+2);
		System.out.println("Starting Thread A");
		Th1.start();
		System.out.println("Starting Tread B");
		Th2.start();
	}
}