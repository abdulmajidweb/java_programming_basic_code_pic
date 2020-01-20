//Single inheritance
class Test{
	int roll;
	String name;
	int mark;
}
class Test2 extends Test{
	public void getData(){
		roll = 1;
		name = "Abdul Majid";
		mark = 98;
	}
	public void show(){
		System.out.println("Roll = " + roll + "\nName = " + name + "\nMark = " + mark);
	}
}
class Inheritance{
	public static void main(String[] args){
		Test2 ob = new Test2();
		ob.getData();
		ob.show();
	}
}


