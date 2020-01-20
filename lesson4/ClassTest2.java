//method overloading
class ClassTest2{
    int calculate;
    public void sum(int a, int b){
        calculate = a + b;
        System.out.println("The summation is = " + calculate);
    }
    public void sum(int a, int b, int c){
        calculate = a + b + c;
        System.out.println("The summation is = " + calculate);
    }
}
class Result{
    public static void main(String args[]){
        ClassTest2 ob = new ClassTest2();
        ob.sum(2, 3);
        ob.sum(3, 4, 5); 
    }
}

