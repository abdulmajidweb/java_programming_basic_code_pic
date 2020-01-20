//copy constructor method
class Student{
	int roll;
	String name;
	int mark;
	public Student(){
		roll = 1;
		name = "Abdul Majid";
		mark = 99;
	}
	public Student(Student s){
		roll = s.roll;
		name = s.name;
		mark = s.mark;
	}
	public void result(){
		System.out.println("Roll = " + roll + "\nName = " + name + "\nMark = " + mark);
	}
}
class CopyConstructor{
	public static void main(String[] args){
		Student ob = new Student();
		ob.result();
		Student ob2 = new Student(ob);
		ob2.result();
	}
}





