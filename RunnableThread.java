//Runnable Thread
class A implements Runnable{
	public void run(){
		for(int i = 1; i <= 5; i = i + 2){
			System.out.println("Inside Thread A: i = " + i);
		}
		System.out.println("Exit from A");
	}
}
class RunnableThread{
	public static void main(String[] args){
		A ob1 = new A();
		Thread Th1 = new Thread(ob1);
		System.out.println("Starting Thread A");
		Th1.start();
	}
}



