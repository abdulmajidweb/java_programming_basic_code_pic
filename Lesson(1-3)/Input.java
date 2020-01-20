import java.util.Scanner;
class Input{
    
    public static void main(String args[]){
        
        String a;
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter your name = ");
        a = input.nextLine();
        System.out.println("Welcome = " + a);
        int b;
        System.out.print("Please, enter a number = ");
        b = input.nextInt();
        System.out.println("You entered = " + b);
        
    }
}


