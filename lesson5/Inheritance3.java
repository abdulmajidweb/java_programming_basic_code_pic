// hierarchical inheritance and method overridden
class Student{
    int roll;
    String name;
    float mark;
}
class Result1 extends Student{
  public void getData(){
    roll = 1;
    name = "Ariful Islam";
    mark = 80.5f;
  }
  public void show(){
    System.out.println("Roll = " + roll);
    System.out.println("Name = " + name);
    System.out.println("Mark = " + mark);
    System.out.println("");
  }
}
class Result2 extends Student{
  public void getData(){
    roll = 2;
    name = "Ashik";
    mark = 95.5f;
  }
  public void show(){
    System.out.println("Roll = " + roll);
    System.out.println("Name = " + name);
    System.out.println("Mark = " + mark);
    System.out.println("");
  }
}
class Result3 extends Student{
  public void getData(){
    roll = 3;
    name = "Sonnet";
    mark = 100f;
  }
  public void show(){
    System.out.println("Roll = " + roll);
    System.out.println("Name = " + name);
    System.out.println("Mark = " + mark);
    System.out.println("");
  }
}
class Result4 extends Student{
  public void getData(){
    roll = 4;
    name = "Nabir";
    mark = 99f;
  }
  public void show(){
    System.out.println("Roll = " + roll);
    System.out.println("Name = " + name);
    System.out.println("Mark = " + mark);
    System.out.println("");
  }
}
class Inheritance3{
  public static void main(String agrs[]){
    Result1 ob1 = new Result1();
    ob1.getData();
    ob1.show();
      
    Result2 ob2 = new Result2();
    ob2.getData();
    ob2.show();
      
    Result3 ob3 = new Result3();
    ob3.getData();
    ob3.show();
      
    Result4 ob4 = new Result4();
    ob4.getData();
    ob4.show();
  }
}