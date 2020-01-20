//inheritance. signle inheritance. super class and sub class inheritance. lesson 5 page 118 and question 1
class Student{//super class
  int roll;
  String name;
  float mark;
}
class Result extends Student{//sub class
  public void getData(){
  roll = 1;
  name = "Ariful Islam";
  mark = 80.5f;
  }
  public void show(){
    System.out.println("Roll = " + roll);
    System.out.println("Name = " + name);
    System.out.println("Mark = " + mark);
  }
}
class Inheritance{
  public static void main(String agrs[]){
    Result ob = new Result();
    ob.getData();
    ob.show();
  }
}

