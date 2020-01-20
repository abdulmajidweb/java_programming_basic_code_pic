//Constructor 6 no question lesson 4 page 104 (programming in java)
class ClassTest2{
    int calculate;
    public ClassTest2(int a, int b){
        calculate = a + b;
        System.out.println("The summation is = " + calculate);
    }
    protected void sum(int a, int b, int c){
        calculate = a + b + c;
        System.out.println("The summation is = " + calculate);
    }
}
class Constructor{
    public static void main(String args[]){
        ClassTest2 ob = new ClassTest2(2, 4);
        ob.sum(3, 4, 5);
        
    }
}