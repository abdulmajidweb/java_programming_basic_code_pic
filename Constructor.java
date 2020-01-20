//constructor method
class Student{
	int roll;
	String name;
	int mark;
	public Student(){
		roll = 1;
		name = "Abdul Majid";
		mark = 99;
	}
	public void result(){
		System.out.println("Roll = " + roll + "\nName = " + name + "\nMark = " + mark);
	}
}
class Constructor{
	public static void main(String[] args){
		Student ob = new Student();
		ob.result();
	}
}


