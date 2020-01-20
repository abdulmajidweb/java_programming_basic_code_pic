// 2 + 4 + 6 + ...... + N = ?
class Sum{
    public static void main(String[] args){
        int i, n = 100, sum = 0;
        for(i = 2; i <= 100; i = i + 2){
            sum = sum + i; 
        }
        System.out.println("The summation is = "+sum);
    }
}



