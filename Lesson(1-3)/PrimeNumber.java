// Prime Number.
class PrimeNumber{
    public static void main(String[] args){
        int n = 5, i, j = 0;
        if(n <= 1){
            System.out.println("This is not a prime number.");
        }
        else if(n == 2){
            System.out.println("This is a prime number.");
        }
        else{
            for(i = 2; i < n;i++){
                if(n % i == 0){
                    j = 1;
                    break;
                }
            }
            if(j == 0){
                System.out.println("This is a prime number.");
            }
            else{
                System.out.println("This is not a prime number.");
            }
        }
    }
}



