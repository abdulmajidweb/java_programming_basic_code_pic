//how to define class, method and object
class ClassTest{ //class define
    int roll; //member variable decleration
    String name; //member variable decleration
    double mark; //member variable decleration
    public void GetData(){ // method decleration
        //body of method
        roll = 1;
        name = "Abdul Majid";
        mark = 89.5d;
        System.out.println("Name = " + name + ", Roll = " + roll + ", Mark = " + mark);
    }
    public static void main(String args[]){ //main method
        ClassTest ob = new ClassTest(); //object decleratoin
        ob.GetData(); //object with method call
    }
}