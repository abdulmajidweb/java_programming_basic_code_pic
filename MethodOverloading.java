// method overloading
class Test{
	public void getData(int a, int b){
		int sum = a + b;
		System.out.println("The summation is = " + sum);
	}
	public void getData(int a, int b, int c){
		int sum = a + b + c;
		System.out.println("The summation is = " + sum);
	}
}
class MethodOverloading{
	public static void main(String[] args){
		System.out.println("Method overloading.\nFirst method");
		Test ob = new Test();
		ob.getData(2, 4);
		System.out.println("Overloading method");
		ob.getData(4, 6, 9);
	}
}