//interface lesson 6 page 129
interface Student{
    int roll = 1;
    String name = "Ariful Islam";
    void mark();
}
class Result implements Student{
    public void mark(){
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
    }
    void show(){
        float bangla = 80f;
        float english = 89f;
        float math = 99f;
        System.out.println("Bangla = " + bangla);
        System.out.println("English = " + english);
        System.out.println("Math = " + math);
    }
}
class Interface{
    public static void main(String[] args){
        Result ob = new Result();
        ob.mark();
        ob.show();
    }
}


