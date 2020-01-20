//Continue & Break statement
import java.util.Scanner;
class ContinueBreak{
	public static void main(String[] args){
		int num1, num2, sum;
		for(;;){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter first number = ");
			num1 = input.nextInt();
			System.out.print("Enter second number = ");
			num2 = input.nextInt();
			if(num1 <= 0 || num2 <= 0){
				System.out.println("Worng input. Please, input again.");
				continue;
			}else{
				sum = num1 + num2;
				System.out.println("The summation is = " + sum);
				break;
			}
		}
	}
}


