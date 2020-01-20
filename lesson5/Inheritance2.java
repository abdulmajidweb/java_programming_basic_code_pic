//multi level inheritance and method overridden
class Student{
  int roll;
  String name;
  float mark;
}
class Result extends Student{
  public void getData(){ //overridden method
  roll = 1;
  name = "Ariful Islam";
  mark = 80.5f;
  }
  public void show(){ //overridden method
    System.out.println("Roll = " + roll);
    System.out.println("Name = " + name);
    System.out.println("Mark = " + mark);
    System.out.println("");
  }
}
class Result2 extends Result{
  public void getData(){
  roll = 2;
  name = "Ashik";
  mark = 95f;
  }
  public void show(){
    System.out.println("Roll = " + roll);
    System.out.println("Name = " + name);
    System.out.println("Mark = " + mark);
    System.out.println("");
  }
}
class Inheritance2{
  public static void main(String agrs[]){
    Result ob = new Result();
    ob.getData();
    ob.show();
    Result2 ob2 = new Result2();
    ob2.getData();
    ob2.show();
  }
}






