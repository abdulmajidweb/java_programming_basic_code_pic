//Add two number using 'continue' and 'break' statements.
class ContinueBreak{
    public static void main(String[] args){
        int a, b, sum;
        for(;;){
            a = 4;
            b = 2;
            if(a <=0 || b <=0){
                System.out.println("Wrong input. Please, Try again...");
                continue;
            }
            else{
                sum = a + b;
                System.out.println("The summation is = "+sum);
                break;
            }
        }
    }
}



