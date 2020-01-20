//mutiple interface
interface Student1{
    int roll1 = 1;
    String name1 = "Ariful Islam";
    void mark1();
}
interface Student2{
    int roll2 = 2;
    String name2 = "Nabir Hossain";
    void mark2();
}
class Result implements Student1, Student2{
    public void mark1(){
        System.out.println("Roll = " + roll1);
        System.out.println("Name = " + name1);
    }
    public void mark2(){
        System.out.println("Roll = " + roll2);
        System.out.println("Name = " + name2);
    }
    void show(float bangla, float english, float math){
        System.out.println("Bangla = " + bangla);
        System.out.println("English = " + english);
        System.out.println("Math = " + math);
        System.out.println("");
    }
}
class Interface2{
    public static void main(String[] args){
        Result ob = new Result();
        ob.mark1();
        ob.show(88, 99, 100);
        ob.mark2();
        ob.show(77, 88.5f, 77.5f);
    }
}


