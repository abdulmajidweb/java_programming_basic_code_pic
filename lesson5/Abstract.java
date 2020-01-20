//abstract class and method
abstract class Student{
  int roll;
  String name;
  float mark;
  abstract void getData();
}
class Result extends Student{
  void getData(){
  roll = 1;
  name = "Ariful Islam";
  mark = 80.5f;
  }
  void show(){
    System.out.println("Roll = " + roll);
    System.out.println("Name = " + name);
    System.out.println("Mark = " + mark);
  }
}
class Abstract{
  public static void main(String agrs[]){
    Result ob = new Result();
    ob.getData();
    ob.show();
  }
}

