// Prime Number.
class PrimeNumber{
    public static void main(String[] args){
        int n, i, j;
        System.out.println("Prime number (1-25)");
        for(n = 2; n <= 25; n++){
            j = 0;
            if(n == 2){
                System.out.println(n);
            }
            else{
                for(i = 2; i < n; i++){
                    if(n % i == 0){
                        j = 1;
                        break;
                    }
                }
                if(j == 0){
                    System.out.println(i);
                }
            }
        }
    }
}



