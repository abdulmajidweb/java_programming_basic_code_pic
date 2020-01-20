//Copy/overloading constructor 7 no questoin (programming in java) lesson 4 page 104
class ClassTest2{
    int calculate;
    public ClassTest2(int a, int b){
        calculate = a + b;
    }
    public ClassTest2(){
        int num1 = 2;
        int num2 = 3;
        int num3 = 40;
        calculate = num1 + num2 + num3;
    }
    public void sum(){
        System.out.println("The summation is = " + calculate);
    }
}
class Constructor2{
    public static void main(String args[]){
        ClassTest2 ob1 = new ClassTest2(2, 4);
        ob1.sum();
        ClassTest2 ob2 = new ClassTest2();
        ob2.sum();
        
    }
}

